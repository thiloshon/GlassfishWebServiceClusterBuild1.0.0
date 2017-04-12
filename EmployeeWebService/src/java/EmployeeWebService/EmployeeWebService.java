/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeWebService;

import java.util.ArrayList;
import java.util.Iterator;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 * @author Thiloshon
 */
@WebService(serviceName = "EmployeeWebService")
public class EmployeeWebService {

    ArrayList<Employee> employees = new ArrayList();

    public EmployeeWebService() {
        Employee user = new Employee("USER", "DEFAULT", "USER", "USER");
        employees.add(user);
    }
    
       

    /**
     * Web service operation
     */
    @WebMethod(operationName = "viewEmployeesList")
    public ArrayList<Employee> viewEmployeesList() {
        //TODO write your implementation code here:
        return employees;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addEmployee")
    public Boolean addEmployee(@WebParam(name = "employee") Employee employee) {
        //TODO write your implementation code here:
        employees.add(employee);
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteEmployee")
    public Boolean deleteEmployee(@WebParam(name = "employeeUserName") String employeeUserName) {
        //TODO write your implementation code here:
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            if(e.getUserName().equalsIgnoreCase(employeeUserName)){
                employees.remove(e);
                break;
            }
        }
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editEmployee")
    public Boolean editEmployee(@WebParam(name = "newEmployee") Employee newEmployee) {
        //TODO write your implementation code here:
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            if(e.getUserName().equalsIgnoreCase(newEmployee.getUserName())){
                employees.remove(e);
                employees.add(newEmployee);
                break;
            }
        }
        return true;
    }
}
