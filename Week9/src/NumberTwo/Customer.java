package NumberTwo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author E4ARE3H
 */
public class Customer {

    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;

    public void addAccount(Account acct) {
        this.acct[numOfAccount] = acct;
        numOfAccount += 1;
    }

    public Customer(String firstName, String lastName) {
        this.acct = new Account[5];
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {
        this.acct = new Account[5];
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
        return acct[index];
    }

    public int getNumOfAccount() {
        return numOfAccount;
    }

    public boolean equals(Customer c) {
        return (firstName.equals(c.firstName) && lastName.equals(c.lastName));
    }

}
