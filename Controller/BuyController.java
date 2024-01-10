package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Model.AddPayment;
import Model.Vehicle;
import Model.VehicleReader;
import application.Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class BuyController implements Initializable{
	Main m = new Main();
	@FXML
	Label label1;
	@FXML
	private MenuBar menuBar;
	@FXML
	private TextField vehicleID;
	@FXML
	private TextField ccn;
	@FXML
	private TableView<Vehicle> table_main;
	@FXML
	private TableColumn<Vehicle,Integer> table_id;
	@FXML
	private TableColumn<Vehicle,String> table_regNo;
	@FXML
	private TableColumn<Vehicle,String> table_company;
	@FXML
	private TableColumn<Vehicle,String> table_model;
	@FXML
	private TableColumn<Vehicle,String> table_type;
	@FXML
	private TableColumn<Vehicle,Integer> table_price;
	@FXML
	private TableColumn<Vehicle,Integer> table_year;
	@FXML
	private TableColumn<Vehicle,String> table_color;
	
	ObservableList<Vehicle> list;
	// Event Listener on MenuItem.onAction
	@FXML
	public void goBack(ActionEvent event) throws IOException {
		Stage s = (Stage) menuBar.getScene().getWindow();
		m.changeScene(s, "../View/CustomerHome.fxml");
	}
	// Event Listener on Button.onMouseClicked
	@FXML
	public void purhcase(MouseEvent event) {
		VehicleReader vehicleReader = new VehicleReader();
		int price = vehicleReader.getVehiclePrice(Integer.parseInt(vehicleID.getText()));
		if (price == -1 || price == -2) {
			label1.setText("Purchase Failed!");
			return;
		}
		
		String ccnStr = ccn.getText();
		
		boolean result1 = vehicleReader.buyVehicle(Integer.parseInt(vehicleID.getText()));
		AddPayment addPayment = new AddPayment();
		boolean result2 = addPayment.addNewPayment(ccnStr, "Buy Vehicle", price);
		
		if (result1 && result2) {
			label1.setText("Purchase Complete!");
		} else {
			label1.setText("Purchase Failed!");
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		table_id.setCellValueFactory(new PropertyValueFactory<Vehicle,Integer>("id"));
		table_regNo.setCellValueFactory(new PropertyValueFactory<Vehicle,String>("regNo"));
		table_company.setCellValueFactory(new PropertyValueFactory<Vehicle,String>("company"));
		table_model.setCellValueFactory(new PropertyValueFactory<Vehicle,String>("model"));
		table_type.setCellValueFactory(new PropertyValueFactory<Vehicle,String>("type"));
		table_price.setCellValueFactory(new PropertyValueFactory<Vehicle,Integer>("price"));
		table_year.setCellValueFactory(new PropertyValueFactory<Vehicle,Integer>("year"));
		table_color.setCellValueFactory(new PropertyValueFactory<Vehicle,String>("color"));
		
		VehicleReader vehicleReader = new VehicleReader();
		
		list = vehicleReader.getAvailableVehicles();
		table_main.setItems(list);
		
	}
}
