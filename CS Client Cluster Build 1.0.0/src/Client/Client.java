/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import customerwebservice.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Thiloshon
 */
public class Client {

    public static void main(String[] args) {
        List<Customer> ans = viewCustomerList();

        for (int x = 0; x < ans.size(); x++) {
            System.out.println(((Customer) ans.get(x)).getAccountNumber());
        }

    }

    private static Customer viewCustomer(java.lang.String accountNumber) {
        customerwebservice.CustomerWebService_Service service = new customerwebservice.CustomerWebService_Service();
        customerwebservice.CustomerWebService port = service.getCustomerWebServicePort();
        return port.viewCustomer(accountNumber);
    }

    public static java.util.List<customerwebservice.Customer> viewCustomerList() {
        customerwebservice.CustomerWebService_Service service = new customerwebservice.CustomerWebService_Service();
        customerwebservice.CustomerWebService port = service.getCustomerWebServicePort();
        return port.viewCustomerList();
    }

    public static Boolean addCustomer(Customer customer) {
        customerwebservice.CustomerWebService_Service service = new customerwebservice.CustomerWebService_Service();
        customerwebservice.CustomerWebService port = service.getCustomerWebServicePort();
        return port.addCustomer(customer);
    }

    public static String operation(java.lang.String parameter) {
        customerwebservice.CustomerWebService_Service service = new customerwebservice.CustomerWebService_Service();
        customerwebservice.CustomerWebService port = service.getCustomerWebServicePort();
        return port.operation(parameter);
    }


}
