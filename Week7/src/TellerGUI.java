/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LAB203_39
 */
import java.awt.*;
import javax.swing.*;

public class TellerGUI {

    private JFrame f;
    private JPanel btnp;
    private JPanel lbp;
    private JPanel big;

    private JTextField tf;
    private JTextField tf1;

    private JLabel l1;
    private JLabel l2;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;

    public TellerGUI() {
        f = new JFrame("Teller GUI");
        btnp = new JPanel();
        lbp = new JPanel(new GridLayout(2, 2));
        big = new JPanel(new GridLayout(2, 1));

        tf = new JTextField("6000");
//        JTextField jf = new JTextField("6000", 10);
        tf1 = new JTextField();

        l1 = new JLabel("Balance");
        l2 = new JLabel("Amount");

        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");
        tf.setEditable(false);
        lbp.add(l1);
        lbp.add(tf);
        lbp.add(l2);
        lbp.add(tf1);
        btnp.add(btn1);
        btnp.add(btn2);
        btnp.add(btn3);
        big.add(lbp);
        big.add(btnp);
        f.add(big);
        f.setSize(300, 150);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
