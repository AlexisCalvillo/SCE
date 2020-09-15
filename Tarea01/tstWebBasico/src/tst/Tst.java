/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst;

/**
 *
 * @author aalex
 */
public class Tst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c,n;
        wssuma.MiWSSuma_Service service = new wssuma.MiWSSuma_Service();
        if(args.length==0){
            n=20;
        }
        else{
            n=Integer.parseInt(args[0]);
        }
        for(int i=1; i<=n; i++){
            a=(int)( Math.random()*100);
            b=(int)( Math.random()*100);
            c=suma(a,b,service);
            System.out.println("La suma de " + a + " + " + b + " es: " + c );
        }
    }

    private static int suma(int a, int b, wssuma.MiWSSuma_Service service) {
        wssuma.MiWSSuma port = service.getMiWSSumaPort();
        return port.suma(a, b);
    }
    
}
