module com.example.salmontt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.salmontt to javafx.fxml;
    exports com.example.salmontt;
}