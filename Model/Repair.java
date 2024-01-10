package Model;

public class Repair {
	public Repair(int id, RepairAvailable repairItem, Vehicle vehicle, Customer customer, String date) {
		super();
		this.id = id;
		this.repairItem = repairItem;
		this.vehicle = vehicle;
		this.customer = customer;
		this.date = date;
	}
	private int id;
	private RepairAvailable repairItem;
	private Vehicle vehicle;
	private Customer customer;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public RepairAvailable getRepairItem() {
		return repairItem;
	}
	public void setRepairItem(RepairAvailable repairItem) {
		this.repairItem = repairItem;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
