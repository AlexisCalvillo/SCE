/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsEscBaile;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import escdebaile.ClsGestorEscBaile;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author rafael
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

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
    @WebMethod(operationName = "altaAlumno")
    public boolean altaAlumno(@WebParam(name = "cveAlumno") String cveAlumno, @WebParam(name = "nombreAlumno") String nombreAlumno, @WebParam(name = "apPaternoAlumno") String apPaternoAlumno, @WebParam(name = "apMaternoAlumno") String apMaternoAlumno) {
        //
        // habilitar el alta de alumno
        //
        String arrStrNomCampos[] = {"clvAlumno","apPaterno","apMaterno","nombre"};
        String arrStrValCampos[] = new String[4];
        
        boolean blnRes = false;
        //
        // ¿cómo evitar esta creación de objeto cada vez que recibe una solicitud?
        //
        ClsGestorEscBaile  gestor = new ClsGestorEscBaile();
        boolean conectado = gestor.conectaBD("rafa","rafa");
    
        if( conectado )
        {             
          arrStrValCampos[0] = cveAlumno;
          arrStrValCampos[1] = apPaternoAlumno;
          arrStrValCampos[2] = apMaternoAlumno;
          arrStrValCampos[3] = nombreAlumno;
            
          blnRes = gestor.altaAlumno(arrStrNomCampos,arrStrValCampos);
        
        }    
        
        return blnRes;
    }
}
