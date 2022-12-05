package NumberThree;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Owen
 */
public class Main {

    public static void main(String[] args) {
        Customer cust = new Customer("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(3000, "Somsri02");
        Account acct3 = new Account(3000, "Somsri03");
        Account acct4 = new Account(3000, "Somsri04");
        Account acct5 = new Account(3000, "Somsri05");
        Account acct6 = new Account(3000, "Somsri06");

        cust.addAccount(acct1);
        cust.addAccount(acct2);
        cust.addAccount(acct3);
        cust.addAccount(acct4);
        cust.addAccount(acct5);
        cust.addAccount(acct6);

        // ทดลองฝากเงิน ถอนเงินในบัญชีต่างๆ
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);
        cust.getAccount(2).deposit(2000);
        cust.getAccount(3).deposit(1000);
        cust.getAccount(4).deposit(1500);
        cust.getAccount(5).deposit(500);
 
        System.out.println("=====================");
        // แสดงข้อมูลของลูกค้า เช่น Somsri Boonjing has 2 accounts.
        System.out.println(cust);
        System.out.println("=====================");

        // ทดลองสร้างบัญชีและเพิEมบัญชีนัFนๆ ให้กับลูกค้า มากกว่า 5 บัญชี
        for (int i = 0; i < cust.getNumOfAccount(); i++) {
            cust.getAccount(i).showAccount();
        }
    }
}
