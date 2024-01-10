package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class VehicleReader {
	public ObservableList<Vehicle> getAllVehicles(){
		ObservableList<Vehicle> list = FXCollections.observableArrayList();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			ResultSet result = stmt.executeQuery("select * from vehicle");
			
			while (result.next()) {
				list.add(new Vehicle(Integer.parseInt(result.getString(1)),result.getString(2), result.getString(3), result.getString(4), result.getString(5), Integer.parseInt(result.getString(6)), Integer.parseInt(result.getString(7)), result.getString(8), Integer.parseInt(result.getString(9)), result.getString(10), result.getString(11), result.getString(12) ));
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
		return list;
	}
	
	public ObservableList<Vehicle> getAvailableVehicles() {
		ObservableList<Vehicle> list = FXCollections.observableArrayList();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			ResultSet result = stmt.executeQuery("select * from vehicle where rented='No' AND sold='No'");
			
			while (result.next()) {
				list.add(new Vehicle(Integer.parseInt(result.getString(1)),result.getString(2), result.getString(3), result.getString(4), result.getString(5), Integer.parseInt(result.getString(6)), Integer.parseInt(result.getString(7)), result.getString(8), Integer.parseInt(result.getString(9)), result.getString(10), result.getString(11), result.getString(12) ));
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
		return list;
	}
	
	public int getVehiclePrice(int id) {
		int price;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			ResultSet result = stmt.executeQuery("select price from vehicle where id=" + id + ";");
			
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
	
	public int getVehicleRent(int id) {
		int price;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			ResultSet result = stmt.executeQuery("select rentPerDay from vehicle where id=" + id + ";");
			
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
	
	public int getVehicleId(String regNo) {
		int price;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			ResultSet result = stmt.executeQuery("select price from vehicle where reg_no='" + regNo + "';");
			
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
	
	public boolean buyVehicle(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();
			stmt.executeUpdate("update vehicle set sold='Yes' where id=" + id + ";");
			con.close();
			return true;
		}
		catch (Exception e){
			System.out.println(e);
			return false;
		}
	}
	
	public boolean rentVehicle(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();
			stmt.executeUpdate("update vehicle set rented='Yes' where id=" + id + ";");
			con.close();
			return true;
		}
		catch (Exception e){
			System.out.println(e);
			return false;
		}
	}
}
