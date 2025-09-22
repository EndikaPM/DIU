module org.endika.java.jdbc.ejemplosjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.endika.java.jdbc.ejemplosjavafx to javafx.fxml;
    exports org.endika.java.jdbc.ejemplosjavafx;
}