/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsexponeejb;

import ejb.MySessionRemote;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author aalex
 */
@WebService(serviceName = "WSExponeEJB")
public class WSExponeEJB {

    @EJB
    private MySessionRemote mySession;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenResultado")
    public String obtenResultado() {
        //TODO write your implementation code here:
        return "Este es el resultado obtenido por " + mySession.getResult();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenSuma")
    public int obtenSuma(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return mySession.sumaN(a, b);
    }
    
    
}
