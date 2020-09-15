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
       int a,b,c;
       long i,n,t0,t1,dt;
       wssuma.MiWSSuma_Service service = new wssuma.MiWSSuma_Service();
       String host = (args.length < 1) ? null : args[0];
       n = (args.length == 2) ? Long.parseLong(args[1]):20;
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
             wssuma.MiWSSuma port = service.getMiWSSumaPort();
             for(i= 0; i < n; i++ )
             {
               a=(int)( Math.random()*100);
               b=(int)( Math.random()*100);
               t0 = System.currentTimeMillis();  
               c = suma(a,b,port);
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
               System.out.print("    La suma de " + a + " + " + b + " es: " + c +"\n");
             }
             servDisparo.acumula(sumDeltaT, sumDeltaT2, n, dtMax, dtMin);
          } 
          catch (Exception e)
          {
              System.err.println("Client exception: " + e.toString());
               e.printStackTrace();
           }
    }

    private static int suma(int a, int b, wssuma.MiWSSuma port) {
        return port.suma(a, b);
    }

}
//================================================================

