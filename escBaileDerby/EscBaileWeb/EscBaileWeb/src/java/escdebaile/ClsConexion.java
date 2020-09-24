package escdebaile;

import java.sql.*;
import java.util.*;
import com.healthmarketscience.jackcess.*;
import java.io.File;
import java.io.IOException;
import net.ucanaccess.jdbc.UcanaccessDriver;
import org.apache.derby.jdbc.ClientDriver;
/*
 * ClsConexion.java
 */

/**
 *
 * @author  Rafael G. Gamboa Hirales
 */
public class ClsConexion
{
    //El objeto conexión sirve para proteger y poder modificar con modularidad. 
    //C
    Connection          con      = null;
    String              strUID   = null;
    String              strURL   = null;
    String              strNomDB = null;
    Database            db       = null;
// ---------------------------------------------------------------------------    
    /** Creates a new instance of ClsConexion */
    public ClsConexion(String strNomDB )
    {
        // no se conecta, solamente crea el objeto
        //Crea el objeto según el tipo de base de datos, se cambia la extensión
        //this.strNomDB = strNomDB + ".accdb";
        //Conexión de derby
        this.strNomDB=strNomDB;
    }
    
    public boolean conectate( String unUID, String unPwd )
    {
        strUID = unUID;
        String strSel = "Select contrasenha from tblUsuarios where clvUsuario = '" 
                        + unUID + "'";
        boolean res = false;
        
        try
        {
            //De la misma manera, se tiene que que cambiar el tipo de base de 
            //datos, se puede observar una DSN y no una ACCESS 
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //con = DriverManager.getConnection( "jdbc:odbc:" + 
            //                                    strDSN, "", "");
            //Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); /* often not required for Java 6 and later (JDBC 4.x) */
            //con = DriverManager.getConnection("jdbc:ucanaccess://" + this.strNomDB);  
            //Conexión con Derby
            //Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            //Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection(this.strNomDB,"rafa","rafa");  
           
            //
            // Si todo va bien, verifica el unID y unPwd
            // (Realmente por medio del API a LDAP o venir ya autenticado e impersonalizado vía el perfil del usuario)
            //
            
            ResultSet rs = this.obtenRegSelect(strSel);
            if( rs.next() )
            {
              String strContrasenha = rs.getString(1);  
              if( strContrasenha.compareTo(unPwd ) == 0 )
                  res = true;
              else
              {
               con.close();
               con = null;
              }
            }
            else
            {
              con.close();
              con = null;
            }
        }
        catch( Exception e )
        { 
           // eliminar el despliegue de esta exepción, mandarlo a un log y relanzar la exepción. 
           e.printStackTrace();
           System.out.println(
                    "Can't open file \"" + strNomDB + "\". Check if it permitted by security settings of path/file.\nMore info:\n" + e + " Error");
           con = null;
        }
        return res;
    }
// ---------------------------------------------------------------------------    
    public boolean conectado() { return con != null; }
// ---------------------------------------------------------------------------    
    public java.sql.ResultSet obtenRS( String strTV )
    {
        return obtenRegSelect( "Select * FROM " + strTV );
    }
// ---------------------------------------------------------------------------    
   public ResultSet obtenRS( String strTV, 
                                             java.util.TreeMap<String,ClsCampoBD> colCampos)
   {
      String strSelect = "",
             strWhere  = "";
      ClsCampoBD campo;
     // java.util.Iterator it = colCampos.entrySet().iterator();
      
      java.sql.ResultSet rs = null;
      
      strSelect = ClsConexion.cadenaSelect(colCampos) + " FROM " + strTV;
      strWhere  = ClsConexion.cadenaWhere(colCampos);
      
      if( strWhere.length() > 0 )
          strSelect = strSelect + " Where " + strWhere;
      
      rs = obtenRegSelect( strSelect );
      
      return rs; 
   }
// ---------------------------------------------------------------------------    
   public ResultSet obtenRegSelect( String strSelect )
   {
       java.sql.ResultSet rs = null;
       java.sql.Statement st = null;
       try
       {
           st = con.createStatement();  
           rs = st.executeQuery( strSelect );
       }
       catch(Exception e )
       {
           e.printStackTrace();
           rs = null;
       }
       
       return rs;
   }
// ---------------------------------------------------------------------------    
   public String obtenCadenaInsertRs(String strTv, java.sql.ResultSet rs )
   {
       String                     strRes = "";
       java.sql.ResultSetMetaData rsmd   = null;
       int n,nCol,i;
       String strTipoDato[];
       java.util.TreeMap<String,ClsCampoBD> campos;
       
       try
       {
           rsmd = rs.getMetaData();
           campos=obtenMapaCampos(rs);
           nCol = campos.size();
           strRes="CREATE TABLE " +strTv + "(\n ";
           for(ClsCampoBD campo:campos.values())
               strRes+= campo.nombre + " " + campo.codificaTipo(campo.tipo)+ ",\n";
           strRes=strRes.substring(0,strRes.length()-2)+ "),\n";
               //strRes += rsmd.getColumnName(i) + " de tipo " + rsmd.getColumnTypeName(i)+"\n";
               
           strRes += '\n';
           strRes+= "INSERT INTO " + strTv + "VALUES\n";
           n = 0;
           while( rs.next() )
           {
               n++;
               strRes += "(";
               for( ClsCampoBD campo:campos.values() )
                  strRes += campo.codificaDato(rs.getString(campo.nombre)) + ",";
               strRes=strRes.substring(0,strRes.length()-1)+ "),\n";
           }
           strRes=strRes.substring(0,strRes.length()-2)+";";
       }
       catch(Exception e )
       {
           e.printStackTrace();
       }
       
       return strRes;
   }
// --------------------------------------------------------------------------- 
   public java.util.TreeMap<String,ClsCampoBD> obtenMapaCampos( java.sql.ResultSet rs )
   {
       java.util.TreeMap<String,ClsCampoBD>  arbolCampos   = new java.util.TreeMap<String,ClsCampoBD>();
       ResultSetMetaData  rsmd          = null;
       ClsCampoBD         campo         = null;
       String             strNomCampo   = null, 
                          strTipoCampo  = null;
       
       int nCol,i;
       
       try
       {
           
           rsmd = rs.getMetaData();
           nCol = rsmd.getColumnCount();
           for( i = 1; i<=nCol; i++ )
           { 
              
              strNomCampo   = rsmd.getColumnName(i);
              strTipoCampo  = rsmd.getColumnTypeName(i);
              campo = new ClsCampoBD(strNomCampo, "", strTipoCampo, "" );
              arbolCampos.put(strNomCampo, campo );
           }
              
       }
       catch(Exception e )
       {
           e.printStackTrace();
       }
       
       return arbolCampos;
  
   }
// --------------------------------------------------------------------------- 
   public static String cadenaWhere( java.util.TreeMap<String,ClsCampoBD> colCampos )
   {
       String strWhere = "";
       ClsCampoBD campo;
       java.util.Iterator it = colCampos.entrySet().iterator();
       boolean primero = true;
          
       while( it.hasNext())
       {
          campo =  (ClsCampoBD)((Map.Entry) (it.next())).getValue();
          if( campo.valWhere.length() > 0 )
          {
             if( !primero ) strWhere += " AND "; 
             strWhere += "(" + campo.nombre + " = " + 
                          campo.codificaDato( campo.valWhere ) + ")";
             primero = false;
          }
       }
       return strWhere;
   }
   // --------------------------------------------------------------------------- 
   public static String cadenaLike( java.util.TreeMap<String,ClsCampoBD> colCampos )
   {
       String strWhere = "";
       ClsCampoBD campo;
       java.util.Iterator it = colCampos.entrySet().iterator();
       boolean primero = true;
          
       while( it.hasNext())
       {
          campo =  (ClsCampoBD)((Map.Entry) (it.next())).getValue();
          if( campo.valWhere.length() > 0 )
          {
             if( !primero ) strWhere += " AND "; 
             strWhere += "(" + campo.nombre + " like " + 
                          campo.codificaDato( campo.valWhere ) + ")";
             primero = false;
          }
       }
       return strWhere;
   }
// ---------------------------------------------------------------------------        
   public static String cadenaSelect( java.util.TreeMap<String,ClsCampoBD> colCampos )
   {
       String strSelect = "";
       ClsCampoBD campo;
       java.util.Iterator it = colCampos.entrySet().iterator();
       boolean primero = true;
      
       while( it.hasNext())
       {
          //Object obj = it.next();
          //System.out.println( obj.getClass().getName() );
          campo =  (ClsCampoBD)((Map.Entry) (it.next())).getValue();
          if( campo.nombre.length() > 0 )
          {
             if( campo.nombre == "*" )
             {
                 strSelect = "*";
                 break;
             }
             if( !primero ) strSelect += ','; 
             strSelect += campo.nombre;
             primero = false;
          }
       }
 
        return "Select " + strSelect;
   }
// ---------------------------------------------------------------------------    
   public boolean insertaReg(String strTV, java.util.TreeMap<String,ClsCampoBD> colCampos )
   {
       String      strCampos =  "Insert into " + strTV + " (";
       String      strValores  = " Values (";
       String      strInsertar;
       int          k = 0;
       boolean blnRes        = false;
       
       ClsCampoBD campo;
       java.util.Iterator it = colCampos.entrySet().iterator();
       boolean primero = true;
      
       while( it.hasNext())
       {
          campo =  (ClsCampoBD)((Map.Entry) (it.next())).getValue();
          if( campo.valor.length() > 0 )
          {
             if( !primero )
             { 
                 strCampos += ", ";
                 strValores += ", ";
             }
             strCampos += campo.nombre;
             strValores += campo.codificaDato( campo.valor );
             primero = false;
          }
       }
       strCampos  += ")";
       strValores += ")";
       
       strInsertar = strCampos + strValores;
       System.out.println( strInsertar );
       
       try
       {
          Statement s = con.createStatement();
          k = s.executeUpdate(strInsertar);
          s.close();
       }
       catch( Exception e )
       {
           e.printStackTrace();
       }
       return  k>0 ;
    
   }
// --------------------------------------------------------------------------  
   public boolean modificaReg(String strTV, java.util.TreeMap<String,ClsCampoBD> colCampos )
   {
       String      strCampos   = "Update " + strTV + " set ";
       
       String      strWhere    = " Where ( ";
       String      strModiReg;
       int          k = 0;
       boolean blnRes        = false;
       
       ClsCampoBD campo;
       java.util.Iterator it = colCampos.entrySet().iterator();
       boolean primero = true;
      
       while( it.hasNext())
       {
          campo =  (ClsCampoBD)((Map.Entry) (it.next())).getValue();
          if( campo.valor.length() > 0 )
          {
             if( !primero )
             { 
                 strCampos += ", ";
             }
             strCampos += campo.nombre + "=";
             strCampos += campo.codificaDato( campo.valor );
             primero = false;
          }
       }
     
       strWhere   += ClsConexion.cadenaWhere(colCampos) + ")";
      
      if( strWhere.length() > 0 )
          strCampos += strWhere; 
       
       System.out.println( strCampos );
       
       try
       {
          java.sql.Statement s = con.createStatement();
         k = s.executeUpdate(strCampos);
          s.close();
       }
       catch( Exception e )
       {
           e.printStackTrace();
       }
       return  k > 0 ;
    
   }
// --------------------------------------------------------------------------  
   
