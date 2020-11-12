
package wspedidoitems;

import java.util.List;
import javax.jws.Oneway;
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
@WebService(name = "WSPedidoItem", targetNamespace = "http://wsPedidoItem/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSPedidoItem {


    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "remove", targetNamespace = "http://wsPedidoItem/", className = "wspedidoitems.Remove")
    @Action(input = "http://wsPedidoItem/WSPedidoItem/remove")
    public void remove(
        @WebParam(name = "entity", targetNamespace = "")
        OrderedProduct entity);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "count", targetNamespace = "http://wsPedidoItem/", className = "wspedidoitems.Count")
    @ResponseWrapper(localName = "countResponse", targetNamespace = "http://wsPedidoItem/", className = "wspedidoitems.CountResponse")
    @Action(input = "http://wsPedidoItem/WSPedidoItem/countRequest", output = "http://wsPedidoItem/WSPedidoItem/countResponse")
    public int count();

    /**
     * 
     * @param id
     * @return
     *     returns wspedidoitems.OrderedProduct
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "find", targetNamespace = "http://wsPedidoItem/", className = "wspedidoitems.Find")
    @ResponseWrapper(localName = "findResponse", targetNamespace = "http://wsPedidoItem/", className = "wspedidoitems.FindResponse")
    @Action(input = "http://wsPedidoItem/WSPedidoItem/findRequest", output = "http://wsPedidoItem/WSPedidoItem/findResponse")
    public OrderedProduct find(
        @WebParam(name = "id", targetNamespace = "")
        Object id);

    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "create", targetNamespace = "http://wsPedidoItem/", className = "wspedidoitems.Create")
    @Action(input = "http://wsPedidoItem/WSPedidoItem/create")
    public void create(
        @WebParam(name = "entity", targetNamespace = "")
        OrderedProduct entity);

    /**
     * 
     * @return
     *     returns java.util.List<wspedidoitems.OrderedProduct>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://wsPedidoItem/", className = "wspedidoitems.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://wsPedidoItem/", className = "wspedidoitems.FindAllResponse")
    @Action(input = "http://wsPedidoItem/WSPedidoItem/findAllRequest", output = "http://wsPedidoItem/WSPedidoItem/findAllResponse")
    public List<OrderedProduct> findAll();

    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "edit", targetNamespace = "http://wsPedidoItem/", className = "wspedidoitems.Edit")
    @Action(input = "http://wsPedidoItem/WSPedidoItem/edit")
    public void edit(
        @WebParam(name = "entity", targetNamespace = "")
        OrderedProduct entity);

    /**
     * 
     * @param range
     * @return
     *     returns java.util.List<wspedidoitems.OrderedProduct>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findRange", targetNamespace = "http://wsPedidoItem/", className = "wspedidoitems.FindRange")
    @ResponseWrapper(localName = "findRangeResponse", targetNamespace = "http://wsPedidoItem/", className = "wspedidoitems.FindRangeResponse")
    @Action(input = "http://wsPedidoItem/WSPedidoItem/findRangeRequest", output = "http://wsPedidoItem/WSPedidoItem/findRangeResponse")
    public List<OrderedProduct> findRange(
        @WebParam(name = "range", targetNamespace = "")
        List<Integer> range);

}
