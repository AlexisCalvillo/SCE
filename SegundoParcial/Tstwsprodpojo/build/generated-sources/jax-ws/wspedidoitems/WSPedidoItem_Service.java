
package wspedidoitems;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSPedidoItem", targetNamespace = "http://wsPedidoItem/", wsdlLocation = "http://localhost:8080/Affablebean_01/WSPedidoItem?WSDL")
public class WSPedidoItem_Service
    extends Service
{

    private final static URL WSPEDIDOITEM_WSDL_LOCATION;
    private final static WebServiceException WSPEDIDOITEM_EXCEPTION;
    private final static QName WSPEDIDOITEM_QNAME = new QName("http://wsPedidoItem/", "WSPedidoItem");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Affablebean_01/WSPedidoItem?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSPEDIDOITEM_WSDL_LOCATION = url;
        WSPEDIDOITEM_EXCEPTION = e;
    }

    public WSPedidoItem_Service() {
        super(__getWsdlLocation(), WSPEDIDOITEM_QNAME);
    }

    public WSPedidoItem_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSPEDIDOITEM_QNAME, features);
    }

    public WSPedidoItem_Service(URL wsdlLocation) {
        super(wsdlLocation, WSPEDIDOITEM_QNAME);
    }

    public WSPedidoItem_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSPEDIDOITEM_QNAME, features);
    }

    public WSPedidoItem_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSPedidoItem_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSPedidoItem
     */
    @WebEndpoint(name = "WSPedidoItemPort")
    public WSPedidoItem getWSPedidoItemPort() {
        return super.getPort(new QName("http://wsPedidoItem/", "WSPedidoItemPort"), WSPedidoItem.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSPedidoItem
     */
    @WebEndpoint(name = "WSPedidoItemPort")
    public WSPedidoItem getWSPedidoItemPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wsPedidoItem/", "WSPedidoItemPort"), WSPedidoItem.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSPEDIDOITEM_EXCEPTION!= null) {
            throw WSPEDIDOITEM_EXCEPTION;
        }
        return WSPEDIDOITEM_WSDL_LOCATION;
    }

}
