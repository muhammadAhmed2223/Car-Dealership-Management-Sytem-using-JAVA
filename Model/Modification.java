package Model;

public class Modification {
	public Modification(int id, ModificationItem modificationItem, Vehicle vehicle, Customer customer, String date) {
		super();
		this.id = id;
		this.modificationItem = modificationItem;
		this.vehicle = vehicle;
		this.customer = customer;
		this.date = date;
	}
	private int id;
	private ModificationItem modificationItem;
	private Vehicle vehicle;
	private Customer customer;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ModificationItem getModificationItem() {
		return modificationItem;
	}
	public void setModificationItem(ModificationItem modificationItem) {
		this.modificationItem = modificationItem;
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
