package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

import java.io.IOException;

import Model.UserInstance;
import application.Main;
import javafx.event.ActionEvent;

public class AdminController {
	Main m = new Main();
	@FXML
	MenuBar menuBar1;
	@FXML
	MenuBar menuBar2;
	// Event Listener on MenuItem.onAction
	@FXML
	public void goBack(ActionEvent event) throws IOException {
		Stage s = (Stage) menuBar1.getScene().getWindow();
		UserInstance.userType = "None";
		m.changeScene(s, "../View/Home.fxml");
	}
	// Event Listener on MenuItem.onAction
	@FXML
	public void adminVehicles(ActionEvent event) {
		Stage s = (Stage) menuBar1.getScene().getWindow();
		m.changeScene(s, "../View/AdminVehicles.fxml");
	}
	// Event Listener on MenuItem.onAction
	@FXML
	public void adminCustomers(ActionEvent event) {
		Stage s = (Stage) menuBar1.getScene().getWindow();
		m.changeScene(s, "../View/AdminCustomer.fxml");
	}
	// Event Listener on MenuItem.onAction
	@FXML
	public void adminDealers(ActionEvent event) {
		Stage s = (Stage) menuBar1.getScene().getWindow();
		m.changeScene(s, "../View/AdminDealer.fxml");
	}
	// Event Listener on MenuItem.onAction
	@FXML
	public void adminAdmins(ActionEvent event) {
		Stage s = (Stage) menuBar1.getScene().getWindow();
		m.changeScene(s, "../View/AdminAdmin.fxml");
	}
	
	
}
