
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Owen
 */
public class TextEditorController implements ActionListener {

    private TextEditorView view;
    private TextEditorModel model;

    public TextEditorController() {
        view = new TextEditorView();
        model = new TextEditorModel();
        view.getItemNew().addActionListener(this);
        view.getItemOpen().addActionListener(this);
        view.getItemSave().addActionListener(this);
        view.getItemClose().addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("New")) {
            view.getTa().setText("");
        } else if (e.getActionCommand().equals("Open")) {
            JFileChooser jf = new JFileChooser();
            jf.showOpenDialog(jf);
            File f = jf.getSelectedFile();
            model.loadText(f, view);
        } else if (e.getActionCommand().equals("Save")) {
            JFileChooser jf = new JFileChooser();
            jf.showSaveDialog(jf);
            File f = jf.getSelectedFile();
            model.saveText(f, view.getTa().getText());
        } else if (e.getActionCommand().equals("Close")) {
            System.exit(0);
        }

    }
}
