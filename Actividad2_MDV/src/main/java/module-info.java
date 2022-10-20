module com.example.uf3_interfaces {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.interfaces to javafx.fxml;
    exports com.example.interfaces;
}