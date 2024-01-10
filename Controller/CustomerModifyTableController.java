package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

import Model.AddPayment;
import Model.ModificationItem;
import Model.ModificationItemReader;
import application.Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import javafx.scene.control.MenuBar;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class CustomerModifyTableController implements Initializable{
	Main m = new Main();
	@FXML
	MenuBar menuBar;
	@FXML
	private TextField vehicleID;
	@FXML
	private TextField cnn;
	@FXML
	private Label label1;
	@FXML
	private MenuBar meunBar;
	@FXML
	private TableView<ModificationItem> table_main;
	@FXML
	private TableColumn<ModificationItem,Integer> table_ID;
	@FXML
	private TableColumn<ModificationItem,String> table_modificationName;
	@FXML
	private TableColumn<ModificationItem,String> table_vehicleType;
	@FXML
	private TableColumn<ModificationItem,Integer> table_cost;
	
	ObservableList<ModificationItem> list;

	// Event Listener on Button.onMouseClicked
	@FXML
	public void modify(MouseEvent event) {
		ModificationItemReader modifyReader = new ModificationItemReader();
		int price = modifyReader.getModificationPrice(Integer.parseInt(vehicleID.getText()));
		if (price == -1 || price == -2) {
			label1.setText("Purchase Failed!");
			return;
		}
		
		String ccnStr = cnn.getText();
		
		AddPayment addPayment = new AddPayment();
		boolean result = addPayment.addNewPayment(ccnStr, "Modification", price);
		
		if (result) {
			label1.setText("Purchase Complete!");
		} else {
			label1.setText("Purchase Failed!");
		}
	}
	// Event Listener on MenuItem.onAction
	@FXML
	public void goBack(ActionEvent event) {
		Stage s = (Stage) menuBar.getScene().getWindow();
		m.changeScene(s, "../View/CustomerHome.fxml");
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		table_ID.setCellValueFactory(new PropertyValueFactory<ModificationItem,Integer>("id"));
		table_modificationName.setCellValueFactory(new PropertyValueFactory<ModificationItem,String>("modificationName"));
		table_vehicleType.setCellValueFactory(new PropertyValueFactory<ModificationItem,String>("vehicleType"));
		table_cost.setCellValueFactory(new PropertyValueFactory<ModificationItem,Integer>("cost"));

		ModificationItemReader modificationItemReader = new ModificationItemReader();
		
		list = modificationItemReader.getAllModificationItems();
		
		table_main.setItems(list);
	}
}
