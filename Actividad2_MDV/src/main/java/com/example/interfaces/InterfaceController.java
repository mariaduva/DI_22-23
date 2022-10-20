package com.example.interfaces;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class InterfaceController {
    public TextField txtInput;
    public TextArea txtOutput;
    public void onClick(ActionEvent actionEvent) {
        String txt = txtInput.getText();
        txtOutput.setText(txt);
    }
}