/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerWebService;

import java.util.ArrayList;
import java.util.Iterator;
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
    @WebMethod(operationName = "editCustomer")
    public Boolean editCustomer(@WebParam(name = "newCustomer") Customer newCustomer) {
        //TODO write your implementation code here:
        Iterator<Customer> iterator = f.iterator();
        while (iterator.hasNext()) {
            Customer e = iterator.next();
            if(e.accountNumber.equalsIgnoreCase(newCustomer.accountNumber)){
                f.remove(e);
                f.add(newCustomer);
                break;
            }
        }
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteCustomer")
    public Boolean deleteCustomer(@WebParam(name = "iD") String iD) {
        //TODO write your implementation code here:
        Iterator<Customer> iterator = f.iterator();
        while (iterator.hasNext()) {
            Customer e = iterator.next();
            if(e.accountNumber.equalsIgnoreCase(iD)){
                f.remove(e);
                break;
            }
        }
        return true;
    }

}
