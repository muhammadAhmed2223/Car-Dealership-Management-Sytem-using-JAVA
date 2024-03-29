package Controller;

import java.io.IOException;

import Model.AddModificationItem;
import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ModificationItemController {
	Main m = new Main();
	@FXML
	MenuBar menuBar;
	@FXML
	Label label1;
	@FXML
	private TextField textbox1;// modification item
	@FXML
	private TextField textbox2;// Vehicle type
	@FXML
	private TextField textbox3;// Cost

	// Event Listener on Button.onMouseClicked
	@FXML
	public void modify1(MouseEvent event) {
		// TODO Autogenerated
		System.out.println(textbox1.getText());
		System.out.println(textbox2.getText());
		System.out.println(textbox3.getText());
		
		
		String ModItem = textbox1.getText();
		String vehicleType= textbox2.getText();
		int cost =Integer.parseInt(textbox3.getText());
		
		AddModificationItem addModificationItem = new AddModificationItem();
		
		boolean result = addModificationItem.addNewModificationItem(ModItem, vehicleType, cost);
		
		if (result == true) {
			label1.setText("Successfully Added");
		} else {
			label1.setText("Error");
		}
	}
	
	public void goBack() throws IOException {
		Stage s = (Stage) menuBar.getScene().getWindow();
		m.changeScene(s, "../View/Dealer.fxml");
	}
}
