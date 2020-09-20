/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poblarbd_db;

import java.sql.ResultSet;


/**
 *
 * @author aalex
 */
public class PoblarBD_DB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ResultSet r = null;
        String resultadoTot="CONNECT 'jdbc:derby://localhost:1527/EscDeBaile;user=rafa;password=rafa';\n";
        
        java.util.TreeMap<String,ClsCampoBD> colCampos = null;
        String[] strTb;
        if(args.length!=0)
            strTb=args;
        else
            strTb=new String[]{"tblAlumnos","tblAlumnosXGrupo","tblBailes","tblGrupos","tblNiveles","tblPagosaProfesores","tblProfesores","tblUsuarios"};
        String strLocBD = "C:\\Users\\aalex\\Documents\\NetBeansProjects\\SCE\\escBaileDerby\\PoblarBD_DB\\EscDeBaile";
        try
        {
           ClsConexion c = new ClsConexion(strLocBD);
           c.conectate("rafa","rafa");
           if( c.conectado() )    
           {
               for(int i=0;i<strTb.length;i++){
                   r = c.obtenRS(strTb[i]);
                   colCampos = c.obtenMapaCampos(r);
                   r = c.obtenRS(strTb[i],colCampos );
                   resultadoTot+=c.obtenCadenaInsertRs(strTb[i], r);
               }
           }
           c.cierraCon();
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
        resultadoTot+="\n show tables; \n exit;";
        System.out.println(resultadoTot);
    }
    
}
