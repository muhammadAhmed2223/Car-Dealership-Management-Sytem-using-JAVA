package application;

import Model.UserInstance;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			UserInstance.userType = "None";
			UserInstance.currentAdmin = null;
			UserInstance.currentDealer = null;
			UserInstance.currentCustomer = null;
			UserInstance.vehicleType = null;
			
			Parent root = FXMLLoader.load(getClass().getResource("../View/Home.fxml"));
            Scene scene=new Scene(root);
			primaryStage.setTitle("Dealership MS by Encore");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void changeScene(Stage s, String path) {
		try {
			Parent root;
			root = FXMLLoader.load(getClass().getResource(path));
			Scene scene = new Scene(root);
			s.setTitle("Dealership MS by Encore");
			s.setScene(scene);
			s.show();
			if (path == "../View/Home.fxml") {
				UserInstance.userType = "None";
				UserInstance.currentAdmin = null;
				UserInstance.currentDealer = null;
				UserInstance.currentCustomer = null;
				UserInstance.vehicleType = null;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
