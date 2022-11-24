module com.um.svene.pystargui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.um.svene.pystargui to javafx.fxml;
    exports com.um.svene.pystargui;
}