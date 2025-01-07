package ProjectLab;

public class BuyerInfo {
	private String nationality;
	private String name;
	private String phoneNumber;
	
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	
	}
	
	public String toString() {
		return "Name: " + this.name + "Nationality: " + this.nationality + "Phone Number: " + this.phoneNumber;
	}
	
}
