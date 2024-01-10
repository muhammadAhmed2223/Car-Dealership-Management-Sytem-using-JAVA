package Controller;

import java.io.IOException;

import Model.UserInstance;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

public class HomeController {
	@FXML
	MenuBar menuBar;
	Main m = new Main();
	public HomeController() {}
	public void initialize() {}
	@FXML
	public void custLogin(ActionEvent event) throws IOException {
		Stage s = (Stage) menuBar.getScene().getWindow();
		UserInstance.userType = "Customer";
		m.changeScene(s, "../View/Signin.fxml");
	}
	@FXML
	public void dealerLogin(ActionEvent event) throws IOException {
		Stage s = (Stage) menuBar.getScene().getWindow();
		UserInstance.userType = "Dealer";
		m.changeScene(s, "../View/Signin.fxml");
	}
	@FXML
	public void adminLogin(ActionEvent event) throws IOException {
		Stage s = (Stage) menuBar.getScene().getWindow();
		UserInstance.userType = "Admin";
		m.changeScene(s, "../View/Signin.fxml");
	}
	
	@FXML
	public void custSignup(ActionEvent event) throws IOException {
		Stage s = (Stage) menuBar.getScene().getWindow();
		UserInstance.userType = "Customer";
		m.changeScene(s, "../View/Signup.fxml");
	}
	@FXML
	public void dealerSignup(ActionEvent event) throws IOException {
		Stage s = (Stage) menuBar.getScene().getWindow();
		UserInstance.userType = "Dealer";
		m.changeScene(s, "../View/Signup.fxml");
	}
	@FXML
	public void adminSignup(ActionEvent event) throws IOException {
		Stage s = (Stage) menuBar.getScene().getWindow();
		UserInstance.userType = "Admin";
		m.changeScene(s, "../View/Signup.fxml");
	}
	
	@FXML
	public void loadAbout(ActionEvent event) throws IOException {
		
	}
}
