package CustomerWebService;

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

    /**
     *
     * @param accountNumber
     * @param accountType
     * @param address
     * @param birthDate
     * @param balance
     * @param card
     * @param email
     * @param mobile
     * @param name
     * @param sortCode
     */
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

    public Customer() {
    }


}
