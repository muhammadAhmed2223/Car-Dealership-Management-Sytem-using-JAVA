package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Model.Admin;
import Model.AdminReader;
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

public class AdminAdminController implements Initializable{
	Main m = new Main();
	@FXML
	MenuBar menuBar;
	@FXML
	private TableView<Admin> AdminAdminTable;
	@FXML
	private TableColumn<Admin,Integer> table_id;
	@FXML
	private TableColumn<Admin,String> table_name;
	@FXML
	private TableColumn<Admin,String> table_address;
	@FXML
	private TableColumn<Admin,String> table_contact;
	@FXML
	private TableColumn<Admin,String> table_cnic;
	@FXML
	private TableColumn<Admin,String> table_email;
	@FXML
	private TableColumn<Admin,String> table_password;
	
	ObservableList<Admin> list;

	
	public void goBack(ActionEvent event) throws IOException {
		Stage s = (Stage) menuBar.getScene().getWindow();
		m.changeScene(s, "../View/Admin.fxml");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		table_id.setCellValueFactory(new PropertyValueFactory<Admin,Integer>("id"));
		table_name.setCellValueFactory(new PropertyValueFactory<Admin,String>("name"));
		table_address.setCellValueFactory(new PropertyValueFactory<Admin,String>("address"));
		table_contact.setCellValueFactory(new PropertyValueFactory<Admin,String>("contact"));
		table_cnic.setCellValueFactory(new PropertyValueFactory<Admin,String>("cnic"));
		table_email.setCellValueFactory(new PropertyValueFactory<Admin,String>("email"));
		table_password.setCellValueFactory(new PropertyValueFactory<Admin,String>("password"));

		AdminReader adminReader = new AdminReader();
		
		list = adminReader.getAllAdmins();
		AdminAdminTable.setItems(list);
	}

}
