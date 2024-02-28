package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class bController {
	
	@FXML
	TextField tInput;
	
	// A로 이동하기
	public void moveToA(ActionEvent event) throws IOException {
		System.out.println("A 화면으로 이동합니다.");
		Main.setRoot("A");		// A.fxml 화면으로 이동
	}
	
	// 전달받은 데이터 텍스트 필드에 출력하기
	public void showData(String data) {
		tInput.setText(data);
		if(data != null) {
			tInput.getText();
		}
		System.out.println(data);
	}

}
