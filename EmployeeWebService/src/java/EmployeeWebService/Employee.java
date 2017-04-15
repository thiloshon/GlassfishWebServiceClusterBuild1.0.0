/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeWebService;

/**
 *
 * @author Nipuni(X552L)
 */
public class Employee {
    
    public String name;
    public String post;
    public String userName;
    public String password;
  
    
    public Employee(String name, String post,String userName,String password){
        this.name = name;
        this.post = post;
        this.userName = userName;
        this.password = password;
        
    }
    
    public Employee(){       
        
    }

    public String getUserName() {
        return userName;
    }
    
    
}
