package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Model.Dealer;
import Model.DealerReader;
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

public class AdminDealerController implements Initializable{
	Main m = new Main();
	@FXML
	MenuBar menuBar;
	@FXML
	private TableView<Dealer> AdminDealerTable;
	@FXML
	private TableColumn<Dealer,Integer> table_id;
	@FXML
	private TableColumn<Dealer,String> table_name;
	@FXML
	private TableColumn<Dealer,String> table_address;
	@FXML
	private TableColumn<Dealer,String> table_contact;
	@FXML
	private TableColumn<Dealer,String> table_cnic;
	@FXML
	private TableColumn<Dealer,String> table_email;
	@FXML
	private TableColumn<Dealer,String> table_password;
	
	ObservableList<Dealer> list;
	
	public void goBack(ActionEvent event) throws IOException {
		Stage s = (Stage) menuBar.getScene().getWindow();
		m.changeScene(s, "../View/Admin.fxml");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		table_id.setCellValueFactory(new PropertyValueFactory<Dealer,Integer>("id"));
		table_name.setCellValueFactory(new PropertyValueFactory<Dealer,String>("name"));
		table_address.setCellValueFactory(new PropertyValueFactory<Dealer,String>("address"));
		table_contact.setCellValueFactory(new PropertyValueFactory<Dealer,String>("contact"));
		table_cnic.setCellValueFactory(new PropertyValueFactory<Dealer,String>("cnic"));
		table_email.setCellValueFactory(new PropertyValueFactory<Dealer,String>("email"));
		table_password.setCellValueFactory(new PropertyValueFactory<Dealer,String>("password"));
		
		DealerReader dealerReader = new DealerReader();
		list = dealerReader.getAllDealers();
		
		AdminDealerTable.setItems(list);
		
	}

}
