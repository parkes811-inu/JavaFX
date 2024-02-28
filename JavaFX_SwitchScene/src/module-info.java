module JavaFX_SwitchScene {
	requires javafx.controls;
	requires javafx.fxml;	// java fxml module add
	
	opens application to javafx.graphics, javafx.fxml;
}
