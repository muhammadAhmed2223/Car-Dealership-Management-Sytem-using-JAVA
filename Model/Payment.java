package Model;

public class Payment {
	public Payment(int id, String ccn, Customer customer, String desc, int amount, Vehicle vehicle) {
		super();
		this.id = id;
		this.ccn = ccn;
		this.customer = customer;
		this.desc = desc;
		this.amount = amount;
		this.vehicle = vehicle;
	}
	private int id;
	private String ccn;
	private Customer customer;
	private String desc;
	private int amount;
	private Vehicle vehicle;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCcn() {
		return ccn;
	}
	public void setCcn(String ccn) {
		this.ccn = ccn;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
