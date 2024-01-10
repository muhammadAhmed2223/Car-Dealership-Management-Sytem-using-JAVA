package Controller;

import javafx.fxml.FXML;

import javafx.scene.control.TextField;
import Model.UserInstance;
import Model.VehicleReader;
import application.Main;
import javafx.event.ActionEvent;

import javafx.scene.control.MenuBar;

import javafx.scene.control.Label;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class CustomerModifyVehicleController {
	Main m = new Main();
	@FXML
	private MenuBar menuBar;
	@FXML
	private TextField textbox1;
	@FXML
	private TextField textbox2;
	@FXML
	private TextField textbox3;
	@FXML
	private TextField textbox4;
	@FXML
	private TextField textbox5;
	@FXML
	private Label label1;

	// Event Listener on MenuItem.onAction
	@FXML
	public void goBack(ActionEvent event) {
		Stage s = (Stage) menuBar.getScene().getWindow();
		m.changeScene(s, "../View/CustomerHome.fxml");
	}
	// Event Listener on Button.onMouseClicked
	@FXML
	public void Modify(MouseEvent event) {
		System.out.println(textbox1.getText());
		System.out.println(textbox2.getText());
		System.out.println(textbox3.getText());
		System.out.println(textbox4.getText());
		System.out.println(textbox5.getText());	
		
		String vehicleType = textbox1.getText();
		String model= textbox2.getText();
		String name = textbox3.getText();
		int year =Integer.parseInt(textbox4.getText());
		String regNo= textbox5.getText();
		
		VehicleReader vehicleReader = new VehicleReader();
		int id = vehicleReader.getVehicleId(regNo);
		
		if (id == -1) {
			label1.setText("Registration Number not found");
		} else if(id == -2) {
			label1.setText("Error!");
		}
		else {
			UserInstance.vehicleType = vehicleType;
			Stage s = (Stage) menuBar.getScene().getWindow();
			m.changeScene(s, "../View/CustomerModifyTable.fxml");
		}
	}
}
