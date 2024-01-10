package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Model.RepairAvailable;
import Model.RepairItemReader;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;

public class AdminRepairItemController implements Initializable{
	@FXML
	private TableView<RepairAvailable> table_main;
	@FXML
	private TableColumn<RepairAvailable,Integer> table_id;
	@FXML
	private TableColumn<RepairAvailable,String> table_item;
	@FXML
	private TableColumn<RepairAvailable, String> table_type;
	@FXML
	private TableColumn<RepairAvailable,Integer> table_cost;
	
	ObservableList<RepairAvailable> list;

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
