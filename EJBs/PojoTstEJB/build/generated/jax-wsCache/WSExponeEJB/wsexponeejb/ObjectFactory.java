
package wsexponeejb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsexponeejb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Hello_QNAME = new QName("http://wsexponeejb/", "hello");
    private final static QName _ObtenSumaResponse_QNAME = new QName("http://wsexponeejb/", "obtenSumaResponse");
    private final static QName _ObtenResultado_QNAME = new QName("http://wsexponeejb/", "obtenResultado");
    private final static QName _ObtenSuma_QNAME = new QName("http://wsexponeejb/", "obtenSuma");
    private final static QName _ObtenResultadoResponse_QNAME = new QName("http://wsexponeejb/", "obtenResultadoResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://wsexponeejb/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsexponeejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenSuma }
     * 
     */
    public ObtenSuma createObtenSuma() {
        return new ObtenSuma();
    }

    /**
     * Create an instance of {@link ObtenResultadoResponse }
     * 
     */
    public ObtenResultadoResponse createObtenResultadoResponse() {
        return new ObtenResultadoResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link ObtenSumaResponse }
     * 
     */
    public ObtenSumaResponse createObtenSumaResponse() {
        return new ObtenSumaResponse();
    }

    /**
     * Create an instance of {@link ObtenResultado }
     * 
     */
    public ObtenResultado createObtenResultado() {
        return new ObtenResultado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsexponeejb/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenSumaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsexponeejb/", name = "obtenSumaResponse")
    public JAXBElement<ObtenSumaResponse> createObtenSumaResponse(ObtenSumaResponse value) {
        return new JAXBElement<ObtenSumaResponse>(_ObtenSumaResponse_QNAME, ObtenSumaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenResultado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsexponeejb/", name = "obtenResultado")
    public JAXBElement<ObtenResultado> createObtenResultado(ObtenResultado value) {
        return new JAXBElement<ObtenResultado>(_ObtenResultado_QNAME, ObtenResultado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenSuma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsexponeejb/", name = "obtenSuma")
    public JAXBElement<ObtenSuma> createObtenSuma(ObtenSuma value) {
        return new JAXBElement<ObtenSuma>(_ObtenSuma_QNAME, ObtenSuma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenResultadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsexponeejb/", name = "obtenResultadoResponse")
    public JAXBElement<ObtenResultadoResponse> createObtenResultadoResponse(ObtenResultadoResponse value) {
        return new JAXBElement<ObtenResultadoResponse>(_ObtenResultadoResponse_QNAME, ObtenResultadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsexponeejb/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
