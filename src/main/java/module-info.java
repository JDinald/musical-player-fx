module lv.poznak {
    requires javafx.controls;
    requires javafx.fxml;

    opens lv.poznak.controllers to javafx.fxml;
   // opens lv.poznak to javafx.fxml;
    exports lv.poznak;
}