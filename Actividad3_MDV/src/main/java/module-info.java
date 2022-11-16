module com.example.adressapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.adressapp to javafx.fxml;
    exports com.example.adressapp;
}