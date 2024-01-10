package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ImportVehicle {

	public ImportVehicle() {
		super();
	}
	
	public int importVehicle(String regNo, String company, String model, String type, int price, int year, String color, 
			int rentPerDay, String desc) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			ResultSet result = stmt.executeQuery("select * from vehicle where reg_no='"+ regNo +"';");
			if (result.next() == true) {
				System.out.println("Repeated RegNo!");
				return 1;
			}
			stmt.executeUpdate("insert into vehicle (reg_no,company,model,type,price, year, color, rentPerDay, Description,rented,sold) values ('" + regNo + "', '" + company + "', '" + model + "', '" + type + "',"+ price + ", " + year + ", '" + color + "', " + rentPerDay + " , '" + desc + "', 'No', 'No')");
			con.close();  
			return 0;
		} catch(Exception e) {
			System.out.println(e);
			return 2;
		}
	}
	
}
