package NumberOne;

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
    private CheckingAccount acct;

    public Customer(String firstName, String lastName, CheckingAccount acct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }

    public Customer(String firstName, String lastName) {
        this(firstName, lastName, null);
    }

    public Customer() {
        this("", "", null);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public CheckingAccount getAcct() {
        return acct;
    }

    @Override
    public String toString() {
        if (acct != null) {
            return ("The " + firstName + " account has " + acct.balance + " baht and " + acct.getCredit() + " credits.");
        } else {
            return (firstName + " " + lastName + " doesn’t have account.");
        }
    }

    public boolean equals(Customer c) {
        return (firstName.equals(c.firstName) && lastName.equals(c.lastName));
    }

}