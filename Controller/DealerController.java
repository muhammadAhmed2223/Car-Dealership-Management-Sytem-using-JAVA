package Controller;

import javafx.fxml.FXML;
import Model.UserInstance;
import application.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.MenuBar;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class DealerController {
	Main m = new Main();
	@FXML
	MenuBar menuBar;
	// Event Listener on MenuItem.onAction
	@FXML
	public void goBack(ActionEvent event) {
		Stage s = (Stage) menuBar.getScene().getWindow();
		UserInstance.userType = "None";
		m.changeScene(s, "../View/Home.fxml");
	}
	// Event Listener on Button.onMouseClicked
	@FXML
	public void submit1(MouseEvent event) {
		Stage s = (Stage) menuBar.getScene().getWindow();
		m.changeScene(s, "../View/ImportVehicle.fxml");
	}
	// Event Listener on Button.onMouseClicked
	@FXML
	public void submit2(MouseEvent event) {
		Stage s = (Stage) menuBar.getScene().getWindow();
		m.changeScene(s, "../View/Auction.fxml");
	}
	// Event Listener on Button.onMouseClicked
	@FXML
	public void submit3(MouseEvent event) {
		Stage s = (Stage) menuBar.getScene().getWindow();
		m.changeScene(s, "../View/ModificationItem.fxml");
	}
	// Event Listener on Button.onMouseClicked
	@FXML
	public void submit4(MouseEvent event) {
		Stage s = (Stage) menuBar.getScene().getWindow();
		m.changeScene(s, "../View/RepairItem.fxml");
	}
}
