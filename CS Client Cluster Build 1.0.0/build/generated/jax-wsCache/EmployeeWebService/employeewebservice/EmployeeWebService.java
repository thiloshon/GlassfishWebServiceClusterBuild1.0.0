
package employeewebservice;

import java.util.List;
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
@WebService(name = "EmployeeWebService", targetNamespace = "http://EmployeeWebService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeWebService {


    /**
     * 
     * @param employee
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addEmployee", targetNamespace = "http://EmployeeWebService/", className = "employeewebservice.AddEmployee")
    @ResponseWrapper(localName = "addEmployeeResponse", targetNamespace = "http://EmployeeWebService/", className = "employeewebservice.AddEmployeeResponse")
    @Action(input = "http://EmployeeWebService/EmployeeWebService/addEmployeeRequest", output = "http://EmployeeWebService/EmployeeWebService/addEmployeeResponse")
    public Boolean addEmployee(
        @WebParam(name = "employee", targetNamespace = "")
        Employee employee);

    /**
     * 
     * @param newEmployee
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editEmployee", targetNamespace = "http://EmployeeWebService/", className = "employeewebservice.EditEmployee")
    @ResponseWrapper(localName = "editEmployeeResponse", targetNamespace = "http://EmployeeWebService/", className = "employeewebservice.EditEmployeeResponse")
    @Action(input = "http://EmployeeWebService/EmployeeWebService/editEmployeeRequest", output = "http://EmployeeWebService/EmployeeWebService/editEmployeeResponse")
    public Boolean editEmployee(
        @WebParam(name = "newEmployee", targetNamespace = "")
        Employee newEmployee);

    /**
     * 
     * @param employeeUserName
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteEmployee", targetNamespace = "http://EmployeeWebService/", className = "employeewebservice.DeleteEmployee")
    @ResponseWrapper(localName = "deleteEmployeeResponse", targetNamespace = "http://EmployeeWebService/", className = "employeewebservice.DeleteEmployeeResponse")
    @Action(input = "http://EmployeeWebService/EmployeeWebService/deleteEmployeeRequest", output = "http://EmployeeWebService/EmployeeWebService/deleteEmployeeResponse")
    public Boolean deleteEmployee(
        @WebParam(name = "employeeUserName", targetNamespace = "")
        String employeeUserName);

    /**
     * 
     * @return
     *     returns java.util.List<employeewebservice.Employee>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "viewEmployeesList", targetNamespace = "http://EmployeeWebService/", className = "employeewebservice.ViewEmployeesList")
    @ResponseWrapper(localName = "viewEmployeesListResponse", targetNamespace = "http://EmployeeWebService/", className = "employeewebservice.ViewEmployeesListResponse")
    @Action(input = "http://EmployeeWebService/EmployeeWebService/viewEmployeesListRequest", output = "http://EmployeeWebService/EmployeeWebService/viewEmployeesListResponse")
    public List<Employee> viewEmployeesList();

}
