package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Signup {
	public Signup() {
		super();
	}

	public boolean customerSignup(String name, String address, String cnic, String contact, String email, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement(); 
			ResultSet result = stmt.executeQuery("select * from customer where email='"+ email +"';");
			if (result.next() == true) {
				System.out.println("Repeated Email!");
				return false;
			}
			stmt.executeUpdate("insert into customer (name, address, cnic, contact, email, password) values ('" + name + "', '" + address + "', '" + cnic + "', '" + contact + "','"+ email +"', '" + password + "')");
			con.close();  
			return true;
		} catch(Exception e) {
			System.out.println("Exception thrown");
			return false;
		}
	}
	
	public boolean dealerSignup(String name, String address, String cnic, String contact, String email, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			ResultSet result = stmt.executeQuery("select * from dealer where email='"+ email +"';");
			if (result.next() == true) {
				System.out.println("Repeated Email!");
				return false;
			}
			stmt.executeUpdate("insert into dealer (name, address, cnic, contact, email, password) values ('" + name + "', '" + address + "', '" + cnic + "', '" + contact + "','"+ email +"', '" + password + "')");
			con.close();  
			return true;
		} catch(Exception e) {
			System.out.println("Exception thrown");
			return false;
		}
	}
	
	public boolean adminSignup(String name, String address, String cnic, String contact, String email, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			ResultSet result = stmt.executeQuery("select * from admin where email='"+ email +"';");
			if (result.next() == true) {
				System.out.println("Repeated Email!");
				return false;
			}
			stmt.executeUpdate("insert into admin (name, address, cnic, contact, email, password) values ('" + name + "', '" + address + "', '" + cnic + "', '" + contact + "','"+ email +"', '" + password + "')");
			con.close();  
			return true;
		} catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
}
