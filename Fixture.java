package ProjectLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Fixture extends Gallery implements gallerySection {
	private String date;
	private String stadium;
	private String round;
	private String side;
	private int ticketLeft = 290;
	private int ticketToBuy;
	private int totalMoney;
	private int ticketBought;
	
	
	//How many ticket left in each section
	
	public Fixture() {
		
	}
	
	
	
	
	//We could use just one function for FIle handling instead of one
	public void gallerySection () throws FileNotFoundException {
		Scanner sc = new Scanner(new File("G:\\Eclipse workspace\\classExamples\\src\\ProjectLab\\GallerySide.txt"));
		String read;
		while(sc.hasNextLine()) {
			read = sc.nextLine();
			System.out.println(read);
			}
		sc.close();
		
	}
	
	public void seatRow() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("G:\\Eclipse workspace\\classExamples\\src\\ProjectLab\\SeatRow.txt"));
		String read;
		while(sc.hasNextLine()) {
			read = sc.nextLine();
			System.out.println(read);
			}
		sc.close();
	}

	public int getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(int rate, int amount) {
		this.totalMoney += rate * amount;
	}

	

	
	public void DownloadTicket(Payment buyer, String side, String row, String match, String stadium, int amount, String id) throws IOException {
		// TODO Auto-generated method stub
		String name = buyer.getName();
		Formatter formatter = new Formatter("G:\\\\Eclipse workspace\\\\classExamples\\\\src\\\\ProjectLab\\\\ticket.txt");
		
		for(int i = 0; i<amount ; i++) {
			//formatter.format("%s\n", "\n    ");
			formatter.format("%s\r\n","**********************************************");
			formatter.format("%s %s\r\n", "Ticket ID: ", id + i);
			formatter.format("%s %s\r\n","Name: ", name);
			formatter.format("%s %s\r\n" ,"Nationality: ", buyer.getNationality());
			formatter.format("%s %s\r\n", "Match: ", match);
			formatter.format("%s %s\r\n", "Stadium: ", stadium);
			formatter.format("%s %s\r\n", "Gallery Side: ", side);
			formatter.format("%s %s\r\n", "Gallery Row: ", row);
			formatter.format("%s\r\n","**********************************************");
		}
		
		
		formatter.close();
		
		Scanner sc = new Scanner(new File("G:\\Eclipse workspace\\classExamples\\src\\ProjectLab\\ticket.txt"));
		while(sc.hasNextLine()) {
			String data = sc.nextLine();		
			System.out.println(data);
		}
		sc.close();
		
		System.out.println("Transaction Successfull!! Ticket Downloaded\nThanks For Purchasing! Hope you enjoy the match.");
	}
	
	public void showMatches() throws FileNotFoundException {
		String read;
		Scanner sc = new Scanner(new File("G:\\Eclipse workspace\\classExamples\\src\\ProjectLab\\Fixtures.txt"));
		while(sc.hasNextLine()) {
			read = sc.nextLine();
			System.out.println(read);
			}
		sc.close();
	}

	

	
}
