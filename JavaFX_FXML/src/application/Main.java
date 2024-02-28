package application;

//2024-02-27 
//MSA 기반 풀스택 교육 18일차

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		
		try {
			// 모듈 설정파일(module-info.java)에 fxml 모듈 설정해야 사용 가능
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));			
			
			// Scene 생성
			Scene scene = new Scene(root);
			
			// Stage 에 Scene 등록
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}