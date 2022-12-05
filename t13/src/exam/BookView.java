/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Owen
 */
public class BookView {

    private JFrame jf;
    private JPanel jp, jplow, jpnev, jpbut;
    private JTextField tfn, tfn2, tfp, tfp2, tft, mid;
    private JComboBox cb;
    private JButton left, right, add, update, del;

    public BookView() {
        jf = new JFrame("book");
        jp = new JPanel();
        jpnev = new JPanel();
        jplow = new JPanel();
        jpbut = new JPanel();

        tfn = new JTextField("Name");
        tfp = new JTextField("Price");

        tfp2 = new JTextField();
        tfn2 = new JTextField();
        tft = new JTextField("Type");
        mid = new JTextField();
        mid.setColumns(3);

        tfp.setEditable(false);
        tfn.setEditable(false);
        tft.setEditable(false);

        left = new JButton("<<<");
        right = new JButton(">>>");
        add = new JButton("Add");
        update = new JButton("Update");
        del = new JButton("Delete");
        cb = new JComboBox();
        cb.addItem("General");
        cb.addItem("Computer");
        cb.addItem("Math&Sci");
        cb.addItem("Photo");

        jpnev.setLayout(new FlowLayout());
        jpnev.add(left);
        jpnev.add(mid);
        jpnev.add(right);

        jpbut.setLayout(new FlowLayout());
        jpbut.add(add);
        jpbut.add(update);
        jpbut.add(del);

        jplow.setLayout(new GridLayout(2,1));
        jplow.add(jpnev);
        jplow.add(jpbut);
        
        jp.setLayout(new GridLayout(3, 2));
        jp.add(tfn);
        jp.add(tfn2);
        jp.add(tfp);
        jp.add(tfp2);
        jp.add(tft);
        jp.add(cb);

//        jf.setLayout(new GridLayout(3, 1));
        jf.add(jp, BorderLayout.NORTH);
        jf.add(jplow, BorderLayout.SOUTH);

//        jf.add(jp);
//        jf.add(jpnev);
//        jf.add(jpbut);
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

    public JFrame getJf() {
        return jf;
    }

    public void setJf(JFrame jf) {
        this.jf = jf;
    }

    public JPanel getJp() {
        return jp;
    }

    public void setJp(JPanel jp) {
        this.jp = jp;
    }

    public JTextField getTfn() {
        return tfn;
    }

    public void setTfn(JTextField tfn) {
        this.tfn = tfn;
    }

    public JTextField getTfn2() {
        return tfn2;
    }

    public void setTfn2(JTextField tfn2) {
        this.tfn2 = tfn2;
    }

    public JTextField getTfp() {
        return tfp;
    }

    public void setTfp(JTextField tfp) {
        this.tfp = tfp;
    }

    public JTextField getTfp2() {
        return tfp2;
    }

    public void setTfp2(JTextField tfp2) {
        this.tfp2 = tfp2;
    }

    public JTextField getTft() {
        return tft;
    }

    public void setTft(JTextField tft) {
        this.tft = tft;
    }

    public JTextField getMid() {
        return mid;
    }

    public void setMid(JTextField mid) {
        this.mid = mid;
    }

    public JComboBox getCb() {
        return cb;
    }

    public void setCb(JComboBox cb) {
        this.cb = cb;
    }

    public JButton getLeft() {
        return left;
    }

    public void setLeft(JButton left) {
        this.left = left;
    }

    public JButton getRight() {
        return right;
    }

    public void setRight(JButton right) {
        this.right = right;
    }

    public JButton getAdd() {
        return add;
    }

    public void setAdd(JButton add) {
        this.add = add;
    }

    public JButton getUpdate() {
        return update;
    }

    public void setUpdate(JButton update) {
        this.update = update;
    }

    public JButton getDel() {
        return del;
    }

    public void setDel(JButton del) {
        this.del = del;
    }

    public JPanel getJpnev() {
        return jpnev;
    }

    public void setJpnev(JPanel jpnev) {
        this.jpnev = jpnev;
    }

    public JPanel getJpbut() {
        return jpbut;
    }

    public void setJpbut(JPanel jpbut) {
        this.jpbut = jpbut;
    }

}
