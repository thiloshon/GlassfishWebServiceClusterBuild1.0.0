/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeWebService;

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
@WebService(serviceName = "EmployeeWebService")
public class EmployeeWebService {

    ArrayList<Employee> employees = new ArrayList();

    public EmployeeWebService() {        
        loadData();
        if (employees.size() == 0) {
            Employee user = new Employee("USER", "DEFAULT", "USER", "USER");
            employees.add(user);
        }
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
        saveData();
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
            if (e.getUserName().equalsIgnoreCase(employeeUserName)) {
                employees.remove(e);
                saveData();
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
            if (e.getUserName().equalsIgnoreCase(newEmployee.getUserName())) {
                employees.remove(e);
                employees.add(newEmployee);
                saveData();
                break;
            }
        }
        return true;
    }

    public void saveData() {
        File file = new File("C:\\Users\\Thiloshon\\NetBeans Project\\CS\\EmployeeWebService\\data\\data.txt");

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
        for (Employee employee : employees) {
            try {
                oos.writeObject(employee);
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
        // C:\Users\Thiloshon\AppData\Roaming\NetBeans\8.2\config\GF_4.1.1\domain1\config\data.txt
        File file = new File("C:\\Users\\Thiloshon\\NetBeans Project\\CS\\EmployeeWebService\\data\\data.txt");
        
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
                while (ois != null) {
                    try {
                        Employee emp = (Employee) ois.readObject();
                        // for(Student stu : studentsList){
                        //    if(st.getiDNo()!=stu.getiDNo()){
                        employees.add(emp);
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
