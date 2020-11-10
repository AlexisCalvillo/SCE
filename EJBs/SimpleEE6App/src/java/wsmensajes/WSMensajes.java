/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsmensajes;

import fromtera.MensajesFacade;
import entidad.Mensajes;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author aalex
 */
@WebService(serviceName = "WSMensajes")
public class WSMensajes {

    @EJB
    private MensajesFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") String entity) {
        Mensajes ent = new Mensajes();
        ent.setMsj(entity);
        ejbRef.create(ent);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Mensajes entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Mensajes entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Mensajes find(@WebParam(name = "id") int id) {
        return ejbRef.find(new Long(id));
    }

    @WebMethod(operationName = "findAll")
    public List<Mensajes> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Mensajes> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "creaMensaje")
    public boolean creaMensaje(@WebParam(name = "strMensaje") String strMensaje) {
        Mensajes entity = new Mensajes();
        entity.setMsj(strMensaje);
        ejbRef.create(entity);
        return true;
    }

    
}
