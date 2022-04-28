module com.example.termtwo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.termtwo to javafx.fxml;
    exports com.example.termtwo;
}