   public String impRS( java.sql.ResultSet rs )
   {
       String                     strRes = "";
       java.sql.ResultSetMetaData rsmd   = null;
       int n,nCol,i;
       try
       {
           rsmd = rs.getMetaData();
           nCol = rsmd.getColumnCount();
           for( i = 1; i<=nCol; i++ )
               strRes += rsmd.getColumnName(i) + " ";
           strRes += '\n';
           n = 0;
           while( rs.next() )
           {
               n++;
               strRes += n + " ";
               for( i = 1; i<=nCol; i++ )
                  strRes += rs.getString(i) + " ";
               strRes += '\n';
           }
       }
       catch(Exception e )
       {
           e.printStackTrace();
       }
       
       return strRes;
   }
   // ---------------------------------------------------------------------------    
   public boolean eliminaRegs( String strTV, 
                                             java.util.TreeMap<String,ClsCampoBD> colCampos, int opc)
   {
      String strDelete = "",
             strWhere  = "";
      ClsCampoBD campo;
      int k = 0;
            
      strDelete = "Delete  FROM " + strTV;
      if (opc==0)
          strWhere  = ClsConexion.cadenaLike(colCampos);
      else
          strWhere  = ClsConexion.cadenaWhere(colCampos);
      
      
      if( strWhere.length() > 0 )
          strDelete += " Where " + strWhere;
          
      System.out.println( strDelete);    
       try
       {
          java.sql.Statement s = con.createStatement();
          k = s.executeUpdate(strDelete);
          s.close();
       }
       catch( Exception e )
       {
           e.printStackTrace();
       }
       return  k > 0 ;
    
   }
// ---------------------------------------------------------------------------    
  public void cierraCon()
   {
       try
       {
           con.close();
       }
       catch( Exception e )
       {
           e.printStackTrace();
       }
   }
// ---------------------------------------------------------------------------    
// ---------------------------------------------------------------------------    
    public static void main(String[] args)
    {
       //System.out.println("Hola...");
        int intPrueba[] = {1,5,4,6,2,7,2,8,9};
        int i,n = 2;
        ResultSet r = null;
        java.util.TreeMap<String,ClsCampoBD> colCampos = null;
        
        //String strLocBD = "C:\\Users\\aalex\\Documents\\NetBeansProjects\\SCE\\todoEscBaile\\EscBaileWeb\\EscBaileWeb\\EscDeBaile";
        String strLocBD ="jdbc:derby://localhost:1527/EscDeBaile";              
        try
        {
           ClsConexion c = new ClsConexion(strLocBD);
           c.conectate("rafa","rafa");
           if( c.conectado() )    
           {
                for( i = 0; i < n; i++ ){
                switch( intPrueba[i] )
                {
                  case 1:  
                         r = c.obtenRS("tblAlumnos");
                         if( r != null )
                         {
                           System.out.println(c.impRS(r));
                         }
                         else
                             System.out.println(
                                "No se pudo recuperar el ResultSet...");  
                         break;
                  case 2:
                         r = c.obtenRS("tblAlumnos");
                         colCampos = c.obtenMapaCampos(r);
                         r = c.obtenRS("tblAlumnos",colCampos );
                         //System.out.println(c.obtenCadenaInsertRs(r));
                         break;
                  case 3:
                         r = c.obtenRS("tblAlumnos");
                         colCampos = c.obtenMapaCampos(r);
                         colCampos.put("*",new ClsCampoBD("*","","","")); 
                         r = c.obtenRS("tblAlumnos",colCampos );
                         //System.out.println(c.obtenCadenaInsertRs(r));
                         break;
                 case 4:
                         colCampos = new TreeMap<String,ClsCampoBD>();
                         colCampos.put("2_apPaterno",
                                                    new ClsCampoBD("apPaterno","",ClsCampoBD.TIPO_VARCHAR,"")); 
                         colCampos.put("1_clvAlumno",new ClsCampoBD("clvAlumno","","","")); 
                         r = c.obtenRS("tblAlumnos",colCampos );
                         //System.out.println(c.obtenCadenaInsertRs(r));
                         break;
                   case 5:
                         colCampos = new TreeMap<String,ClsCampoBD>();
                         colCampos.put("apMaterno",
                                        new ClsCampoBD("apMaterno","apMaternoNo.x " + i,ClsCampoBD.TIPO_VARCHAR,"")); 
                         colCampos.put("apPaterno",
                                        new ClsCampoBD("apPaterno","apPaternoNo.x " + i,ClsCampoBD.TIPO_VARCHAR,"")); 
                         colCampos.put("nombre",
                                        new ClsCampoBD("nombre","Númerox "+ i,ClsCampoBD.TIPO_VARCHAR,"")); 
                         colCampos.put("clvAlumno",new ClsCampoBD("clvAlumno","1000"+i,ClsCampoBD.TIPO_VARCHAR,"")); 
                         //c.insertaReg("tblAlumnos",colCampos );
                         //System.out.println(c.impRS(r));
                         break;
                   case 6:
                         colCampos = new TreeMap<String,ClsCampoBD>();
                         colCampos.put("apPaterno",
                                        new ClsCampoBD("apPaterno","apPaternoModificado" ,ClsCampoBD.TIPO_VARCHAR,"apPaternoNo. 1")); 
                         colCampos.put("apMaterno",
                                        new ClsCampoBD("apMaterno","apMaternoModificado" ,ClsCampoBD.TIPO_VARCHAR,"apMaternoNo. 1")); 
                         colCampos.put("nombre",
                                        new ClsCampoBD("nombre","",ClsCampoBD.TIPO_VARCHAR,"Número 1")); 
                         colCampos.put("clvAlumno",new ClsCampoBD("clvAlumno","2525",ClsCampoBD.TIPO_VARCHAR,"10001")); 
                         c.modificaReg("tblAlumnos",colCampos );
                         System.out.println(c.impRS(r));
                         break;
                   case 7:
                         colCampos = new TreeMap<String,ClsCampoBD>();
                         colCampos.put("apPaterno",
                                        new ClsCampoBD("apPaterno", "",ClsCampoBD.TIPO_VARCHAR,"apPaternoModificado")); 
                         colCampos.put("apMaterno",
                                        new ClsCampoBD("apMaterno","" ,ClsCampoBD.TIPO_VARCHAR,"apMaternoModificado")); 
                         colCampos.put("nombre",
                                        new ClsCampoBD("nombre","",ClsCampoBD.TIPO_VARCHAR,"Número 1")); 
                         colCampos.put("clvAlumno",new ClsCampoBD("clvAlumno","",ClsCampoBD.TIPO_VARCHAR,"2525")); 
                         c.eliminaRegs("tblAlumnos",colCampos,1 );
                         System.out.println(c.impRS(r));
                         break;
                   case 8:
                         colCampos=new TreeMap<String, ClsCampoBD>();
                         colCampos.put("clvAlumno",new ClsCampoBD("clvAlumno","",ClsCampoBD.TIPO_VARCHAR,"cveAl_*"));
                         c.eliminaRegs("tblAlumnos",colCampos,0);
                           break;
                           
                   case 9:
                         r = c.obtenRS("tblAlumnosXGrupo");
                         colCampos = c.obtenMapaCampos(r);
                         r = c.obtenRS("tblAlumnosXGrupo",colCampos );
                         System.out.println(c.obtenCadenaInsertRs("tblAlumnos", r));
                           break;
                }
               }
               
               
             c.cierraCon();
               System.out.println("Se cerró la conexión a la BD");
           }
           else
           {
              System.out.println("No se pudo conectar..."); 
           }
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
       
    }
// ---------------------------------------------------------------------------        
}
