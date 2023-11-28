module com.example.comp228_lab5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp228_lab5 to javafx.fxml;
    exports com.example.comp228_lab5;
}