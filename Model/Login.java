package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login {
	
	public Login() {
		super();
	}

	public boolean customerLogin(String email, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			ResultSet result = stmt.executeQuery("select * from customer where email='"+ email +"' and password='" + password + "';");
			if (result.next()) {
				UserInstance.currentCustomer = new Customer(Integer.parseInt(result.getString(1)),result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getString(7) );
				System.out.println("Successful Login");
				con.close(); 
				return true;
			}
			else {
				System.out.println("Failed Login");
				con.close(); 
				return false;
			}
		} catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public boolean dealerLogin(String email, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			ResultSet result = stmt.executeQuery("select * from dealer where email='"+ email +"' and password='" + password + "';");
			 
			if (result.next()) {
				UserInstance.currentDealer = new Dealer(Integer.parseInt(result.getString(1)),result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getString(7) );
				System.out.println("Successful Login");
				con.close(); 
				return true;
			}
			else {
				System.out.println("Failed Login");
				con.close(); 
				return false;
			}
		} catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public boolean adminLogin(String email, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			ResultSet result = stmt.executeQuery("select * from admin where email='"+ email +"' and password='" + password + "';");
			  
			if (result.next()) {
				UserInstance.currentAdmin = new Admin(Integer.parseInt(result.getString(1)),result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getString(7) );
				System.out.println("Successful Login");
				con.close();
				return true;
			}
			else {
				System.out.println("Failed Login");
				con.close();
				return false;
			}
		} catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
}
