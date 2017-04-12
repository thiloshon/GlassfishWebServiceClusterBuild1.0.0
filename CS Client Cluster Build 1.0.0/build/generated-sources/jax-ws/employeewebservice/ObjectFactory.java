
package employeewebservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the employeewebservice package. 
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

    private final static QName _AddEmployee_QNAME = new QName("http://EmployeeWebService/", "addEmployee");
    private final static QName _AddEmployeeResponse_QNAME = new QName("http://EmployeeWebService/", "addEmployeeResponse");
    private final static QName _DeleteEmployee_QNAME = new QName("http://EmployeeWebService/", "deleteEmployee");
    private final static QName _ViewEmployeesListResponse_QNAME = new QName("http://EmployeeWebService/", "viewEmployeesListResponse");
    private final static QName _DeleteEmployeeResponse_QNAME = new QName("http://EmployeeWebService/", "deleteEmployeeResponse");
    private final static QName _EditEmployee_QNAME = new QName("http://EmployeeWebService/", "editEmployee");
    private final static QName _ViewEmployeesList_QNAME = new QName("http://EmployeeWebService/", "viewEmployeesList");
    private final static QName _EditEmployeeResponse_QNAME = new QName("http://EmployeeWebService/", "editEmployeeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: employeewebservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ViewEmployeesListResponse }
     * 
     */
    public ViewEmployeesListResponse createViewEmployeesListResponse() {
        return new ViewEmployeesListResponse();
    }

    /**
     * Create an instance of {@link DeleteEmployeeResponse }
     * 
     */
    public DeleteEmployeeResponse createDeleteEmployeeResponse() {
        return new DeleteEmployeeResponse();
    }

    /**
     * Create an instance of {@link EditEmployee }
     * 
     */
    public EditEmployee createEditEmployee() {
        return new EditEmployee();
    }

    /**
     * Create an instance of {@link EditEmployeeResponse }
     * 
     */
    public EditEmployeeResponse createEditEmployeeResponse() {
        return new EditEmployeeResponse();
    }

    /**
     * Create an instance of {@link ViewEmployeesList }
     * 
     */
    public ViewEmployeesList createViewEmployeesList() {
        return new ViewEmployeesList();
    }

    /**
     * Create an instance of {@link AddEmployeeResponse }
     * 
     */
    public AddEmployeeResponse createAddEmployeeResponse() {
        return new AddEmployeeResponse();
    }

    /**
     * Create an instance of {@link DeleteEmployee }
     * 
     */
    public DeleteEmployee createDeleteEmployee() {
        return new DeleteEmployee();
    }

    /**
     * Create an instance of {@link AddEmployee }
     * 
     */
    public AddEmployee createAddEmployee() {
        return new AddEmployee();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EmployeeWebService/", name = "addEmployee")
    public JAXBElement<AddEmployee> createAddEmployee(AddEmployee value) {
        return new JAXBElement<AddEmployee>(_AddEmployee_QNAME, AddEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EmployeeWebService/", name = "addEmployeeResponse")
    public JAXBElement<AddEmployeeResponse> createAddEmployeeResponse(AddEmployeeResponse value) {
        return new JAXBElement<AddEmployeeResponse>(_AddEmployeeResponse_QNAME, AddEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EmployeeWebService/", name = "deleteEmployee")
    public JAXBElement<DeleteEmployee> createDeleteEmployee(DeleteEmployee value) {
        return new JAXBElement<DeleteEmployee>(_DeleteEmployee_QNAME, DeleteEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewEmployeesListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EmployeeWebService/", name = "viewEmployeesListResponse")
    public JAXBElement<ViewEmployeesListResponse> createViewEmployeesListResponse(ViewEmployeesListResponse value) {
        return new JAXBElement<ViewEmployeesListResponse>(_ViewEmployeesListResponse_QNAME, ViewEmployeesListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EmployeeWebService/", name = "deleteEmployeeResponse")
    public JAXBElement<DeleteEmployeeResponse> createDeleteEmployeeResponse(DeleteEmployeeResponse value) {
        return new JAXBElement<DeleteEmployeeResponse>(_DeleteEmployeeResponse_QNAME, DeleteEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EmployeeWebService/", name = "editEmployee")
    public JAXBElement<EditEmployee> createEditEmployee(EditEmployee value) {
        return new JAXBElement<EditEmployee>(_EditEmployee_QNAME, EditEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewEmployeesList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EmployeeWebService/", name = "viewEmployeesList")
    public JAXBElement<ViewEmployeesList> createViewEmployeesList(ViewEmployeesList value) {
        return new JAXBElement<ViewEmployeesList>(_ViewEmployeesList_QNAME, ViewEmployeesList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EmployeeWebService/", name = "editEmployeeResponse")
    public JAXBElement<EditEmployeeResponse> createEditEmployeeResponse(EditEmployeeResponse value) {
        return new JAXBElement<EditEmployeeResponse>(_EditEmployeeResponse_QNAME, EditEmployeeResponse.class, null, value);
    }

}
