

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Owen
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyCalculator implements ActionListener {

    public JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16;
    public String num1, op, num2;
    public JTextField result;
    public JFrame f;
    public JPanel p;

    public MyCalculator() {
        num1 = "";
        op = "";
        num2 = "";
        f = new JFrame();
        p = new JPanel(new GridLayout(4, 4));
        result = new JTextField(10);
        result.setEditable(false);

        btn1 = new JButton("7");
        btn2 = new JButton("8");
        btn3 = new JButton("9");
        btn4 = new JButton("+");
        btn5 = new JButton("4");
        btn6 = new JButton("5");
        btn7 = new JButton("6");
        btn8 = new JButton("-");
        btn9 = new JButton("1");
        btn10 = new JButton("2");
        btn11 = new JButton("3");
        btn12 = new JButton("x");
        btn13 = new JButton("0");
        btn14 = new JButton("c");
        btn15 = new JButton("=");
        btn16 = new JButton("/");

        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);
        p.add(btn5);
        p.add(btn6);
        p.add(btn7);
        p.add(btn8);
        p.add(btn9);
        p.add(btn10);
        p.add(btn11);
        p.add(btn12);
        p.add(btn13);
        p.add(btn14);
        p.add(btn15);
        p.add(btn16);
        f.add(p);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);
        btn15.addActionListener(this);
        btn16.addActionListener(this);

        f.setTitle("My Calculator");
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.add(result, BorderLayout.NORTH);
        f.setSize(300, 300);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new MyCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9')) {
            if (!op.equals("")) {
                num2 += s;
                result.setText(num2);
            } else {
                num1 += s;
                result.setText(num1);
            }
        } else if (s.charAt(0) == 'c') {
            if (!op.equals("")) {
                num2 = "";
                result.setText(num2);
            } else {
                num1 = "";
                result.setText(num1);
            }
        } else if (s.charAt(0) == '=') {

            int ans;

            if (op.equals("+")) {
                ans = (Integer.parseInt(num1) + Integer.parseInt(num2));
            } else if (op.equals("-")) {
                ans = (Integer.parseInt(num1) - Integer.parseInt(num2));
            } else if (op.equals("/")) {
                ans = (Integer.parseInt(num1) / Integer.parseInt(num2));
            } else {
                ans = (Integer.parseInt(num1) * Integer.parseInt(num2));
            }
            result.setText("" + ans);
            num1 = Integer.toString(ans);
            num2 = "";
            op = "";
        } else {
            op = s;
        }
    }
}
