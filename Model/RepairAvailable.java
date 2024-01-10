package Model;

public class RepairAvailable {
	public RepairAvailable(int id, String repairOpt, String vehicleType, int cost) {
		super();
		this.id = id;
		this.repairOpt = repairOpt;
		this.vehicleType = vehicleType;
		this.cost = cost;
	}
	private int id;
	private String repairOpt;
	private String vehicleType;
	private int cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRepairOpt() {
		return repairOpt;
	}
	public void setRepairOpt(String repairOpt) {
		this.repairOpt = repairOpt;
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
