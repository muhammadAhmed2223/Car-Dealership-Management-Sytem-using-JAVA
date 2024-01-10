package Model;

public class User {
	public User(int id, String name, String address, String contact, String cnic, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.cnic = cnic;
		this.email = email;
		this.password = password;
	}
	
	private int id;
	private String name;
	private String address;
	private String contact;
	private String cnic;
	private String email;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCnic() {
		return cnic;
	}
	public void setCnic(String cnic) {
		this.cnic = cnic;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
