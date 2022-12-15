package com.example.adressapp;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.stage.FileChooser;

import java.io.File;

public class RootLayoutController {

    // Referencia a la aplicación principal
    private HelloApplication mainApp;


    public void setMainApp(HelloApplication mainApp) {
        this.mainApp = mainApp;
    }


    @FXML
    private void handleNew() {
        mainApp.getPersonData().clear();
        mainApp.setPersonFilePath(null);
    }


    @FXML
    private void handleOpen() {
        FileChooser fileChooser = new FileChooser();

        // Filtro para archivos XML
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter(
                "XML files (*.xml)", "*.xml");
        fileChooser.getExtensionFilters().add(extFilter);

        // Muestra el diálogo de guardar archivo
        File file = fileChooser.showOpenDialog(mainApp.getPrimaryStage());

        if (file != null) {
            mainApp.loadPersonDataFromFile(file);
        }
    }


    @FXML
    private void handleSave() {
        File personFile = mainApp.getPersonFilePath();
        if (personFile != null) {
            mainApp.savePersonDataToFile(personFile);
        } else {
            handleSaveAs();
        }
    }

    @FXML
    private void handleSaveAs() {
        FileChooser fileChooser = new FileChooser();

        // Filtro para archivos XML
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter(
                "XML files (*.xml)", "*.xml");
        fileChooser.getExtensionFilters().add(extFilter);

        // Muestra el diálogo de guardar archivo
        File file = fileChooser.showSaveDialog(mainApp.getPrimaryStage());

        if (file != null) {
            // Asegúrese de que tiene la extensión correcta
            if (!file.getPath().endsWith(".xml")) {
                file = new File(file.getPath() + ".xml");
            }
            mainApp.savePersonDataToFile(file);
        }
    }


    @FXML
    private void handleAbout() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("AdrressApp");
        alert.setHeaderText("About");
        alert.setContentText("Author: María J. Duque Valencia");
        alert.showAndWait();
    }


    @FXML
    private void handleExit() {
        System.exit(0);
    }
}
