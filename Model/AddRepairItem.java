package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddRepairItem {
	public int addNewRepairItem(String repairOpt, String vehicleType, int cost) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			stmt.executeUpdate("insert into repair_available (repairOpt,vehicleType,cost) values ('" + repairOpt + "', '" + vehicleType + "', " + cost + ")");
			con.close();  
			return 0;
		} catch(Exception e) {
			System.out.println(e);
			return 2;
		}
	}
	
	public AddRepairItem() {
		super();
	}
}
