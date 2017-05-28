
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
    private final static QName _AddCustomer_QNAME = new QName("http://CustomerWebService/", "addCustomer");
    private final static QName _EditCustomer_QNAME = new QName("http://CustomerWebService/", "editCustomer");
    private final static QName _LoadDataResponse_QNAME = new QName("http://CustomerWebService/", "loadDataResponse");
    private final static QName _SaveDataResponse_QNAME = new QName("http://CustomerWebService/", "saveDataResponse");
    private final static QName _DeleteCustomerResponse_QNAME = new QName("http://CustomerWebService/", "deleteCustomerResponse");
    private final static QName _EditCustomerResponse_QNAME = new QName("http://CustomerWebService/", "editCustomerResponse");
    private final static QName _SaveData_QNAME = new QName("http://CustomerWebService/", "saveData");
    private final static QName _DeleteCustomer_QNAME = new QName("http://CustomerWebService/", "deleteCustomer");
    private final static QName _LoadData_QNAME = new QName("http://CustomerWebService/", "loadData");
    private final static QName _ViewCustomerListResponse_QNAME = new QName("http://CustomerWebService/", "viewCustomerListResponse");

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
     * Create an instance of {@link EditCustomer }
     * 
     */
    public EditCustomer createEditCustomer() {
        return new EditCustomer();
    }

    /**
     * Create an instance of {@link LoadDataResponse }
     * 
     */
    public LoadDataResponse createLoadDataResponse() {
        return new LoadDataResponse();
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
     * Create an instance of {@link SaveData }
     * 
     */
    public SaveData createSaveData() {
        return new SaveData();
    }

    /**
     * Create an instance of {@link DeleteCustomer }
     * 
     */
    public DeleteCustomer createDeleteCustomer() {
        return new DeleteCustomer();
    }

    /**
     * Create an instance of {@link LoadData }
     * 
     */
    public LoadData createLoadData() {
        return new LoadData();
    }

    /**
     * Create an instance of {@link ViewCustomerListResponse }
     * 
     */
    public ViewCustomerListResponse createViewCustomerListResponse() {
        return new ViewCustomerListResponse();
    }

    /**
     * Create an instance of {@link SaveDataResponse }
     * 
     */
    public SaveDataResponse createSaveDataResponse() {
        return new SaveDataResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link EditCustomerResponse }
     * 
     */
    public EditCustomerResponse createEditCustomerResponse() {
        return new EditCustomerResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "addCustomer")
    public JAXBElement<AddCustomer> createAddCustomer(AddCustomer value) {
        return new JAXBElement<AddCustomer>(_AddCustomer_QNAME, AddCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "editCustomer")
    public JAXBElement<EditCustomer> createEditCustomer(EditCustomer value) {
        return new JAXBElement<EditCustomer>(_EditCustomer_QNAME, EditCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "loadDataResponse")
    public JAXBElement<LoadDataResponse> createLoadDataResponse(LoadDataResponse value) {
        return new JAXBElement<LoadDataResponse>(_LoadDataResponse_QNAME, LoadDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "saveDataResponse")
    public JAXBElement<SaveDataResponse> createSaveDataResponse(SaveDataResponse value) {
        return new JAXBElement<SaveDataResponse>(_SaveDataResponse_QNAME, SaveDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "deleteCustomerResponse")
    public JAXBElement<DeleteCustomerResponse> createDeleteCustomerResponse(DeleteCustomerResponse value) {
        return new JAXBElement<DeleteCustomerResponse>(_DeleteCustomerResponse_QNAME, DeleteCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "editCustomerResponse")
    public JAXBElement<EditCustomerResponse> createEditCustomerResponse(EditCustomerResponse value) {
        return new JAXBElement<EditCustomerResponse>(_EditCustomerResponse_QNAME, EditCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "saveData")
    public JAXBElement<SaveData> createSaveData(SaveData value) {
        return new JAXBElement<SaveData>(_SaveData_QNAME, SaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "deleteCustomer")
    public JAXBElement<DeleteCustomer> createDeleteCustomer(DeleteCustomer value) {
        return new JAXBElement<DeleteCustomer>(_DeleteCustomer_QNAME, DeleteCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "loadData")
    public JAXBElement<LoadData> createLoadData(LoadData value) {
        return new JAXBElement<LoadData>(_LoadData_QNAME, LoadData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewCustomerListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CustomerWebService/", name = "viewCustomerListResponse")
    public JAXBElement<ViewCustomerListResponse> createViewCustomerListResponse(ViewCustomerListResponse value) {
        return new JAXBElement<ViewCustomerListResponse>(_ViewCustomerListResponse_QNAME, ViewCustomerListResponse.class, null, value);
    }

}
