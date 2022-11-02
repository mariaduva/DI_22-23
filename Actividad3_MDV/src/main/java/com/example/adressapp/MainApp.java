package com.example.adressapp;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {
    private AnchorPane menu;
    private BorderPane rootLayout;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("AddressApp");
        loadLayouts();
        Scene scene = new Scene(rootLayout);
        stage.setScene(scene);
        stage.show();
    }

    private void loadLayouts() throws IOException {
        rootLayout = new FXMLLoader(MainApp.class.getResource("RootLayout.fxml")).load();
        menu = new FXMLLoader(MainApp.class.getResource("PersonOverview.fxml")).load();

        rootLayout.setCenter(menu);
    }

    public static void main(String[] args) {
        launch();
    }
}

