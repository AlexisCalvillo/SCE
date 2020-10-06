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
       String host = (args.length < 1) ? null : args[0];
       n = (args.length >= 2) ? Long.parseLong(args[1]):20;
       /*if(args.length==0){
           n=20;
       }
       else{
           n=Long.parseLong(args[0]);
       }
*/
      // n=200;
        wsexponeejb.WSExponeEJB_Service service = new wsexponeejb.WSExponeEJB_Service();
        wsexponeejb.WSExponeEJB port = service.getWSExponeEJBPort();
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
             
             for(i= 0; i < n; i++ )
             {
               a=(int)(100 - 200*Math.random());
               b=(int)(100 - 200*Math.random());
               c=obtenSuma(a,b,port);
               t0 = System.currentTimeMillis();  
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
               System.out.println("Con el estresador: " + obtenResultado(port));
             }
             servDisparo.acumula(sumDeltaT, sumDeltaT2, n, dtMax, dtMin);
          } 
          catch (Exception e)
          {
              System.err.println("Client exception: " + e.toString());
               e.printStackTrace();
           }
    }

    private static int obtenSuma(int a, int b,wsexponeejb.WSExponeEJB port ) {
        return port.obtenSuma(a, b);
    }

    private static String obtenResultado(wsexponeejb.WSExponeEJB port) {
        return port.obtenResultado();
    }

  

}
//================================================================

