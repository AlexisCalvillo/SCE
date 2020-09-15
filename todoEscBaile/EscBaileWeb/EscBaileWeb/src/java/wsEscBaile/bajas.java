/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsEscBaile;

import escdebaile.ClsGestorEscBaile;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author aalex
 */
@WebService(serviceName = "bajas")
public class bajas {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bajaEq")
    public boolean bajaEq(@WebParam(name = "cveAlumno") String cveAlumno) {
        String[] arrStrNomCampos={"clvAlumno"};
        String[] arrStrValCampos={""};
         boolean blnRes = false;
        //
        // ¿cómo evitar esta creación de objeto cada vez que recibe una solicitud?
        //
        ClsGestorEscBaile  gestor = new ClsGestorEscBaile();
        boolean conectado = gestor.conectaBD("rafa","rafa");
    
        if( conectado )
        {             
          arrStrValCampos[0] = cveAlumno;
          blnRes = gestor.bajaAlumno(arrStrNomCampos,arrStrValCampos,1);
        
        }    
        
        return blnRes;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bajaLike")
    public boolean bajaLike(@WebParam(name = "cveAlumno") String cveAlumno) {
        String[] arrStrNomCampos={"clvAlumno"};
        String[] arrStrValCampos={""};
         boolean blnRes = false;
        //
        // ¿cómo evitar esta creación de objeto cada vez que recibe una solicitud?
        //
        ClsGestorEscBaile  gestor = new ClsGestorEscBaile();
        boolean conectado = gestor.conectaBD("rafa","rafa");
    
        if( conectado )
        {             
          arrStrValCampos[0] = cveAlumno;
          blnRes = gestor.bajaAlumno(arrStrNomCampos,arrStrValCampos,0);
        
        }    
        
        return blnRes;
    }

    
}
