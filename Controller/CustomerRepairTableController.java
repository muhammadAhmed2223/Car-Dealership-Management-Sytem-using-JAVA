package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

import Model.AddPayment;
import Model.RepairAvailable;
import Model.RepairItemReader;
import application.Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import javafx.scene.control.MenuBar;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.TableView;

import javafx.scene.control.TableColumn;

public class CustomerRepairTableController implements Initializable {
	Main m = new Main();
	@FXML
	private TextField repairID;
	@FXML
	private TextField ccn;
	@FXML
	private Label label1;
	@FXML
	private TableView<RepairAvailable> table_main;
	@FXML
	private TableColumn<RepairAvailable,Integer> table_id;
	@FXML
	private TableColumn<RepairAvailable,String> table_item;
	@FXML
	private TableColumn<RepairAvailable,String> table_type;
	@FXML
	private TableColumn<RepairAvailable,Integer> table_cost;
	@FXML
	private MenuBar menuBar;
	
	ObservableList<RepairAvailable> list;

	// Event Listener on Button.onMouseClicked
	@FXML
	public void purchase(MouseEvent event) {
		RepairItemReader repairReader = new RepairItemReader();
		int price = repairReader.getRepairPrice(Integer.parseInt(repairID.getText()));
		if (price == -1 || price == -2) {
			label1.setText("Purchase Failed!");
			return;
		}
		
		String ccnStr = ccn.getText();
		
		AddPayment addPayment = new AddPayment();
		boolean result = addPayment.addNewPayment(ccnStr, "Repair", price);
		
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
		table_id.setCellValueFactory(new PropertyValueFactory<RepairAvailable,Integer>("id"));
		table_item.setCellValueFactory(new PropertyValueFactory<RepairAvailable,String>("repairOpt"));
		table_type.setCellValueFactory(new PropertyValueFactory<RepairAvailable,String>("vehicleType"));
		table_cost.setCellValueFactory(new PropertyValueFactory<RepairAvailable,Integer>("cost"));
		
		RepairItemReader repairItemReader = new RepairItemReader();
		
		list = repairItemReader.getAllRepairItems();
		table_main.setItems(list);
	}
}
