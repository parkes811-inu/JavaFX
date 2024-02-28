package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		
		try {
			// 모듈 설정파일(module-info.java)에 fxml 모듈 설정해야 사용 가능
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));			
			
			// Scene 생성
			Scene scene = new Scene(root);
			
			// 키 이벤트 등록
			setEvent(scene, root);
			
			// Stage 에 Scene 등록
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 키보드로 도형을 이동시키는 이벤트 정의
	public void setEvent(Scene scene, Parent root) {
		
		Circle circle = (Circle) root.lookup("#circle");
		
		// 원이 존재하는 경우
		if(circle != null) {
			System.out.println("원의 반지름 : " + circle.getRadius());
		}
		else {
			// 원이 존재하지 않는 경우
			System.out.println("원을 찾을 수 없습니다.");
			// 원 객체가 존재하지 않는 경우 메소드를 종료
			return;		
		}
		
		// 키 입력 이벤트 등록
		scene.setOnKeyPressed(event -> {
			double x = circle.getCenterX();		// 원의 중심 x좌표
			double y = circle.getCenterY();		// 원의 중심 y좌표
				
			switch(event.getCode()) {			// event.getCode() : 입력한 키의 코드 값
				case UP:						// switch 문을 이용한 방향키 지정
					System.out.println("UP");
					circle.setCenterY(y -= 10);
					break;
				case DOWN:
					System.out.println("DOWN");
					circle.setCenterY(y += 10);
					break;
				case LEFT:
					System.out.println("LEFT");
					circle.setCenterX(x -= 10);
					break;
				case RIGHT:
					System.out.println("RIGHT");
					circle.setCenterX(x += 10);
					break;
			}
		});
	}
	public static void main(String[] args) {
		launch(args);
	}
}
