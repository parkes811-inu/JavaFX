package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class aController {
	@FXML
	javafx.scene.control.TextField tInput;
	
	public void moveToB(ActionEvent event) throws IOException {
		System.out.println("B 화면으로 이동합니다.");
		
		// B로 데이터 전달
		FXMLLoader bFXML = new FXMLLoader(getClass().getResource("B.fxml"));
		Parent bRoot = bFXML.load();

		bController bController = bFXML.getController();
		
		String data = tInput.getText();	// A화면의 텍스트필드 입력 값을 가져오기
		bController.showData(data);		// A 화면에서 B 화면으로 데이터 전달.
		
		
		Main.setRoot(bRoot);		// B.fxml 화면으로 이동
	}
}
