/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owen
 */
import java.awt.*;
import java.io.*;
import javax.swing.*;
//import java.awt.

public class TextEditorView implements Serializable {

    private JFrame jf;
    private JMenuBar jmb;
    private JMenu jm;

    private JMenuItem ItemNew, ItemOpen, ItemSave, ItemClose;
    private JTextArea ta;
//    private JFrame jf;
//    private JFrame jf;
//    private JFrame jf;
//    private JFrame jf;

    public TextEditorView() {
        jf = new JFrame("TextEditor");
        jmb = new JMenuBar();
        jm = new JMenu("File");
        ItemNew = new JMenuItem("New");
        ItemOpen = new JMenuItem("Open");
        ItemSave = new JMenuItem("Save");
        ItemClose = new JMenuItem("Close");
        ta = new JTextArea(20, 50);
        jmb.add(jm);
        jm.add(ItemNew);
        jm.add(ItemOpen);
        jm.add(ItemSave);
        jm.addSeparator();
        jm.add(ItemClose);
        jf.setJMenuBar(jmb);
        jf.setLayout(new FlowLayout());
        jf.add(ta);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);

    }

    public JFrame getJf() {
        return jf;
    }

    public void setJf(JFrame jf) {
        this.jf = jf;
    }

    public JMenuBar getJmb() {
        return jmb;
    }

    public void setJmb(JMenuBar jmb) {
        this.jmb = jmb;
    }

    public JMenu getJm() {
        return jm;
    }

    public void setJm(JMenu jm) {
        this.jm = jm;
    }

    public JMenuItem getItemNew() {
        return ItemNew;
    }

    public void setItemNew(JMenuItem ItemNew) {
        this.ItemNew = ItemNew;
    }

    public JMenuItem getItemOpen() {
        return ItemOpen;
    }

    public JTextArea getTa() {
        return ta;
    }

    public void setTa(JTextArea ta) {
        this.ta = ta;
    }

    public void setItemOpen(JMenuItem ItemOpen) {
        this.ItemOpen = ItemOpen;
    }

    public JMenuItem getItemSave() {
        return ItemSave;
    }

    public void setItemSave(JMenuItem ItemSave) {
        this.ItemSave = ItemSave;
    }

    public JMenuItem getItemClose() {
        return ItemClose;
    }

    public void setItemClose(JMenuItem ItemClose) {
        this.ItemClose = ItemClose;
    }

}
