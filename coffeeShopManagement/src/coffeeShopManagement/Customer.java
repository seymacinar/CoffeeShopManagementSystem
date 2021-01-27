package coffeeShopManagement;

public class Customer {
	
	int id;
	String tcNo;
	String firstName;
	String lastName;
	int birthYear;
	
	public Customer(int id, String tcNo, String firstName, String lastName, int birthYear) {
		this.id = id;
		this.tcNo = tcNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}
	
	public Customer() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
		
}
