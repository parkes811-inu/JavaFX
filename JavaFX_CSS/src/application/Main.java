package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			
			Parent root = FXMLLoader().load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root,400,400);
			
			// CSS 적용
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private FXMLLoader FXMLLoader() {
		return null;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
