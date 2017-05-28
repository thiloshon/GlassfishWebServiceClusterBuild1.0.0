/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerWebService;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        loadData();

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
        saveData();
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
                saveData();
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
                saveData();
                break;
            }
        }
        return true;
    }
    
    
    public void saveData() {
        File file = new File("C:\\Users\\Thiloshon\\NetBeans Project\\CS\\CustomerWebService\\data\\data.txt");

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Customer cus : f) {
            try {
                oos.writeObject(cus);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            oos.flush();
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * This method loads the objects in the binary format from the file.
     */
    public void loadData() {
        File file = new File("C:\\Users\\Thiloshon\\NetBeans Project\\CS\\CustomerWebService\\data\\data.txt");
        FileInputStream fis = null;
        //System.out.print("hi1");
        try {
            fis = new FileInputStream(file);

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found1");
        }
        ObjectInputStream ois = null;
        
        

        try {

            if (fis.available() != 0) {
                //System.out.print("hi2");
                ois = new ObjectInputStream(fis);
                f = new ArrayList();
                while (ois != null) {
                    try {
                        Customer emp = (Customer) ois.readObject();
                        // for(Student stu : studentsList){
                        //    if(st.getiDNo()!=stu.getiDNo()){
                        f.add(emp);
                        //   }
                        //  }

                        //  System.out.println("hi3");
                        //System.out.print(st);
                    } catch (EOFException e) {
                        break;
                    }

                }
            }
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();

            //e3.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
