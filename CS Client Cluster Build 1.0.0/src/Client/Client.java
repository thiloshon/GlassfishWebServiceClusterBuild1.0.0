/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import customerwebservice.Customer;
import employeewebservice.Employee;
import employeewebservice.EmployeeWebService;
import employeewebservice.EmployeeWebService_Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Thiloshon
 */
public class Client {

    public static Boolean addEmployee(employeewebservice.Employee employee) {
        employeewebservice.EmployeeWebService_Service service = new employeewebservice.EmployeeWebService_Service();
        employeewebservice.EmployeeWebService port = service.getEmployeeWebServicePort();
        return port.addEmployee(employee);
    }

    public static void main(String[] args) {
        List<Customer> ans = viewCustomerList();

        for (int x = 0; x < ans.size(); x++) {
            System.out.println(((Customer) ans.get(x)).getAccountNumber());
        }

    }

    public static Boolean deleteEmployee(java.lang.String employeeUserName) {
        employeewebservice.EmployeeWebService_Service service = new employeewebservice.EmployeeWebService_Service();
        employeewebservice.EmployeeWebService port = service.getEmployeeWebServicePort();
        return port.deleteEmployee(employeeUserName);
    }

    public static Boolean editEmployee(employeewebservice.Employee newEmployee) {
        employeewebservice.EmployeeWebService_Service service = new employeewebservice.EmployeeWebService_Service();
        employeewebservice.EmployeeWebService port = service.getEmployeeWebServicePort();
        return port.editEmployee(newEmployee);
    }

    public static java.util.List<employeewebservice.Employee> viewEmployeesList() {
        employeewebservice.EmployeeWebService_Service service = new employeewebservice.EmployeeWebService_Service();
        employeewebservice.EmployeeWebService port = service.getEmployeeWebServicePort();
        return port.viewEmployeesList();
    }

    public static Boolean addCustomer(customerwebservice.Customer customer) {
        customerwebservice.CustomerWebService_Service service = new customerwebservice.CustomerWebService_Service();
        customerwebservice.CustomerWebService port = service.getCustomerWebServicePort();
        return port.addCustomer(customer);
    }

    public static Boolean deleteCustomer(java.lang.String iD) {
        customerwebservice.CustomerWebService_Service service = new customerwebservice.CustomerWebService_Service();
        customerwebservice.CustomerWebService port = service.getCustomerWebServicePort();
        return port.deleteCustomer(iD);
    }

    public static Boolean editCustomer(customerwebservice.Customer newCustomer) {
        customerwebservice.CustomerWebService_Service service = new customerwebservice.CustomerWebService_Service();
        customerwebservice.CustomerWebService port = service.getCustomerWebServicePort();
        return port.editCustomer(newCustomer);
    }

    public static java.util.List<customerwebservice.Customer> viewCustomerList() {
        customerwebservice.CustomerWebService_Service service = new customerwebservice.CustomerWebService_Service();
        customerwebservice.CustomerWebService port = service.getCustomerWebServicePort();
        return port.viewCustomerList();
    }

    

    
    
    


}
