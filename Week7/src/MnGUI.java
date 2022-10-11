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

public class MnGUI {

    private JFrame f;
    private JMenuBar mb;
    private JMenu m1, m2, m3, m4;
    private JMenuItem n2, n3, n4, n5, n6;

    public MnGUI() {
//        JDesktopPane d = new JDesktopPane();
//        JInternalFrame f1 = new JInternalFrame("Frame 1", true, true, true, true);
        f = new JFrame("SubMenuItem Demo");
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        m4 = new JMenu("New");

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        f.setJMenuBar(mb);
        n2 = new JMenuItem("Open");
        n3 = new JMenuItem("Save");
        n4 = new JMenuItem("Exit");
        n5 = new JMenuItem("Window");
        n6 = new JMenuItem("Message");
        m1.add(m4);
        m1.add(n2);
        m1.addSeparator();
        m1.add(n3);
        m1.addSeparator();
        m1.add(n4);
        m4.add(n5);
        m4.addSeparator();
        m4.add(n6);

        f.setSize(500, 500);
        f.getContentPane().setBackground(Color.black);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        MnGUI f = new MnGUI();
    }
}
