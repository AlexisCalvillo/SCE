
package wsordprod;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsordprod package. 
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

    private final static QName _Find_QNAME = new QName("http://wsPedidoItem/", "find");
    private final static QName _OrderedProduct_QNAME = new QName("http://wsPedidoItem/", "orderedProduct");
    private final static QName _FindRangeResponse_QNAME = new QName("http://wsPedidoItem/", "findRangeResponse");
    private final static QName _Category_QNAME = new QName("http://wsPedidoItem/", "category");
    private final static QName _Customer_QNAME = new QName("http://wsPedidoItem/", "customer");
    private final static QName _Create_QNAME = new QName("http://wsPedidoItem/", "create");
    private final static QName _FindAllResponse_QNAME = new QName("http://wsPedidoItem/", "findAllResponse");
    private final static QName _Edit_QNAME = new QName("http://wsPedidoItem/", "edit");
    private final static QName _FindRange_QNAME = new QName("http://wsPedidoItem/", "findRange");
    private final static QName _FindOrderedProductByCustIdResponse_QNAME = new QName("http://wsPedidoItem/", "findOrderedProductByCustIdResponse");
    private final static QName _Product_QNAME = new QName("http://wsPedidoItem/", "product");
    private final static QName _FindAll_QNAME = new QName("http://wsPedidoItem/", "findAll");
    private final static QName _FindOrderedProductByCustId_QNAME = new QName("http://wsPedidoItem/", "findOrderedProductByCustId");
    private final static QName _Remove_QNAME = new QName("http://wsPedidoItem/", "remove");
    private final static QName _Count_QNAME = new QName("http://wsPedidoItem/", "count");
    private final static QName _CustomerOrder_QNAME = new QName("http://wsPedidoItem/", "customerOrder");
    private final static QName _CreateResponse_QNAME = new QName("http://wsPedidoItem/", "createResponse");
    private final static QName _CountResponse_QNAME = new QName("http://wsPedidoItem/", "countResponse");
    private final static QName _FindResponse_QNAME = new QName("http://wsPedidoItem/", "findResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsordprod
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindOrderedProductByCustIdResponse }
     * 
     */
    public FindOrderedProductByCustIdResponse createFindOrderedProductByCustIdResponse() {
        return new FindOrderedProductByCustIdResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Edit }
     * 
     */
    public Edit createEdit() {
        return new Edit();
    }

    /**
     * Create an instance of {@link FindRange }
     * 
     */
    public FindRange createFindRange() {
        return new FindRange();
    }

    /**
     * Create an instance of {@link Count }
     * 
     */
    public Count createCount() {
        return new Count();
    }

    /**
     * Create an instance of {@link CustomerOrder }
     * 
     */
    public CustomerOrder createCustomerOrder() {
        return new CustomerOrder();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link CountResponse }
     * 
     */
    public CountResponse createCountResponse() {
        return new CountResponse();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link FindOrderedProductByCustId }
     * 
     */
    public FindOrderedProductByCustId createFindOrderedProductByCustId() {
        return new FindOrderedProductByCustId();
    }

    /**
     * Create an instance of {@link Remove }
     * 
     */
    public Remove createRemove() {
        return new Remove();
    }

    /**
     * Create an instance of {@link OrderedProduct }
     * 
     */
    public OrderedProduct createOrderedProduct() {
        return new OrderedProduct();
    }

    /**
     * Create an instance of {@link FindRangeResponse }
     * 
     */
    public FindRangeResponse createFindRangeResponse() {
        return new FindRangeResponse();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link OrderedProductPK }
     * 
     */
    public OrderedProductPK createOrderedProductPK() {
        return new OrderedProductPK();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderedProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "orderedProduct")
    public JAXBElement<OrderedProduct> createOrderedProduct(OrderedProduct value) {
        return new JAXBElement<OrderedProduct>(_OrderedProduct_QNAME, OrderedProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "findRangeResponse")
    public JAXBElement<FindRangeResponse> createFindRangeResponse(FindRangeResponse value) {
        return new JAXBElement<FindRangeResponse>(_FindRangeResponse_QNAME, FindRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "category")
    public JAXBElement<Category> createCategory(Category value) {
        return new JAXBElement<Category>(_Category_QNAME, Category.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "edit")
    public JAXBElement<Edit> createEdit(Edit value) {
        return new JAXBElement<Edit>(_Edit_QNAME, Edit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "findRange")
    public JAXBElement<FindRange> createFindRange(FindRange value) {
        return new JAXBElement<FindRange>(_FindRange_QNAME, FindRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOrderedProductByCustIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "findOrderedProductByCustIdResponse")
    public JAXBElement<FindOrderedProductByCustIdResponse> createFindOrderedProductByCustIdResponse(FindOrderedProductByCustIdResponse value) {
        return new JAXBElement<FindOrderedProductByCustIdResponse>(_FindOrderedProductByCustIdResponse_QNAME, FindOrderedProductByCustIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOrderedProductByCustId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "findOrderedProductByCustId")
    public JAXBElement<FindOrderedProductByCustId> createFindOrderedProductByCustId(FindOrderedProductByCustId value) {
        return new JAXBElement<FindOrderedProductByCustId>(_FindOrderedProductByCustId_QNAME, FindOrderedProductByCustId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "remove")
    public JAXBElement<Remove> createRemove(Remove value) {
        return new JAXBElement<Remove>(_Remove_QNAME, Remove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Count }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "count")
    public JAXBElement<Count> createCount(Count value) {
        return new JAXBElement<Count>(_Count_QNAME, Count.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "customerOrder")
    public JAXBElement<CustomerOrder> createCustomerOrder(CustomerOrder value) {
        return new JAXBElement<CustomerOrder>(_CustomerOrder_QNAME, CustomerOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "countResponse")
    public JAXBElement<CountResponse> createCountResponse(CountResponse value) {
        return new JAXBElement<CountResponse>(_CountResponse_QNAME, CountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsPedidoItem/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

}