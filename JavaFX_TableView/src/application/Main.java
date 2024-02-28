package application;
	
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private static Scene scene;
	public static List<Board> boardList = new ArrayList<Board>();	
	@Override
	public void start(Stage stage) {
		try {
			scene = new Scene(loadFXML("Main"));
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// fxml 로 부터 레이아웃(root)를 가져오기
	private static Parent loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
		return fxmlLoader.load();
	}
	
	// 현재 Scene의 fxml(레이아웃) 재정의하기 -> 화면 이동
	static void setRoot(String fxml) throws IOException {
		scene.setRoot(loadFXML(fxml));
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
