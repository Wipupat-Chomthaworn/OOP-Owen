/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Owen
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TellerGUI implements ActionListener {

    public JFrame f;
    public JPanel p, p1, p2;
    public JTextField jf, jf1;
    public JLabel l1, l2;
    public JButton bn1, bn2, exi;
    public Account a1;

    public TellerGUI() {
        a1 = new Account(6000, "the bank");
        f = new JFrame("Teller GUI");
        p = new JPanel();
        p1 = new JPanel(new GridLayout(2, 2));
        p2 = new JPanel(new GridLayout(2, 1));

        jf = new JTextField("6000", 10);
        jf1 = new JTextField(10);

        l1 = new JLabel("Balance");
        l2 = new JLabel("Amount");

        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        exi = new JButton("Exit");
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        exi.addActionListener(this);
        jf.setEditable(false);
        p1.add(l1);
        p1.add(jf);
        p1.add(l2);
        p1.add(jf1);
        p.add(bn1);
        p.add(bn2);
        p.add(exi);
        p2.add(p1);
        p2.add(p);
        f.add(p2);
        f.setSize(300, 150);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        TellerGUI f = new TellerGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();//return string text in source

        if (e.getSource().equals(exi)) {
//            s.equals("Exit")
            System.exit(0);
//            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

//            s.equals("Exit")
            //            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        } else {
            String vfamntf = jf1.getText();
            int value = Integer.parseInt(vfamntf);

            if (s.equals("Deposit")) {
                a1.deposit(value);
//            System.out.println(a1.balance);

            } else if (s.equals("Withdraw")) {
                a1.withdraw(value);
//            System.out.println(a1.balance);
            }
        }
        jf.setText("" + a1.getBalance());
        jf1.setText("");
    }
}
