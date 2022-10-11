/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_39
 */
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class CalculatorSample {

    private JFrame f;
    private JPanel pb;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton plus;

    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton dash;

    private JButton b1;
    private JButton b2;
    private JButton b3;

    private JButton mul;
    private JButton b0;
    private JButton equ;
    private JButton clr;

    private JButton dev;
    private JPanel text;
    private JTextField ta;

    public CalculatorSample() {
        f = new JFrame("My Calculator");

        pb = new JPanel();
//        text = new JPanel();
        ta = new JTextField();
//        text.add(ta);

        f.setLayout(new BorderLayout());
        pb.setLayout(new GridLayout(4, 4));
        plus = new JButton("+");
        dash = new JButton("-");
        mul = new JButton("*");
        dev = new JButton("/");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        clr = new JButton("c");
        equ = new JButton("=");

//        f.setSize(200, 200); size set auto if using pack() (up to componant)
        pb.add(b7);
        pb.add(b8);
        pb.add(b9);
        pb.add(plus);

        pb.add(b4);
        pb.add(b5);
        pb.add(b6);
        pb.add(dash);

        pb.add(b1);
        pb.add(b2);
        pb.add(b3);
        pb.add(mul);

        pb.add(b0);
        pb.add(clr);
        pb.add(equ);
        pb.add(dev);
        
//        f.add(text,BorderLayout.NORTH);
        f.add(ta,BorderLayout.NORTH);
        f.add(pb,BorderLayout.CENTER);
//        f.setLayout(new FlowLayout());
        f.pack();
        f.setVisible(true);
    }
}
