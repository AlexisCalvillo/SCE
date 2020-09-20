
package wsescbaile;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "bajas", targetNamespace = "http://wsEscBaile/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Bajas {


    /**
     * 
     * @param cveAlumno
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bajaEq", targetNamespace = "http://wsEscBaile/", className = "wsescbaile.BajaEq")
    @ResponseWrapper(localName = "bajaEqResponse", targetNamespace = "http://wsEscBaile/", className = "wsescbaile.BajaEqResponse")
    @Action(input = "http://wsEscBaile/bajas/bajaEqRequest", output = "http://wsEscBaile/bajas/bajaEqResponse")
    public boolean bajaEq(
        @WebParam(name = "cveAlumno", targetNamespace = "")
        String cveAlumno);

    /**
     * 
     * @param cveAlumno
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bajaLike", targetNamespace = "http://wsEscBaile/", className = "wsescbaile.BajaLike")
    @ResponseWrapper(localName = "bajaLikeResponse", targetNamespace = "http://wsEscBaile/", className = "wsescbaile.BajaLikeResponse")
    @Action(input = "http://wsEscBaile/bajas/bajaLikeRequest", output = "http://wsEscBaile/bajas/bajaLikeResponse")
    public boolean bajaLike(
        @WebParam(name = "cveAlumno", targetNamespace = "")
        String cveAlumno);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://wsEscBaile/", className = "wsescbaile.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://wsEscBaile/", className = "wsescbaile.HelloResponse")
    @Action(input = "http://wsEscBaile/bajas/helloRequest", output = "http://wsEscBaile/bajas/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}