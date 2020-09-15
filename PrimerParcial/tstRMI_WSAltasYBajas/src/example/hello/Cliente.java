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
       boolean borra;
       String cveAlumno,nomAlumno,apMatAlumno,apPatAlumno;
       String strSufAlumno;
       String strCadRes;
       boolean blnRes;
       long i,n,t0,t1,dt;
       String host = (args.length < 1) ? null : args[0];
       n = (args.length >= 2) ? Long.parseLong(args[1]):20;
       //Ejercicio 3
       long tiempoEspera=args.length>=3?Long.parseLong(args[2]):250;
       borra=args.length==4? Boolean.parseBoolean(args[3]):false;
        try 
        {
             Registry registry = LocateRegistry.getRegistry(host);
             IServDisparo servDisparo = (IServDisparo) registry.lookup("ServidorDeDisparo");
             lngQuienSoy = servDisparo.quienSoy();
             lngCuantosMilisFaltan = servDisparo.deltaTEnMilis();
             System.out.println("Cliente " + lngQuienSoy + " faltan " + lngCuantosMilisFaltan  + " milisegundos");
             sumDeltaT  = 0;
             sumDeltaT2 = 0;
             Thread.currentThread().sleep(lngCuantosMilisFaltan);
             //==================================================
             //==================================================
             //==================================================
             //Ejercicio 2
             //==================================================
             //==================================================
             //==================================================
             miWSBDAltas.NewWebService_Service service = new miWSBDAltas.NewWebService_Service();
             miWSBDAltas.NewWebService port = service.getNewWebServicePort();
             cveAlumno="E_"+String.format("%03d",lngQuienSoy)+"_";
             nomAlumno="acte"+String.format("%03d",lngQuienSoy)+"_";
             apPatAlumno="apcte"+String.format("%03d",lngQuienSoy)+"_";
             apMatAlumno="amcte"+String.format("%03d",lngQuienSoy)+"_";
               
             for(i= 0; i < n; i++ )
             {
               
               t0 = System.currentTimeMillis();
               blnRes=altaAlumno(cveAlumno+String.format("%04d",i),
                                nomAlumno+String.format("%04d",i),
                                apPatAlumno+String.format("%04d",i),
                                apMatAlumno+String.format("%04d",i),
                                port);
               Thread.currentThread().sleep(tiempoEspera);
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
               strCadRes=blnRes?"Se ha realizado el alta de clave" + cveAlumno + String.format("%04d",i) : "No se pudo realizar "+ "el alta de clave " + cveAlumno + String.format("%04d",i);
               System.out.print(strCadRes);
             }
             if(borra){
                strCadRes=bajaLike(cveAlumno)?"Se ha realizado la baja like": "No se pudo realizar "+ "la bajaa (like) " + cveAlumno;
                
             }
             else{
                strCadRes="No se requiere baja"; 
             }
             System.out.print(strCadRes);
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

    private static boolean altaAlumno(java.lang.String cveAlumno, java.lang.String nombreAlumno, java.lang.String apPaternoAlumno, java.lang.String apMaternoAlumno,miWSBDAltas.NewWebService port) {
        return port.altaAlumno(cveAlumno, nombreAlumno, apPaternoAlumno, apMaternoAlumno);
    }

    private static boolean bajaLike(java.lang.String cveAlumno) {
        miWSBDBajas.Bajas_Service service = new miWSBDBajas.Bajas_Service();
        miWSBDBajas.Bajas port = service.getBajasPort();
        return port.bajaLike(cveAlumno);
    }

}
//================================================================

