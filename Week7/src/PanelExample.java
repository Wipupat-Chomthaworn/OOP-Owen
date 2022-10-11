/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB203_39
 */
import java.awt.*;
import javax.swing.*;

public class PanelExample {

    public PanelExample() {
        JFrame f = new JFrame("Panel Example");
        JPanel panel = new JPanel();
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        panel.add(b1);
        panel.add(b2);
        f.add(panel);
        f.setSize(200, 200);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new PanelExample();
    }
}
