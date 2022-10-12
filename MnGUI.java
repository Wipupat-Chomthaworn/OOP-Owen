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

    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1, m2, m3, m4;
    private JMenuItem n2, n3, n4, n5, n6;
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;

    public MnGUI() {
        fr = new JFrame("SubMenuItem Demo");

        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        m4 = new JMenu("New");

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        fr.setJMenuBar(mb);
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

        desktopPane = new JDesktopPane();
        frame1 = new JInternalFrame("Application 01", true, true, true, true);
        frame2 = new JInternalFrame("Application 02", true, true, true, true);
        frame3 = new JInternalFrame("Application 03", true, true, true, true);
//        frame1.pack();
//        frame2.pack();
//        frame3.pack();

        frame1.setSize(300, 300);
        frame2.setSize(300, 300);
        frame3.setSize(300, 300);
        frame1.setVisible(true);
        frame2.setVisible(true);
        frame3.setVisible(true);

        frame1.setLocation(650, 100);
        frame2.setLocation(100, 500);
        frame3.setLocation(900, 600);

        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);

        fr.add(desktopPane);

        //fr.pack();
        fr.setSize(1500, 1000);
//        fr.getContentPane().setBackground(Color.black);
        desktopPane.setBackground(Color.BLACK);
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
//        MnGUI f = new MnGUI();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {
            MnGUI frame = new MnGUI();
        });
    }

}
