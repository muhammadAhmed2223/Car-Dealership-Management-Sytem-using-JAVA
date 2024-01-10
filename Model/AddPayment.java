package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddPayment {
	public AddPayment() {
		super();
	}
	
	public boolean addNewPayment(String ccn, String desc, int amount) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			stmt.executeUpdate("insert into payment (ccn,description,amount) values ('" + ccn + "', '" + desc + "', " + amount + ");");
			con.close();  
			return true;
		} catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
}
