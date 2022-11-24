package com.um.svene.pystargui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PyStar_Controller {
    @FXML
    private TextArea PyContainer;

    @FXML
    private TextField PySize;

    @FXML
    void onGeneratePyStar(ActionEvent event) {
        int size = Integer.parseInt(PySize.getText());
        PyContainer.appendText("\n");
        for(int i = 0; i < size; i++) {
            for(int j = i; j < size; j++) {
                PyContainer.appendText("  *  ");
            }
            PyContainer.appendText("\n");
        }
    }

    @FXML
    void onResetPyStar(ActionEvent event) {
        PyContainer.clear();
    }
}