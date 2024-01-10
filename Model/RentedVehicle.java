package Model;

public class RentedVehicle {
	public RentedVehicle(int id, String startDate, String endDate, int cost, Customer customer, Vehicle vehicle) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.cost = cost;
		this.customer = customer;
		this.vehicle = vehicle;
	}
	private int id;
	private String startDate;
	private String endDate;
	private int cost;
	private Customer customer;
	private Vehicle vehicle;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
