/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//================================================================
// Código del Cliente:
//================================================================
package example.hello;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Cliente 
{
    
    //private Cliente() {}
    public static void main(String[] args) 
    {
       long lngQuienSoy;
       long sumDeltaT, sumDeltaT2, dtMin = 0,dtMax = 0;
       long lngCuantosMilisFaltan;
       String cveAlumno,nomAlumno,apMatAlumno,apPatAlumno;
       String strSufAlumno;
       String strCadRes;
       boolean blnRes;
       long i,n,t0,t1,dt;
       boolean baja;
       //wssuma.MiWSuma_Service service = new wssuma.MiWSSuma_Service();
       String host = (args.length < 1) ? null : args[0];
       n = (args.length  >= 2) ? Long.parseLong(args[1]):20;
       baja= (args.length>=3);
       /*if(args.length==0){
           n=20;
       }
       else{
           n=Long.parseLong(args[0]);
       }
*/
      // n=200;
        try 
        {
             Registry registry = LocateRegistry.getRegistry(host);
             IServDisparo servDisparo = (IServDisparo) registry.lookup("ServidorDeDisparo");
             lngQuienSoy = servDisparo.quienSoy();
             lngCuantosMilisFaltan = servDisparo.deltaTEnMilis();
             System.out.println("Cliente " + lngQuienSoy + " faltan " + lngCuantosMilisFaltan  + " milisegundos");
             sumDeltaT  = 0;
             sumDeltaT2 = 0;
             //Hello stub = (Hello) registry.lookup("Hello");
             Thread.currentThread().sleep(lngCuantosMilisFaltan);
             cveAlumno="cte"+lngQuienSoy;
             nomAlumno="acte"+lngQuienSoy;
             apPatAlumno="apcte"+lngQuienSoy;
             apMatAlumno="amcte"+lngQuienSoy;  
             miWSBDAltas.NewWebService_Service service = new miWSBDAltas.NewWebService_Service();
             miWSBDAltas.NewWebService portA = service.getNewWebServicePort();
             for(i= 0; i < n; i++ )
             {
               
               t0 = System.currentTimeMillis();  
               strSufAlumno=""+i;
               blnRes=altaAlumno(cveAlumno+strSufAlumno,
                                nomAlumno+strSufAlumno,
                                apPatAlumno+strSufAlumno,
                                apMatAlumno+strSufAlumno,portA);
            
               t1 = System.currentTimeMillis();
               dt = t1 - t0;
               sumDeltaT  += dt;
               sumDeltaT2 += dt * dt;
               if( i == 0 )
               {
                   dtMin = dt;
                   dtMax = dt;
               }
               else
               {
                   if( dt < dtMin ) dtMin = dt;
                   if( dt > dtMax ) dtMax = dt;
               }
               System.out.println("Clte " + lngQuienSoy );
               strCadRes=blnRes?"Se ha realizado el alta de clave" + cveAlumno + strSufAlumno: "No se pudo realizar "+ "el alta de clave " + cveAlumno + strSufAlumno;
               System.out.print(strCadRes);
             }
             if (baja){
                 
                miWSBDBajas.Bajas_Service serviceB = new miWSBDBajas.Bajas_Service();
                miWSBDBajas.Bajas portB = serviceB.getBajasPort();
                blnRes=bajaLike(cveAlumno+"%", portB);
                strCadRes=blnRes?"Se ha realizado la baja like": "No se pudo realizar "+ "la bajaa (like) " + cveAlumno;
                 System.out.println(strCadRes);
             }
    
             servDisparo.acumula(sumDeltaT, sumDeltaT2, n, dtMax, dtMin);
          } 
          catch (Exception e)
          {
              System.err.println("Client exception: " + e.toString());
               e.printStackTrace();
           }
    }

    //private static int suma(int a, int b, wssuma.MiWSSuma_Service service) {
    //    wssuma.MiWSSuma port = service.getMiWSSumaPort();
    //    return port.suma(a, b);
    //}

    private static boolean altaAlumno(java.lang.String cveAlumno, java.lang.String nombreAlumno, java.lang.String apPaternoAlumno, java.lang.String apMaternoAlumno, miWSBDAltas.NewWebService port) {
        return port.altaAlumno(cveAlumno, nombreAlumno, apPaternoAlumno, apMaternoAlumno);
    }

    private static boolean bajaLike(java.lang.String cveAlumno, miWSBDBajas.Bajas port) {
        return port.bajaLike(cveAlumno);
    }

}
//================================================================

