
package customerwebservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the customerwebservice package. 
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

    private final static QName _ViewCustomerList_QNAME = new QName("http://CustomerWebService/", "viewCustomerList");
    private final static QName _AddCustomerResponse_QNAME = new QName("http://CustomerWebService/", "addCustomerResponse");
    private final static QName _OperationResponse_QNAME = new QName("http://CustomerWebService/", "operationResponse");
    private final static QName _ViewCustomer_QNAME = new QName("http://CustomerWebService/", "viewCustomer");
    private final static QName _AddCustomer_QNAME = new QName("http://CustomerWebService/", "addCustomer");
    private final static QName _Operation_QNAME = new QName("http://CustomerWebService/", "operation");
    private final static QName _ViewCustomerListResponse_QNAME = new QName("http://CustomerWebService/", "viewCustomerListResponse");
    private final static QName _ViewCustomerResponse_QNAME = new QName("http://CustomerWebService/", "viewCustomerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: customerwebservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCustomer }
     * 
     */
    public AddCustomer createAddCustomer() {
        return new AddCustomer();
    }

    /**
     * Create an instance of {@link ViewCustomerList }
     * 
     */
    public ViewCustomerList createViewCustomerList() {
        return new ViewCustomerList();
    }

    /**
     * Create an instance of {@link AddCustomerResponse }
     * 
     */
    public AddCustomerResponse createAddCustomerResponse() {
        return new AddCustomerResponse();
    }

    /**
     * Create an instance of {@link OperationResponse }
     * 
     */
    public OperationResponse createOperationResponse() {
        return new OperationResponse();
    }

    /**
     * Create an instance of {@link ViewCustomer }
     * 
     */
    public ViewCustomer createViewCustomer() {
        return new ViewCustomer();
    }

    /**
     * Create an instance of {@link ViewCustomerListResponse }
     * 
     */
    public ViewCustomerListResponse createViewCustomerListResponse() {
        return new ViewCustomerListResponse();
    }

    /**
     * Create an instance of {@link ViewCustomerResponse }
     * 
     */
    public ViewCustomerResponse createViewCustomerResponse() {
        return new ViewCustomerResponse();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewCustomerList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "viewCustomerList")
    public JAXBElement<ViewCustomerList> createViewCustomerList(ViewCustomerList value) {
        return new JAXBElement<ViewCustomerList>(_ViewCustomerList_QNAME, ViewCustomerList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "addCustomerResponse")
    public JAXBElement<AddCustomerResponse> createAddCustomerResponse(AddCustomerResponse value) {
        return new JAXBElement<AddCustomerResponse>(_AddCustomerResponse_QNAME, AddCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "operationResponse")
    public JAXBElement<OperationResponse> createOperationResponse(OperationResponse value) {
        return new JAXBElement<OperationResponse>(_OperationResponse_QNAME, OperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "viewCustomer")
    public JAXBElement<ViewCustomer> createViewCustomer(ViewCustomer value) {
        return new JAXBElement<ViewCustomer>(_ViewCustomer_QNAME, ViewCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "addCustomer")
    public JAXBElement<AddCustomer> createAddCustomer(AddCustomer value) {
        return new JAXBElement<AddCustomer>(_AddCustomer_QNAME, AddCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "operation")
    public JAXBElement<Operation> createOperation(Operation value) {
        return new JAXBElement<Operation>(_Operation_QNAME, Operation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewCustomerListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "viewCustomerListResponse")
    public JAXBElement<ViewCustomerListResponse> createViewCustomerListResponse(ViewCustomerListResponse value) {
        return new JAXBElement<ViewCustomerListResponse>(_ViewCustomerListResponse_QNAME, ViewCustomerListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "viewCustomerResponse")
    public JAXBElement<ViewCustomerResponse> createViewCustomerResponse(ViewCustomerResponse value) {
        return new JAXBElement<ViewCustomerResponse>(_ViewCustomerResponse_QNAME, ViewCustomerResponse.class, null, value);
    }

}
