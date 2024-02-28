package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
	
	// 레이아웃
	@FXML
	private AnchorPane scenePane;
	Stage stage;
	public void logout(ActionEvent event) {
		System.out.println("Click logout....");
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("로그아웃");
		alert.setContentText("종료 전에 저장하시겠습니까?");
		
		// logout 처리 메소드
		if(alert.showAndWait().get() == ButtonType.OK) {
			stage = (Stage)(scenePane.getScene().getWindow());
			
			System.out.println("프로그램을 종료합니다....");
			stage.close();
		}
	}
}
