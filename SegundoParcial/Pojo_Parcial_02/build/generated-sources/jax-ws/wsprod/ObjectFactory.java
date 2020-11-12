
package wsprod;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsprod package. 
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

    private final static QName _Create_QNAME = new QName("http://wsprod/", "create");
    private final static QName _FindAllResponse_QNAME = new QName("http://wsprod/", "findAllResponse");
    private final static QName _Operation_QNAME = new QName("http://wsprod/", "operation");
    private final static QName _Category_QNAME = new QName("http://wsprod/", "category");
    private final static QName _PrecioPromPorCatId_QNAME = new QName("http://wsprod/", "precioPromPorCatId");
    private final static QName _FindRangeResponse_QNAME = new QName("http://wsprod/", "findRangeResponse");
    private final static QName _FindByNameLikeResponse_QNAME = new QName("http://wsprod/", "findByNameLikeResponse");
    private final static QName _FindByNameResponse_QNAME = new QName("http://wsprod/", "findByNameResponse");
    private final static QName _Find_QNAME = new QName("http://wsprod/", "find");
    private final static QName _CreateResponse_QNAME = new QName("http://wsprod/", "createResponse");
    private final static QName _FindByName_QNAME = new QName("http://wsprod/", "findByName");
    private final static QName _Count_QNAME = new QName("http://wsprod/", "count");
    private final static QName _FindByNameLike_QNAME = new QName("http://wsprod/", "findByNameLike");
    private final static QName _CountResponse_QNAME = new QName("http://wsprod/", "countResponse");
    private final static QName _FindResponse_QNAME = new QName("http://wsprod/", "findResponse");
    private final static QName _FindAll_QNAME = new QName("http://wsprod/", "findAll");
    private final static QName _PrecioPromPorCatIdResponse_QNAME = new QName("http://wsprod/", "precioPromPorCatIdResponse");
    private final static QName _Remove_QNAME = new QName("http://wsprod/", "remove");
    private final static QName _Product_QNAME = new QName("http://wsprod/", "product");
    private final static QName _Edit_QNAME = new QName("http://wsprod/", "edit");
    private final static QName _OperationResponse_QNAME = new QName("http://wsprod/", "operationResponse");
    private final static QName _FindRange_QNAME = new QName("http://wsprod/", "findRange");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsprod
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link OperationResponse }
     * 
     */
    public OperationResponse createOperationResponse() {
        return new OperationResponse();
    }

    /**
     * Create an instance of {@link Count }
     * 
     */
    public Count createCount() {
        return new Count();
    }

    /**
     * Create an instance of {@link FindByNameLike }
     * 
     */
    public FindByNameLike createFindByNameLike() {
        return new FindByNameLike();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link FindByName }
     * 
     */
    public FindByName createFindByName() {
        return new FindByName();
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
     * Create an instance of {@link PrecioPromPorCatIdResponse }
     * 
     */
    public PrecioPromPorCatIdResponse createPrecioPromPorCatIdResponse() {
        return new PrecioPromPorCatIdResponse();
    }

    /**
     * Create an instance of {@link Remove }
     * 
     */
    public Remove createRemove() {
        return new Remove();
    }

    /**
     * Create an instance of {@link PrecioPromPorCatId }
     * 
     */
    public PrecioPromPorCatId createPrecioPromPorCatId() {
        return new PrecioPromPorCatId();
    }

    /**
     * Create an instance of {@link FindRangeResponse }
     * 
     */
    public FindRangeResponse createFindRangeResponse() {
        return new FindRangeResponse();
    }

    /**
     * Create an instance of {@link FindByNameLikeResponse }
     * 
     */
    public FindByNameLikeResponse createFindByNameLikeResponse() {
        return new FindByNameLikeResponse();
    }

    /**
     * Create an instance of {@link FindByNameResponse }
     * 
     */
    public FindByNameResponse createFindByNameResponse() {
        return new FindByNameResponse();
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
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "operation")
    public JAXBElement<Operation> createOperation(Operation value) {
        return new JAXBElement<Operation>(_Operation_QNAME, Operation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "category")
    public JAXBElement<Category> createCategory(Category value) {
        return new JAXBElement<Category>(_Category_QNAME, Category.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrecioPromPorCatId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "precioPromPorCatId")
    public JAXBElement<PrecioPromPorCatId> createPrecioPromPorCatId(PrecioPromPorCatId value) {
        return new JAXBElement<PrecioPromPorCatId>(_PrecioPromPorCatId_QNAME, PrecioPromPorCatId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "findRangeResponse")
    public JAXBElement<FindRangeResponse> createFindRangeResponse(FindRangeResponse value) {
        return new JAXBElement<FindRangeResponse>(_FindRangeResponse_QNAME, FindRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByNameLikeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "findByNameLikeResponse")
    public JAXBElement<FindByNameLikeResponse> createFindByNameLikeResponse(FindByNameLikeResponse value) {
        return new JAXBElement<FindByNameLikeResponse>(_FindByNameLikeResponse_QNAME, FindByNameLikeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "findByNameResponse")
    public JAXBElement<FindByNameResponse> createFindByNameResponse(FindByNameResponse value) {
        return new JAXBElement<FindByNameResponse>(_FindByNameResponse_QNAME, FindByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "findByName")
    public JAXBElement<FindByName> createFindByName(FindByName value) {
        return new JAXBElement<FindByName>(_FindByName_QNAME, FindByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Count }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "count")
    public JAXBElement<Count> createCount(Count value) {
        return new JAXBElement<Count>(_Count_QNAME, Count.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByNameLike }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "findByNameLike")
    public JAXBElement<FindByNameLike> createFindByNameLike(FindByNameLike value) {
        return new JAXBElement<FindByNameLike>(_FindByNameLike_QNAME, FindByNameLike.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "countResponse")
    public JAXBElement<CountResponse> createCountResponse(CountResponse value) {
        return new JAXBElement<CountResponse>(_CountResponse_QNAME, CountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrecioPromPorCatIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "precioPromPorCatIdResponse")
    public JAXBElement<PrecioPromPorCatIdResponse> createPrecioPromPorCatIdResponse(PrecioPromPorCatIdResponse value) {
        return new JAXBElement<PrecioPromPorCatIdResponse>(_PrecioPromPorCatIdResponse_QNAME, PrecioPromPorCatIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "remove")
    public JAXBElement<Remove> createRemove(Remove value) {
        return new JAXBElement<Remove>(_Remove_QNAME, Remove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "edit")
    public JAXBElement<Edit> createEdit(Edit value) {
        return new JAXBElement<Edit>(_Edit_QNAME, Edit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "operationResponse")
    public JAXBElement<OperationResponse> createOperationResponse(OperationResponse value) {
        return new JAXBElement<OperationResponse>(_OperationResponse_QNAME, OperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsprod/", name = "findRange")
    public JAXBElement<FindRange> createFindRange(FindRange value) {
        return new JAXBElement<FindRange>(_FindRange_QNAME, FindRange.class, null, value);
    }

}
