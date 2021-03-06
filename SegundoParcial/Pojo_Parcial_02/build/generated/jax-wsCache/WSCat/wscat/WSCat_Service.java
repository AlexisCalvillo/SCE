
package wscat;

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
@WebServiceClient(name = "WSCat", targetNamespace = "http://wscat/", wsdlLocation = "http://localhost:8080/Affablebean_01/WSCat?WSDL")
public class WSCat_Service
    extends Service
{

    private final static URL WSCAT_WSDL_LOCATION;
    private final static WebServiceException WSCAT_EXCEPTION;
    private final static QName WSCAT_QNAME = new QName("http://wscat/", "WSCat");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Affablebean_01/WSCat?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSCAT_WSDL_LOCATION = url;
        WSCAT_EXCEPTION = e;
    }

    public WSCat_Service() {
        super(__getWsdlLocation(), WSCAT_QNAME);
    }

    public WSCat_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSCAT_QNAME, features);
    }

    public WSCat_Service(URL wsdlLocation) {
        super(wsdlLocation, WSCAT_QNAME);
    }

    public WSCat_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSCAT_QNAME, features);
    }

    public WSCat_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSCat_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSCat
     */
    @WebEndpoint(name = "WSCatPort")
    public WSCat getWSCatPort() {
        return super.getPort(new QName("http://wscat/", "WSCatPort"), WSCat.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSCat
     */
    @WebEndpoint(name = "WSCatPort")
    public WSCat getWSCatPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wscat/", "WSCatPort"), WSCat.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSCAT_EXCEPTION!= null) {
            throw WSCAT_EXCEPTION;
        }
        return WSCAT_WSDL_LOCATION;
    }

}
