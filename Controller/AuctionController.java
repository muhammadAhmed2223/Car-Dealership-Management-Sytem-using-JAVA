package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Model.AddAuction;
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

public class AuctionController implements Initializable{
	Main m = new Main();
	@FXML
	Label label1;
	@FXML
	private MenuBar menuBar;
	@FXML
	private TextField basePrice;
	@FXML
	private TextField vehicleID;
	@FXML
	private TextField lastDate;
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
		m.changeScene(s, "../View/Dealer.fxml");
	}
	// Event Listener on Button.onMouseClicked
	@FXML
	public void postAuction(MouseEvent event) {
		AddAuction addAuction = new AddAuction();
		boolean result = addAuction.addNewAuction(Integer.parseInt(vehicleID.getText()), lastDate.getText(),Integer.parseInt(basePrice.getText()));
		if (result) {
			label1.setText("Successfully Posted!");
		} else {
			label1.setText("Error");
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
