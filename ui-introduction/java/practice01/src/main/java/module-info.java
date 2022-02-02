module edu.tuq.lab.practice01 {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires java.desktop;

    opens edu.tuq.lab.practice01 to javafx.fxml;
    exports edu.tuq.lab.practice01;
}
