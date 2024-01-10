package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RepairItemReader {
	public ObservableList<RepairAvailable> getAllRepairItems(){
		ObservableList<RepairAvailable> list = FXCollections.observableArrayList();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			ResultSet result = stmt.executeQuery("select * from repair_available");
			
			while (result.next()) {
				list.add(new RepairAvailable(Integer.parseInt(result.getString(1)),result.getString(2), result.getString(3), Integer.parseInt(result.getString(4)) ));
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
		return list;
	}
	
	public ObservableList<RepairAvailable> getTypeRepairItems(String type){
		ObservableList<RepairAvailable> list = FXCollections.observableArrayList();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			ResultSet result = stmt.executeQuery("select * from repair_available where vehicleType='" + type + "'");
			
			while (result.next()) {
				list.add(new RepairAvailable(Integer.parseInt(result.getString(1)),result.getString(2), result.getString(3), Integer.parseInt(result.getString(4)) ));
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
		return list;
	}
	
	public int getRepairPrice(int id) {
		int price;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			ResultSet result = stmt.executeQuery("select cost from repair_available where id=" + id + ";");
			
			if (result.next()) {
				price = Integer.parseInt(result.getString(1));
			} else {
				return -1;
			}
		}
		catch (Exception e){
			System.out.println(e);
			return -2;
		}
		return price;
	}
}
