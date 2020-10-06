/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojotstejb;

/**
 *
 * @author aalex
 */
public class PojoTstEJB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int N,a,b;
       N=100;
        System.out.println(obtenResultado());
        for (int i = 0; i < N; i++) {
            a=(int)(100*(-1+2*Math.random()));
            b=(int)(100*(-1+2*Math.random()));
            System.out.println(i + " la suma de " + a + " + " + b+ " es: "+obtenSuma(a,b));
        }
    }
    private static int obtenSuma(int a, int b) {
        wsexponeejb.WSExponeEJB_Service service = new wsexponeejb.WSExponeEJB_Service();
        wsexponeejb.WSExponeEJB port = service.getWSExponeEJBPort();
        return port.obtenSuma(a, b);
    }

    private static String obtenResultado() {
        wsexponeejb.WSExponeEJB_Service service = new wsexponeejb.WSExponeEJB_Service();
        wsexponeejb.WSExponeEJB port = service.getWSExponeEJBPort();
        return port.obtenResultado();
    }
    
}
