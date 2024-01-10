package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CustomerReader {
	public ObservableList<Customer> getAllCustomers(){
		ObservableList<Customer> list = FXCollections.observableArrayList();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			ResultSet result = stmt.executeQuery("select * from customer");
			
			while (result.next()) {
				list.add(new Customer(Integer.parseInt(result.getString(1)),result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getString(7) ));
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
		return list;
	}
	
}
