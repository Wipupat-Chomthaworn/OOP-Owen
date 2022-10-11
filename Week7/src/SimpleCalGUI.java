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

public class SimpleCalGUI {

    public SimpleCalGUI() {
        JFrame f = new JFrame("SimpleCalGUI");
        JPanel flowbtnp = new JPanel();
        JPanel btmp = new JPanel(new GridLayout(2, 1));
        JPanel topTfp = new JPanel(new GridLayout(2, 1));
        JPanel bigp = new JPanel(new GridLayout(2, 1));

        JTextField jf = new JTextField();
        JTextField jf1 = new JTextField();
        JTextField jf2 = new JTextField();

        JButton bn1 = new JButton("+");
        JButton bn2 = new JButton("-");
        JButton bn3 = new JButton("x");
        JButton bn4 = new JButton("/");
        topTfp.add(jf);
        topTfp.add(jf1);
        flowbtnp.add(bn1);
        flowbtnp.add(bn2);
        flowbtnp.add(bn3);
        flowbtnp.add(bn4);
        btmp.add(flowbtnp);
        btmp.add(jf2);
        bigp.add(topTfp);
        bigp.add(btmp);
        f.add(bigp);
//        f.pack();
        f.setSize(500, 200);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

//    public static void main(String[] args) {
//        SimpleCalGUI f = new SimpleCalGUI();
//    }
}
