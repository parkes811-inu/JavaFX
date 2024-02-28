package application;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class Controller implements Initializable {

	@FXML
	private TableView<Board> boardTableView;
	@FXML
	private TableColumn<Board, Integer> colNo;
	@FXML
	private TableColumn<Board, Integer> colTitle;
	@FXML
	private TableColumn<Board, Integer> colWriter;
	@FXML
	private TableColumn<Board, Date> colRegDate;
	@FXML
	private TableColumn<Board, Integer> colView;
	
	/* 연결된 화면(fxml)의 요소에 대한 초기화 작업을 하는 메소드 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Board board1 = new Board("제목1", "작성자1", "내용1");
		Board board2 = new Board("제목2", "작성자2", "내용2");
		Board board3 = new Board("제목3", "작성자3", "내용3");
		
		if(Main.boardList.size() == 0) {
			Main.boardList.add(board1);
			Main.boardList.add(board2);
			Main.boardList.add(board3);
		}
		// * TableCoulumn에 Board 객체의 getter 이름 지정하기
		// setCellValueFactory()						: 셀의 값을 지정하는 메소드
		// new PropertyVlaueFactory(" getter name ")	: 값으로 들어갈 객체의 getter 이름을 지정하는 객체
		// ** getter name : getXXX. -> get 을 제외한 getter method 이름
		// ex) getNo() --> No
		// *** module-info.java --> java.base module 을 추가해야한다.
		
		colNo.setCellValueFactory( new PropertyValueFactory<>("No"));
		colTitle.setCellValueFactory( new PropertyValueFactory<>("Title"));
		colWriter.setCellValueFactory( new PropertyValueFactory<>("Writer"));
		colRegDate.setCellValueFactory( new PropertyValueFactory<>("RegDate"));
		colView.setCellValueFactory( new PropertyValueFactory<>("View"));
		
		// add to TableView
		ObservableList<Board> list = FXCollections.observableArrayList(
				Main.boardList
		);
		boardTableView.setItems(list);
	};
		
	// 글쓰기 클릭 메소드
	public void moveToInsert(ActionEvent event) throws IOException {
		System.out.println("글쓰기 화면으로 이동합니다.");
		Main.setRoot("Insert");		// Insert.fxml 화면으로 이동
	}
}
