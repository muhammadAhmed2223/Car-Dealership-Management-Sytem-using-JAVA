package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Model.Vehicle;
import Model.VehicleReader;
import application.Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableColumn;

public class AdminVehiclesController implements Initializable {
	Main m = new Main();
	@FXML
	MenuBar menuBar;
	@FXML
	private TableView <Vehicle> mainTable;
	@FXML
	private TableColumn <Vehicle,Integer> table_id;
	@FXML
	private TableColumn <Vehicle,String> table_regNo;
	@FXML
	private TableColumn <Vehicle,String> table_company;
	@FXML
	private TableColumn <Vehicle,String> table_model;
	@FXML
	private TableColumn <Vehicle,String> table_type;
	@FXML
	private TableColumn <Vehicle,Integer> table_price;
	@FXML
	private TableColumn <Vehicle,Integer> table_year;
	@FXML
	private TableColumn <Vehicle,String> table_color;
	@FXML
	private TableColumn <Vehicle,Integer> table_rentPerDay;
	@FXML
	private TableColumn <Vehicle,String> table_rented;
	@FXML
	private TableColumn <Vehicle,String> table_sold;
	
	
	ObservableList<Vehicle> list;
	
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
		table_rentPerDay.setCellValueFactory(new PropertyValueFactory<Vehicle,Integer>("rentPerDay"));
		table_rented.setCellValueFactory(new PropertyValueFactory<Vehicle,String>("rented"));
		table_sold.setCellValueFactory(new PropertyValueFactory<Vehicle,String>("sold"));
		
		VehicleReader vehicleReader = new VehicleReader();
		
		list = vehicleReader.getAllVehicles();
		mainTable.setItems(list);
	}
	
	public void goBack(ActionEvent event) throws IOException {
		Stage s = (Stage) menuBar.getScene().getWindow();
		m.changeScene(s, "../View/Admin.fxml");
	}

}
