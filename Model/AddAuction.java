package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddAuction {
	public AddAuction() {
		super();
	}
	
	public boolean addNewAuction(int vehicle, String lastDate, int basePrice) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();  
			stmt.executeUpdate("insert into auction (vehicle,LastDate,basePrice,topBid,topBidder) values (" + vehicle + ", '" + lastDate + "', " + basePrice + ", 0, null)");
			con.close();  
			return true;
		} catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	public boolean addTopBidder(Customer topBidder, int topBid, int auctionNum) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealership","root","1234");  
			Statement stmt=con.createStatement();
			stmt.executeUpdate("update auction set topBid=" + topBid + ", topBidder=" + topBidder.getId() + " where id=" + auctionNum + ";");
			con.close();
			return true;
		} catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}
}
