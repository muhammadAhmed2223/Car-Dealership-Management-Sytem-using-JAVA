package Model;

public class ModificationItem {
	public ModificationItem(int id, String modificationName, String vehicleType, int cost) {
		super();
		this.id = id;
		this.modificationName = modificationName;
		this.vehicleType = vehicleType;
		this.cost = cost;
	}
	private int id;
	private String modificationName;
	private String vehicleType;
	private int cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModificationName() {
		return modificationName;
	}
	public void setModificationName(String modificationName) {
		this.modificationName = modificationName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
