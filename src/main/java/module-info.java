module com.example.pr5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pr5 to javafx.fxml;
    exports com.example.pr5;
}