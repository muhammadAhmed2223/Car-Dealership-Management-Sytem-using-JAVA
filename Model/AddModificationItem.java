package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddModificationItem {

	public AddModificationItem() {
		super();
	}
	
	public boolean addNewModificationItem(String modification_name, String vehicle_type, int cost) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			stmt.executeUpdate("insert into modificationitem (modification_name,vehicle_type,cost) values ('" + modification_name + "', '" + vehicle_type + "', " + cost + ")");
			con.close();  
			return true;
		} catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
}
