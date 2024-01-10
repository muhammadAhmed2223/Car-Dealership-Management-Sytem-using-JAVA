package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Model.Customer;
import Model.CustomerReader;
import application.Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;

import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;

public class AdminCustomerController implements Initializable{
	Main m = new Main();
	@FXML
	MenuBar menuBar;
	@FXML
	private TableView<Customer> table_main;
	@FXML
	private TableColumn<Customer,Integer> table_id;
	@FXML
	private TableColumn<Customer,String> table_name;
	@FXML
	private TableColumn<Customer,String> table_address;
	@FXML
	private TableColumn<Customer,String> table_contact;
	@FXML
	private TableColumn<Customer,String> table_cnic;
	@FXML
	private TableColumn<Customer,String> table_email;
	@FXML
	private TableColumn<Customer,String> table_password;
	
	ObservableList<Customer> list;
	
	public void goBack(ActionEvent event) throws IOException {
		Stage s = (Stage) menuBar.getScene().getWindow();
		m.changeScene(s, "../View/Admin.fxml");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		table_id.setCellValueFactory(new PropertyValueFactory<Customer,Integer>("id"));
		table_name.setCellValueFactory(new PropertyValueFactory<Customer,String>("name"));
		table_address.setCellValueFactory(new PropertyValueFactory<Customer,String>("address"));
		table_contact.setCellValueFactory(new PropertyValueFactory<Customer,String>("contact"));
		table_cnic.setCellValueFactory(new PropertyValueFactory<Customer,String>("cnic"));
		table_email.setCellValueFactory(new PropertyValueFactory<Customer,String>("email"));
		table_password.setCellValueFactory(new PropertyValueFactory<Customer,String>("password"));
		
		CustomerReader customerReader = new CustomerReader();
		
		list = customerReader.getAllCustomers();
		table_main.setItems(list);
	}

}
