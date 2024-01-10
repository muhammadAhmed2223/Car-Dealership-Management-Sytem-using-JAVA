package Model;

public class Auction {
	public Auction(int id, Vehicle vehicle, String lastDate, int basePrice, int topBid, Customer topBidder) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.lastDate = lastDate;
		this.basePrice = basePrice;
		this.topBid = topBid;
		this.topBidder = topBidder;
	}
	private int id;
	private Vehicle vehicle;
	private String lastDate;
	private int basePrice;
	private int topBid;
	private Customer topBidder;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public String getLastDate() {
		return lastDate;
	}
	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}
	public int getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}
	public int getTopBid() {
		return topBid;
	}
	public void setTopBid(int topBid) {
		this.topBid = topBid;
	}
	public Customer getTopBidder() {
		return topBidder;
	}
	public void setTopBidder(Customer topBidder) {
		this.topBidder = topBidder;
	}
}
