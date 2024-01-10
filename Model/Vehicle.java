package Model;

public class Vehicle {
	public Vehicle(int id, String regNo, String company, String model, String type, int price, int year, String color,
			int rentPerDay, String desc, String rented, String sold) {
		super();
		this.id = id;
		this.regNo = regNo;
		this.company = company;
		this.model = model;
		this.type = type;
		this.price = price;
		this.year = year;
		this.color = color;
		this.rentPerDay = rentPerDay;
		this.desc = desc;
		this.rented = rented;
		this.sold = sold;
	}
	private int id;
	private String regNo;
	private String company;
	private String model;
	private String type;
	private int price;
	private int year;
	private String color;
	private int rentPerDay;
	private String desc;
	private String rented;
	private String sold;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRentPerDay() {
		return rentPerDay;
	}
	public void setRentPerDay(int rentPerDay) {
		this.rentPerDay = rentPerDay;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getRented() {
		return rented;
	}
	public void setRented(String rented) {
		this.rented = rented;
	}
	public String getSold() {
		return sold;
	}
	public void setSold(String sold) {
		this.sold = sold;
	}
}
