package ProjectLab;

import java.util.Scanner;

public class Payment extends BuyerInfo {
	
	private String masterCard;
	private String PinNumber;
	private String HowToPay;
	private String email;
	
	
	//Scanner sc = new Scanner(System.in);
	BuyerInfo info = new BuyerInfo();
	
	public String getMasterCard() {
		return masterCard;
	}
	public void setMasterCard(String masterCard) {
		this.masterCard = masterCard;
	}
	public String getHowToPay() {
		return HowToPay;
	}
	public void setHowToPay(String howToPay) {
		HowToPay = howToPay;
	}
	public String getPinNumber() {
		return PinNumber;
	}
	public void setPinNumber(String pinNumber) {
		PinNumber = pinNumber;
	}
	
	
	public String toString() {
		return "***************\n" + "Master Card Id: " + this.masterCard + "\n" + "Pin No: " + this.PinNumber + "\n***************\n";
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
	

