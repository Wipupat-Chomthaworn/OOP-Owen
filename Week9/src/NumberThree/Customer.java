package NumberThree;


import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owen
 */
public class Customer {

    private String firstName;
    private String lastName;
    private ArrayList acct;
    private int numOfAccount;

    public void addAccount(Account acct) {
        this.acct.add(acct);
        numOfAccount += 1;
    }

    public Customer(String firstName, String lastName) {
        this.acct = new ArrayList();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {
        this.acct = new ArrayList();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return firstName +" "+ lastName + " has " + numOfAccount + " accounts";
    }

    public Account getAccount(int index) {
        return (Account) this.acct.get(index);
    }

    public int getNumOfAccount() {
        return this.acct.size();
    }

    public boolean equals(Customer c) {
        return (firstName.equals(c.firstName) && lastName.equals(c.lastName));
    }

}
