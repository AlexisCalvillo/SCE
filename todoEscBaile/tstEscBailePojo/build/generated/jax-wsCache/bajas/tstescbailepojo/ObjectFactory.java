
package tstescbailepojo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tstescbailepojo package. 
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

    private final static QName _HelloResponse_QNAME = new QName("http://wsEscBaile/", "helloResponse");
    private final static QName _BajaEqResponse_QNAME = new QName("http://wsEscBaile/", "bajaEqResponse");
    private final static QName _BajaEq_QNAME = new QName("http://wsEscBaile/", "bajaEq");
    private final static QName _BajaLike_QNAME = new QName("http://wsEscBaile/", "bajaLike");
    private final static QName _BajaLikeResponse_QNAME = new QName("http://wsEscBaile/", "bajaLikeResponse");
    private final static QName _Hello_QNAME = new QName("http://wsEscBaile/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tstescbailepojo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BajaEq }
     * 
     */
    public BajaEq createBajaEq() {
        return new BajaEq();
    }

    /**
     * Create an instance of {@link BajaLike }
     * 
     */
    public BajaLike createBajaLike() {
        return new BajaLike();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link BajaEqResponse }
     * 
     */
    public BajaEqResponse createBajaEqResponse() {
        return new BajaEqResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link BajaLikeResponse }
     * 
     */
    public BajaLikeResponse createBajaLikeResponse() {
        return new BajaLikeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsEscBaile/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BajaEqResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsEscBaile/", name = "bajaEqResponse")
    public JAXBElement<BajaEqResponse> createBajaEqResponse(BajaEqResponse value) {
        return new JAXBElement<BajaEqResponse>(_BajaEqResponse_QNAME, BajaEqResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BajaEq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsEscBaile/", name = "bajaEq")
    public JAXBElement<BajaEq> createBajaEq(BajaEq value) {
        return new JAXBElement<BajaEq>(_BajaEq_QNAME, BajaEq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BajaLike }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsEscBaile/", name = "bajaLike")
    public JAXBElement<BajaLike> createBajaLike(BajaLike value) {
        return new JAXBElement<BajaLike>(_BajaLike_QNAME, BajaLike.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BajaLikeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsEscBaile/", name = "bajaLikeResponse")
    public JAXBElement<BajaLikeResponse> createBajaLikeResponse(BajaLikeResponse value) {
        return new JAXBElement<BajaLikeResponse>(_BajaLikeResponse_QNAME, BajaLikeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsEscBaile/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
