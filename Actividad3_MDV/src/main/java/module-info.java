module com.example.adressapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.prefs;
    requires java.xml.bind;
    requires rt;
    requires jfxrt;


    opens com.example.adressapp to javafx.fxml;
    exports com.example.adressapp;
}