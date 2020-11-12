/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsPedidoItem;

import entidades.OrderedProduct;
import entidades.OrderedProductPK;
import frontera.OrderedProductFacade;
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
@WebService(serviceName = "WSPedidoItem")
public class WSPedidoItem {

    @EJB
    private OrderedProductFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    //@Oneway
    public OrderedProductPK create(@WebParam(name = "entity") OrderedProduct entity) {
        ejbRef.create(entity);
        return entity.getOrderedProductPK();
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") OrderedProduct entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") OrderedProduct entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public OrderedProduct find(@WebParam(name = "custord_id") int custord_id, @WebParam(name = "prod_id") int prod_id) {
        OrderedProductPK id= new OrderedProductPK();
        id.setCustomerOrderId(custord_id);
        id.setProductId(prod_id);
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<OrderedProduct> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<OrderedProduct> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }

    /**
     * Web service operation
     */
    
    @WebMethod(operationName = "findOrderedProductByCustId")
    public List<OrderedProduct> findOrderedProductByCustId(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return ejbRef.findOrderedProductByCustId(id);
    }
    
    
}
