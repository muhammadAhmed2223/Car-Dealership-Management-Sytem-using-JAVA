package Controller;

import javafx.fxml.FXML;
import Model.UserInstance;
import application.Main;
import javafx.event.ActionEvent;

import javafx.scene.control.MenuBar;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class CustomerHomeController {
	Main m = new Main();
	@FXML
	private MenuBar menuBar;

	// Event Listener on Button.onMouseClicked
	@FXML
	public void RentVehicle(MouseEvent event) {
		Stage s = (Stage) menuBar.getScene().getWindow();
		m.changeScene(s, "../View/Rent.fxml");
	}
	// Event Listener on Button.onMouseClicked
	@FXML
	public void BuyVehicle(MouseEvent event) {
		Stage s = (Stage) menuBar.getScene().getWindow();
		m.changeScene(s, "../View/Buy.fxml");
	}
	// Event Listener on Button.onMouseClicked
	@FXML
	public void RepairVehicle(MouseEvent event) {
		Stage s = (Stage) menuBar.getScene().getWindow();
		m.changeScene(s, "../View/CustomerRepairVehicle.fxml");
	}
	// Event Listener on Button.onMouseClicked
	@FXML
	public void ModifyVehicle(MouseEvent event) {
		Stage s = (Stage) menuBar.getScene().getWindow();
		m.changeScene(s, "../View/CustomerModifyVehicle.fxml");
	}
	// Event Listener on MenuItem.onAction
	@FXML
	public void goBack(ActionEvent event) {
		Stage s = (Stage) menuBar.getScene().getWindow();
		UserInstance.userType = "None";
		m.changeScene(s, "../View/Home.fxml");
	}
}
