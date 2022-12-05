/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owen
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TextEditorModel {
//    private TextEditorView view;
//        private TextEditorController model;

    private String text;
    private String msg;

    public void loadText(File f, TextEditorView view) {
        try ( FileInputStream fin = new FileInputStream(f)) {
            int ch = fin.read();
            msg = "";
            while (ch != -1) {
                msg = msg + (char) ch;
                ch = fin.read();
            }
            view.getTa().setText(msg);
            System.out.println("Opened");
        } catch (Exception e) {
            System.out.println("Can't");
        }

    }

    public void saveText(File f, String view) {
        try ( FileOutputStream fout = new FileOutputStream(f)) {
            for (int i = 0; i < view.length(); i++) {
                fout.write(view.charAt(i));
            }
            System.out.println("done");

        } catch (Exception e) {
            System.out.println("Can't");
        }
    }
}
