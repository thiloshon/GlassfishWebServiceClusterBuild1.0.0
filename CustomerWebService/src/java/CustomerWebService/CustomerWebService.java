/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerWebService;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 * @author Thiloshon
 */
@WebService(serviceName = "CustomerWebService")
public class CustomerWebService {

    ArrayList<Customer> f = new ArrayList();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "viewCustomerList")
    public ArrayList<Customer> viewCustomerList() {
        //TODO write your implementation code here:

        return f;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "viewCustomer")
    public Customer viewCustomer(@WebParam(name = "accountNumber") String accountNumber) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addCustomer")
    public Boolean addCustomer(@WebParam(name = "customer") Customer customer) {
        //TODO write your implementation code here:

        f.add(customer);
        System.out.println("printing: " + customer.accountNumber);
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public String operation(@WebParam(name = "parameter") String parameter) {
        //TODO write your implementation code here:

        f.add(new Customer("9000010", "Current", "Colombo", "21-12-1996", "299.99", "Debit", "shon@gmail.com", "0778485789", "Ashwin", "SORT0474"));
        f.add(new Customer("9000011", "Fixed", "Kandy", "01-12-1896", "1499.99", "Debit", "shonny@gmail.com", "0775485789", "Thilo", "SORT0494"));
        return parameter + " asdf";
    }
}
