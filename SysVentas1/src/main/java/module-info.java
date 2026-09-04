module pe.edu.upeu.sysventas1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens pe.edu.upeu.sysventas1 to javafx.fxml;
    exports pe.edu.upeu.sysventas1;
}