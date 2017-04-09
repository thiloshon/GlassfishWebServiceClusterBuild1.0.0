package GUIApplication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Thiloshon
 */
public class Customer {
    public String accountNumber;
    public String accountType;
    public String address;
    public String birthDate;
    public String balance;
    public String card;
    public String email;
    public String mobile;
    public String name;
    public String sortCode;

    public Customer(String accountNumber, String accountType, String address, String birthDate, String balance, String card, String email, String mobile, String name, String sortCode) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.address = address;
        this.birthDate = birthDate;
        this.balance = balance;
        this.card = card;
        this.email = email;
        this.mobile = mobile;
        this.name = name;
        this.sortCode = sortCode;
    }

    Customer() {

    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }


}
