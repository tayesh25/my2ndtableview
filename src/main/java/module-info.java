module com.example.my2ndtableview {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.my2ndtableview to javafx.fxml;
    exports com.example.my2ndtableview;
}