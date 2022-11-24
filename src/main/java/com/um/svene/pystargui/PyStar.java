package com.um.svene.pystargui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PyStar extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PyStar.class.getResource("PyStage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("PyStar Generator by Svene");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}