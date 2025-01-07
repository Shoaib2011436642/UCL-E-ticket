package ProjectLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class TicketMain {
	public static void main(String[] args) throws IOException {
		
			
		
		Scanner in = new Scanner(System.in);
		
		Fixture fix = new Fixture();
		Payment buyer = new Payment();
		//BuyerInfo buyer = new BuyerInfo();
		
		int matchChoose , amount, sideChoose, rowChoose, confirm;
		
		String match1 = "Fc Barcelona vs Real Madrid , SemiFinal , 2nd February 2020";
		String match2 = "Chelsea vs LiverPool  , SemiFinal , 4th February 2020";
		String match3= "Manchester United vs AC Milan, Third Place, 5th February 2020";
		String match4= "Finals, 8th February 2020";
		String stadium1 = "Camp Nou";
		String stadium2 = "Santiago Bernabeu";
		String stadium3= "Wembley Stadium";
		String stadium4= "Stade de France";
		
		
		
while(true) {
	

		
		fix.showMatches();
		matchChoose = in.nextInt();
		
			if(matchChoose == 1) {
				//Gallery section function
				fix.gallerySection();
				//Select side
				sideChoose = in.nextInt();
				if(sideChoose == 1) {
					fix.seatRow();
					
					rowChoose = in.nextInt();
					
					if(rowChoose == 1) {
						//ticket bought, ticket left , side, match, stadium, buyer, fix, 
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match1_NorthFront(amount);
						if(fix.getTicketBought_Match1_NorthFront() > fix.getTicketLeft_Match1_NorthFront()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match1_NorthFront(amount);
						side(200, amount ,fix.getTicketLeft_Match1_NorthFront(), fix.getTicketBought_Match1_NorthFront(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "North", "Front", match1, stadium1, amount, "GM1.NRTH.FRNT");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
						
					}
					else if(rowChoose == 2) {
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match1_NorthMiddle(amount);
						if(fix.getTicketBought_Match1_NorthMiddle() > fix.getTicketLeft_Match1_NorthMiddle()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match1_NorthMiddle(amount);
						side(200, amount ,fix.getTicketLeft_Match1_NorthMiddle(), fix.getTicketBought_Match1_NorthMiddle(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "North", "Middle", match1, stadium1, amount, "GM1.NRTH.MDL");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					}
					
					else if (rowChoose == 3) {

						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match1_NorthBack(amount);
						if(fix.getTicketBought_Match1_NorthBack() > fix.getTicketLeft_Match1_NorthBack()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match1_NorthBack(amount);
						side(200, amount ,fix.getTicketLeft_Match1_NorthBack(), fix.getTicketBought_Match1_NorthBack(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "North", "Back", match1, stadium1, amount, "GM1.NRTH.BCK");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					
					}
					else {
						System.out.println("Invalid input , try again!");
						continue;
					}
					
				
				
			}
				else if (sideChoose == 2) {
					
					fix.seatRow();
				
				rowChoose = in.nextInt();
				
				if(rowChoose == 1) {
					//ticket bought, ticket left , side, match, stadium, buyer, fix, 
					System.out.println("Select amount: ");
					amount = in.nextInt();
					fix.setTicketBought_Match1_SouthFront(amount);
					if(fix.getTicketBought_Match1_SouthFront() > fix.getTicketLeft_Match1_SouthFront()) {
						System.out.println("Ticket amount exceeded! Try again!");
						
						continue;
					}
					fix.decreaseTicketLeft_Match1_SouthFront(amount);
					side(200, amount ,fix.getTicketLeft_Match1_SouthFront(), fix.getTicketBought_Match1_SouthFront(), fix);
					
					paymentProcess(buyer);
					System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
					confirm = in.nextInt();
					if(confirm == 1)
						fix.DownloadTicket(buyer, "South", "Front", match1, stadium1, amount, "GM1.NRTH.FRNT");
					else if (confirm == 2)
						continue;
					else
						System.exit(0);
					
				}
				else if(rowChoose == 2) {
					System.out.println("Select amount: ");
					amount = in.nextInt();
					fix.setTicketBought_Match1_SouthMiddle(amount);
					if(fix.getTicketBought_Match1_SouthMiddle() > fix.getTicketLeft_Match1_SouthMiddle()) {
						System.out.println("Ticket amount exceeded! Try again!");
						
						continue;
					}
					fix.decreaseTicketLeft_Match1_SouthMiddle(amount);
					side(200, amount ,fix.getTicketLeft_Match1_SouthMiddle(), fix.getTicketBought_Match1_SouthMiddle(), fix);
					
					paymentProcess(buyer);
					System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
					confirm = in.nextInt();
					if(confirm == 1)
						fix.DownloadTicket(buyer, "South", "Middle", match1, stadium1, amount, "GM1.STH.MDL");
					else if (confirm == 2)
						continue;
					else
						System.exit(0);
				}
				
				else if (rowChoose == 3) {

					System.out.println("Select amount: ");
					amount = in.nextInt();
					fix.setTicketBought_Match1_SouthBack(amount);
					if(fix.getTicketBought_Match1_SouthBack() > fix.getTicketLeft_Match1_SouthBack()) {
						System.out.println("Ticket amount exceeded! Try again!");
						
						continue;
					}
					fix.decreaseTicketLeft_Match1_SouthBack(amount);
					side(200, amount ,fix.getTicketLeft_Match1_SouthBack(), fix.getTicketBought_Match1_SouthBack(), fix);
					
					paymentProcess(buyer);
					System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
					confirm = in.nextInt();
					if(confirm == 1)
						fix.DownloadTicket(buyer, "South", "Back", match1, stadium1, amount, "GM1.STH.BCK");
					else if (confirm == 2)
						continue;
					else
						System.exit(0);
				
				}
				else {
					System.out.println("Invalid input , try again!");
					continue;
				}
				}
				
				else if(sideChoose == 3) {
					fix.seatRow();
					
					rowChoose = in.nextInt();
					
					if(rowChoose == 1) {
						//ticket bought, ticket left , side, match, stadium, buyer, fix, 
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match1_EastFront(amount);
						if(fix.getTicketBought_Match1_EastFront() > fix.getTicketLeft_Match1_EastFront()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match1_EastFront(amount);
						side(200, amount ,fix.getTicketLeft_Match1_EastFront(), fix.getTicketBought_Match1_EastFront(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "East", "Front", match1, stadium1, amount, "GM1.EST.FRNT");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
						
					}
					else if(rowChoose == 2) {
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match1_EastMiddle(amount);
						if(fix.getTicketBought_Match1_EastMiddle() > fix.getTicketLeft_Match1_EastMiddle()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match1_EastMiddle(amount);
						side(200, amount ,fix.getTicketLeft_Match1_EastMiddle(), fix.getTicketBought_Match1_EastMiddle(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "East", "Middle", match1, stadium1, amount, "GM1.EST.MDL");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					}
					
					else if (rowChoose == 3) {

						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match1_EastBack(amount);
						if(fix.getTicketBought_Match1_EastBack() > fix.getTicketLeft_Match1_EastBack()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match1_EastBack(amount);
						side(200, amount ,fix.getTicketLeft_Match1_EastBack(), fix.getTicketBought_Match1_EastBack(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "East", "Back", match1, stadium1, amount, "GM1.EST.BCK");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					
					}
					
					else {
						System.out.println("Invalid input , try again!");
						continue;
					}
				}
				else if(sideChoose == 4) {
					fix.seatRow();
					
					rowChoose = in.nextInt();
					
					if(rowChoose == 1) {
						//ticket bought, ticket left , side, match, stadium, buyer, fix, 
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match1_WestFront(amount);
						if(fix.getTicketBought_Match1_WestFront() > fix.getTicketLeft_Match1_WestFront()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match1_WestFront(amount);
						side(200, amount ,fix.getTicketLeft_Match1_WestFront(), fix.getTicketBought_Match1_WestFront(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "West", "Front", match1, stadium1, amount, "GM1.WST.FRNT");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
						
					}
					else if(rowChoose == 2) {
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match1_WestMiddle(amount);
						if(fix.getTicketBought_Match1_WestMiddle() > fix.getTicketLeft_Match1_WestMiddle()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match1_WestMiddle(amount);
						side(200, amount ,fix.getTicketLeft_Match1_WestMiddle(), fix.getTicketBought_Match1_WestMiddle(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "West", "Middle", match1, stadium1, amount, "GM1.WST.MDL");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					}
					
					else if (rowChoose == 3) {

						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match1_WestBack(amount);
						if(fix.getTicketBought_Match1_WestBack() > fix.getTicketLeft_Match1_WestBack()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match1_WestBack(amount);
						side(200, amount ,fix.getTicketLeft_Match1_WestBack(), fix.getTicketBought_Match1_WestBack(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "West", "Back", match1, stadium1, amount, "GM1.WST.BCK");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					
					}
					else {
						System.out.println("Invalid input , try again!");
						continue;
					}
				}
				else {
					System.out.println("Invalid input , try again!");
					continue;
				}
			}
			
			else if (matchChoose == 2) {
				fix.gallerySection();
				//Select side
				sideChoose = in.nextInt();
				if(sideChoose == 1) {
					fix.seatRow();
					
					rowChoose = in.nextInt();
					
					if(rowChoose == 1) {
						//ticket bought, ticket left , side, match, stadium, buyer, fix, 
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match2_NorthFront(amount);
						if(fix.getTicketBought_Match2_NorthFront() > fix.getTicketLeft_Match2_NorthFront()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match2_NorthFront(amount);
						side(200, amount ,fix.getTicketLeft_Match2_NorthFront(), fix.getTicketBought_Match2_NorthFront(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "North", "Front", match2, stadium2, amount, "GM2.NRTH.FRNT");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
						
					}
					else if(rowChoose == 2) {
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match2_NorthMiddle(amount);
						if(fix.getTicketBought_Match2_NorthMiddle() > fix.getTicketLeft_Match2_NorthMiddle()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match2_NorthMiddle(amount);
						side(200, amount ,fix.getTicketLeft_Match2_NorthMiddle(), fix.getTicketBought_Match2_NorthMiddle(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "North", "Middle", match2, stadium2, amount, "GM2.NRTH.MDL");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					}
					
					else if (rowChoose == 3) {

						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match2_NorthBack(amount);
						if(fix.getTicketBought_Match2_NorthBack() > fix.getTicketLeft_Match2_NorthBack()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match2_NorthBack(amount);
						side(200, amount ,fix.getTicketLeft_Match2_NorthBack(), fix.getTicketBought_Match2_NorthBack(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "North", "Back", match2, stadium2, amount, "GM2.NRTH.BCK");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					
					}
					else {
						System.out.println("Invalid input , try again!");
						continue;
					}
					
				
				
			}
				else if (sideChoose == 2) {
					
					fix.seatRow();
				
				rowChoose = in.nextInt();
				
				if(rowChoose == 1) {
					//ticket bought, ticket left , side, match, stadium, buyer, fix, 
					System.out.println("Select amount: ");
					amount = in.nextInt();
					fix.setTicketBought_Match2_SouthFront(amount);
					if(fix.getTicketBought_Match2_SouthFront() > fix.getTicketLeft_Match2_SouthFront()) {
						System.out.println("Ticket amount exceeded! Try again!");
						
						continue;
					}
					fix.decreaseTicketLeft_Match2_SouthFront(amount);
					side(200, amount ,fix.getTicketLeft_Match2_SouthFront(), fix.getTicketBought_Match2_SouthFront(), fix);
					
					paymentProcess(buyer);
					System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
					confirm = in.nextInt();
					if(confirm == 1)
						fix.DownloadTicket(buyer, "South", "Front", match2, stadium2, amount, "GM2.NRTH.FRNT");
					else if (confirm == 2)
						continue;
					else
						System.exit(0);
					
				}
				else if(rowChoose == 2) {
					System.out.println("Select amount: ");
					amount = in.nextInt();
					fix.setTicketBought_Match2_SouthMiddle(amount);
					if(fix.getTicketBought_Match2_SouthMiddle() > fix.getTicketLeft_Match2_SouthMiddle()) {
						System.out.println("Ticket amount exceeded! Try again!");
						
						continue;
					}
					fix.decreaseTicketLeft_Match2_SouthMiddle(amount);
					side(200, amount ,fix.getTicketLeft_Match2_SouthMiddle(), fix.getTicketBought_Match2_SouthMiddle(), fix);
					
					paymentProcess(buyer);
					System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
					confirm = in.nextInt();
					if(confirm == 1)
						fix.DownloadTicket(buyer, "South", "Middle", match2, stadium2, amount, "GM2.STH.MDL");
					else if (confirm == 2)
						continue;
					else
						System.exit(0);
				}
				
				else if (rowChoose == 3) {

					System.out.println("Select amount: ");
					amount = in.nextInt();
					fix.setTicketBought_Match2_SouthBack(amount);
					if(fix.getTicketBought_Match2_SouthBack() > fix.getTicketLeft_Match2_SouthBack()) {
						System.out.println("Ticket amount exceeded! Try again!");
						
						continue;
					}
					fix.decreaseTicketLeft_Match2_SouthBack(amount);
					side(200, amount ,fix.getTicketLeft_Match2_SouthBack(), fix.getTicketBought_Match2_SouthBack(), fix);
					
					paymentProcess(buyer);
					System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
					confirm = in.nextInt();
					if(confirm == 1)
						fix.DownloadTicket(buyer, "South", "Back", match2, stadium2, amount, "GM2.STH.BCK");
					else if (confirm == 2)
						continue;
					else
						System.exit(0);
				
				}
				else {
					System.out.println("Invalid input , try again!");
					continue;
				}
				}
				
				else if(sideChoose == 3) {
					fix.seatRow();
					
					rowChoose = in.nextInt();
					
					if(rowChoose == 1) {
						//ticket bought, ticket left , side, match, stadium, buyer, fix, 
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match2_EastFront(amount);
						if(fix.getTicketBought_Match2_EastFront() > fix.getTicketLeft_Match2_EastFront()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match2_EastFront(amount);
						side(200, amount ,fix.getTicketLeft_Match2_EastFront(), fix.getTicketBought_Match2_EastFront(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "East", "Front", match2, stadium2, amount, "GM2.EST.FRNT");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
						
					}
					else if(rowChoose == 2) {
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match2_EastMiddle(amount);
						if(fix.getTicketBought_Match2_EastMiddle() > fix.getTicketLeft_Match2_EastMiddle()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match2_EastMiddle(amount);
						side(200, amount ,fix.getTicketLeft_Match2_EastMiddle(), fix.getTicketBought_Match2_EastMiddle(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "East", "Middle", match2, stadium2, amount, "GM2.EST.MDL");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					}
					
					else if (rowChoose == 3) {

						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match2_EastBack(amount);
						if(fix.getTicketBought_Match2_EastBack() > fix.getTicketLeft_Match2_EastBack()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match2_EastBack(amount);
						side(200, amount ,fix.getTicketLeft_Match2_EastBack(), fix.getTicketBought_Match2_EastBack(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "East", "Back", match2, stadium2, amount, "GM2.EST.BCK");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					
					}
					
					else {
						System.out.println("Invalid input , try again!");
						continue;
					}
				}
				else if(sideChoose == 4) {
					fix.seatRow();
					
					rowChoose = in.nextInt();
					
					if(rowChoose == 1) {
						//ticket bought, ticket left , side, match, stadium, buyer, fix, 
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match2_WestFront(amount);
						if(fix.getTicketBought_Match2_WestFront() > fix.getTicketLeft_Match2_WestFront()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match2_WestFront(amount);
						side(200, amount ,fix.getTicketLeft_Match2_WestFront(), fix.getTicketBought_Match2_WestFront(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "West", "Front", match2, stadium2, amount, "GM2.WST.FRNT");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
						
					}
					else if(rowChoose == 2) {
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match2_WestMiddle(amount);
						if(fix.getTicketBought_Match2_WestMiddle() > fix.getTicketLeft_Match2_WestMiddle()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match2_WestMiddle(amount);
						side(200, amount ,fix.getTicketLeft_Match2_WestMiddle(), fix.getTicketBought_Match2_WestMiddle(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "West", "Middle", match2, stadium2, amount, "GM2.WST.MDL");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					}
					
					else if (rowChoose == 3) {

						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match2_WestBack(amount);
						if(fix.getTicketBought_Match2_WestBack() > fix.getTicketLeft_Match2_WestBack()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match2_WestBack(amount);
						side(200, amount ,fix.getTicketLeft_Match2_WestBack(), fix.getTicketBought_Match2_WestBack(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "West", "Back", match2, stadium2, amount, "GM2.WST.BCK");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					
					}
					
					else {
						System.out.println("Invalid input , try again!");
						continue;
					}
				}
				else {
					System.out.println("Invalid input , try again!");
					continue;
				}
			}
			
			else if (matchChoose == 3) {


				

				//Gallery section function
				fix.gallerySection();
				//Select side
				sideChoose = in.nextInt();
				if(sideChoose == 1) {
					fix.seatRow();
					
					rowChoose = in.nextInt();
					
					if(rowChoose == 1) {
						//ticket bought, ticket left , side, match, stadium, buyer, fix, 
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match3_NorthFront(amount);
						if(fix.getTicketBought_Match3_NorthFront() > fix.getTicketLeft_Match3_NorthFront()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match3_NorthFront(amount);
						side(200, amount ,fix.getTicketLeft_Match3_NorthFront(), fix.getTicketBought_Match3_NorthFront(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "North", "Front", match3, stadium3, amount, "GM3.NRTH.FRNT");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
						
					}
					else if(rowChoose == 2) {
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match3_NorthMiddle(amount);
						if(fix.getTicketBought_Match3_NorthMiddle() > fix.getTicketLeft_Match3_NorthMiddle()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match3_NorthMiddle(amount);
						side(200, amount ,fix.getTicketLeft_Match3_NorthMiddle(), fix.getTicketBought_Match3_NorthMiddle(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "North", "Middle", match3, stadium3, amount, "GM3.NRTH.MDL");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					}
					
					else if (rowChoose == 3) {

						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match3_NorthBack(amount);
						if(fix.getTicketBought_Match3_NorthBack() > fix.getTicketLeft_Match3_NorthBack()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match3_NorthBack(amount);
						side(200, amount ,fix.getTicketLeft_Match3_NorthBack(), fix.getTicketBought_Match3_NorthBack(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "North", "Back", match3, stadium3, amount, "GM3.NRTH.BCK");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					
					}
					else {
						System.out.println("Invalid input , try again!");
						continue;
					}
					
				
				
			}
				else if (sideChoose == 2) {
					
					fix.seatRow();
				
				rowChoose = in.nextInt();
				
				if(rowChoose == 1) {
					//ticket bought, ticket left , side, match, stadium, buyer, fix, 
					System.out.println("Select amount: ");
					amount = in.nextInt();
					fix.setTicketBought_Match3_SouthFront(amount);
					if(fix.getTicketBought_Match3_SouthFront() > fix.getTicketLeft_Match3_SouthFront()) {
						System.out.println("Ticket amount exceeded! Try again!");
						
						continue;
					}
					fix.decreaseTicketLeft_Match3_SouthFront(amount);
					side(200, amount ,fix.getTicketLeft_Match3_SouthFront(), fix.getTicketBought_Match3_SouthFront(), fix);
					
					paymentProcess(buyer);
					System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
					confirm = in.nextInt();
					if(confirm == 1)
						fix.DownloadTicket(buyer, "South", "Front", match3, stadium3, amount, "GM3.NRTH.FRNT");
					else if (confirm == 2)
						continue;
					else
						System.exit(0);
					
				}
				else if(rowChoose == 2) {
					System.out.println("Select amount: ");
					amount = in.nextInt();
					fix.setTicketBought_Match3_SouthMiddle(amount);
					if(fix.getTicketBought_Match3_SouthMiddle() > fix.getTicketLeft_Match3_SouthMiddle()) {
						System.out.println("Ticket amount exceeded! Try again!");
						
						continue;
					}
					fix.decreaseTicketLeft_Match3_SouthMiddle(amount);
					side(200, amount ,fix.getTicketLeft_Match3_SouthMiddle(), fix.getTicketBought_Match3_SouthMiddle(), fix);
					
					paymentProcess(buyer);
					System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
					confirm = in.nextInt();
					if(confirm == 1)
						fix.DownloadTicket(buyer, "South", "Middle", match3, stadium3, amount, "GM3.STH.MDL");
					else if (confirm == 2)
						continue;
					else
						System.exit(0);
				}
				
				else if (rowChoose == 3) {

					System.out.println("Select amount: ");
					amount = in.nextInt();
					fix.setTicketBought_Match3_SouthBack(amount);
					if(fix.getTicketBought_Match3_SouthBack() > fix.getTicketLeft_Match3_SouthBack()) {
						System.out.println("Ticket amount exceeded! Try again!");
						
						continue;
					}
					fix.decreaseTicketLeft_Match3_SouthBack(amount);
					side(200, amount ,fix.getTicketLeft_Match3_SouthBack(), fix.getTicketBought_Match3_SouthBack(), fix);
					
					paymentProcess(buyer);
					System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
					confirm = in.nextInt();
					if(confirm == 1)
						fix.DownloadTicket(buyer, "South", "Back", match3, stadium3, amount, "GM3.STH.BCK");
					else if (confirm == 2)
						continue;
					else
						System.exit(0);
				
				}
				else {
					System.out.println("Invalid input , try again!");
					continue;
				}
				}
				
			else if(sideChoose == 3) {
					fix.seatRow();
					
					rowChoose = in.nextInt();
					
					if(rowChoose == 1) {
						//ticket bought, ticket left , side, match, stadium, buyer, fix, 
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match3_EastFront(amount);
						if(fix.getTicketBought_Match3_EastFront() > fix.getTicketLeft_Match3_EastFront()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match3_EastFront(amount);
						side(200, amount ,fix.getTicketLeft_Match3_EastFront(), fix.getTicketBought_Match3_EastFront(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "East", "Front", match3, stadium3, amount, "GM3.EST.FRNT");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
						
					}
					else if(rowChoose == 2) {
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match3_EastMiddle(amount);
						if(fix.getTicketBought_Match3_EastMiddle() > fix.getTicketLeft_Match3_EastMiddle()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match3_EastMiddle(amount);
						side(200, amount ,fix.getTicketLeft_Match3_EastMiddle(), fix.getTicketBought_Match3_EastMiddle(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "East", "Middle", match3, stadium3, amount, "GM3.EST.MDL");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					}
					
					else if (rowChoose == 3) {

						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match3_EastBack(amount);
						if(fix.getTicketBought_Match3_EastBack() > fix.getTicketLeft_Match3_EastBack()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match3_EastBack(amount);
						side(200, amount ,fix.getTicketLeft_Match3_EastBack(), fix.getTicketBought_Match3_EastBack(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "East", "Back", match3, stadium3, amount, "GM3.EST.BCK");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					
					}
					else {
						System.out.println("Invalid input , try again!");
						continue;
					}
				}
				else if(sideChoose == 4) {
					fix.seatRow();
					
					rowChoose = in.nextInt();
					
					if(rowChoose == 1) {
						//ticket bought, ticket left , side, match, stadium, buyer, fix, 
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match3_WestFront(amount);
						if(fix.getTicketBought_Match3_WestFront() > fix.getTicketLeft_Match3_WestFront()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match3_WestFront(amount);
						side(200, amount ,fix.getTicketLeft_Match3_WestFront(), fix.getTicketBought_Match3_WestFront(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "West", "Front", match3, stadium3, amount, "GM3.WST.FRNT");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
						
					}
					else if(rowChoose == 2) {
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match3_WestMiddle(amount);
						if(fix.getTicketBought_Match3_WestMiddle() > fix.getTicketLeft_Match3_WestMiddle()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match3_WestMiddle(amount);
						side(200, amount ,fix.getTicketLeft_Match3_WestMiddle(), fix.getTicketBought_Match3_WestMiddle(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "West", "Middle", match3, stadium3, amount, "GM3.WST.MDL");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					}
					
					else if (rowChoose == 3) {

						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match3_WestBack(amount);
						if(fix.getTicketBought_Match3_WestBack() > fix.getTicketLeft_Match3_WestBack()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match3_WestBack(amount);
						side(200, amount ,fix.getTicketLeft_Match3_WestBack(), fix.getTicketBought_Match3_WestBack(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "West", "Back", match3, stadium3, amount, "GM3.WST.BCK");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					
					}
					
					else {
						System.out.println("Invalid input , try again!");
						continue;
					}
				}

				else {
					System.out.println("Invalid input , try again!");
					continue;
				}
				



			}
			
			else if(matchChoose == 4) {


				

				//Gallery section function
				fix.gallerySection();
				//Select side
				sideChoose = in.nextInt();
				if(sideChoose == 1) {
					fix.seatRow();
					
					rowChoose = in.nextInt();
					
					if(rowChoose == 1) {
						//ticket bought, ticket left , side, match, stadium, buyer, fix, 
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match4_NorthFront(amount);
						if(fix.getTicketBought_Match4_NorthFront() > fix.getTicketLeft_Match4_NorthFront()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match4_NorthFront(amount);
						side(200, amount ,fix.getTicketLeft_Match4_NorthFront(), fix.getTicketBought_Match4_NorthFront(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "North", "Front", match4, stadium4, amount, "GM4.NRTH.FRNT");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
						
					}
					else if(rowChoose == 2) {
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match4_NorthMiddle(amount);
						if(fix.getTicketBought_Match4_NorthMiddle() > fix.getTicketLeft_Match4_NorthMiddle()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match4_NorthMiddle(amount);
						side(200, amount ,fix.getTicketLeft_Match4_NorthMiddle(), fix.getTicketBought_Match4_NorthMiddle(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "North", "Middle", match4, stadium4, amount, "GM4.NRTH.MDL");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					}
					
					else if (rowChoose == 3) {

						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match4_NorthBack(amount);
						if(fix.getTicketBought_Match4_NorthBack() > fix.getTicketLeft_Match4_NorthBack()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match4_NorthBack(amount);
						side(200, amount ,fix.getTicketLeft_Match4_NorthBack(), fix.getTicketBought_Match4_NorthBack(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "North", "Back", match4, stadium4, amount, "GM4.NRTH.BCK");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					
					}
					else {
						System.out.println("Invalid input , try again!");
						continue;
					}
					
				
				
			}
				else if (sideChoose == 2) {
					
					fix.seatRow();
				
				rowChoose = in.nextInt();
				
				if(rowChoose == 1) {
					//ticket bought, ticket left , side, match, stadium, buyer, fix, 
					System.out.println("Select amount: ");
					amount = in.nextInt();
					fix.setTicketBought_Match4_SouthFront(amount);
					if(fix.getTicketBought_Match4_SouthFront() > fix.getTicketLeft_Match4_SouthFront()) {
						System.out.println("Ticket amount exceeded! Try again!");
						
						continue;
					}
					fix.decreaseTicketLeft_Match4_SouthFront(amount);
					side(200, amount ,fix.getTicketLeft_Match4_SouthFront(), fix.getTicketBought_Match4_SouthFront(), fix);
					
					paymentProcess(buyer);
					System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
					confirm = in.nextInt();
					if(confirm == 1)
						fix.DownloadTicket(buyer, "South", "Front", match4, stadium4, amount, "GM4.NRTH.FRNT");
					else if (confirm == 2)
						continue;
					else
						System.exit(0);
					
				}
				else if(rowChoose == 2) {
					System.out.println("Select amount: ");
					amount = in.nextInt();
					fix.setTicketBought_Match4_SouthMiddle(amount);
					if(fix.getTicketBought_Match4_SouthMiddle() > fix.getTicketLeft_Match4_SouthMiddle()) {
						System.out.println("Ticket amount exceeded! Try again!");
						
						continue;
					}
					fix.decreaseTicketLeft_Match4_SouthMiddle(amount);
					side(200, amount ,fix.getTicketLeft_Match4_SouthMiddle(), fix.getTicketBought_Match4_SouthMiddle(), fix);
					
					paymentProcess(buyer);
					System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
					confirm = in.nextInt();
					if(confirm == 1)
						fix.DownloadTicket(buyer, "South", "Middle", match4, stadium4, amount, "GM4.STH.MDL");
					else if (confirm == 2)
						continue;
					else
						System.exit(0);
				}
				
				else if (rowChoose == 3) {

					System.out.println("Select amount: ");
					amount = in.nextInt();
					fix.setTicketBought_Match4_SouthBack(amount);
					if(fix.getTicketBought_Match4_SouthBack() > fix.getTicketLeft_Match4_SouthBack()) {
						System.out.println("Ticket amount exceeded! Try again!");
						
						continue;
					}
					fix.decreaseTicketLeft_Match4_SouthBack(amount);
					side(200, amount ,fix.getTicketLeft_Match4_SouthBack(), fix.getTicketBought_Match4_SouthBack(), fix);
					
					paymentProcess(buyer);
					System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
					confirm = in.nextInt();
					if(confirm == 1)
						fix.DownloadTicket(buyer, "South", "Back", match4, stadium4, amount, "GM4.STH.BCK");
					else if (confirm == 2)
						continue;
					else
						System.exit(0);
				
				}
				else {
					System.out.println("Invalid input , try again!");
					continue;
				}
				}
				
				else if(sideChoose == 3) {
					fix.seatRow();
					
					rowChoose = in.nextInt();
					
					if(rowChoose == 1) {
						//ticket bought, ticket left , side, match, stadium, buyer, fix, 
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match4_EastFront(amount);
						if(fix.getTicketBought_Match4_EastFront() > fix.getTicketLeft_Match4_EastFront()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match4_EastFront(amount);
						side(200, amount ,fix.getTicketLeft_Match4_EastFront(), fix.getTicketBought_Match4_EastFront(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "East", "Front", match4, stadium4, amount, "GM4.EST.FRNT");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
						
					}
					else if(rowChoose == 2) {
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match4_EastMiddle(amount);
						if(fix.getTicketBought_Match4_EastMiddle() > fix.getTicketLeft_Match4_EastMiddle()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match4_EastMiddle(amount);
						side(200, amount ,fix.getTicketLeft_Match4_EastMiddle(), fix.getTicketBought_Match4_EastMiddle(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "East", "Middle", match4, stadium4, amount, "GM4.EST.MDL");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					}
					
					else if (rowChoose == 3) {

						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match4_EastBack(amount);
						if(fix.getTicketBought_Match4_EastBack() > fix.getTicketLeft_Match4_EastBack()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match4_EastBack(amount);
						side(200, amount ,fix.getTicketLeft_Match4_EastBack(), fix.getTicketBought_Match4_EastBack(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "East", "Back", match4, stadium4, amount, "GM4.EST.BCK");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					
					}
					
					else {
						System.out.println("Invalid input , try again!");
						continue;
					}
				}
				else if(sideChoose == 4) {
					fix.seatRow();
					
					rowChoose = in.nextInt();
					
					if(rowChoose == 1) {
						//ticket bought, ticket left , side, match, stadium, buyer, fix, 
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match4_WestFront(amount);
						if(fix.getTicketBought_Match4_WestFront() > fix.getTicketLeft_Match4_WestFront()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match4_WestFront(amount);
						side(200, amount ,fix.getTicketLeft_Match4_WestFront(), fix.getTicketBought_Match4_WestFront(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "West", "Front", match4, stadium4, amount, "GM4.WST.FRNT");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
						
					}
					else if(rowChoose == 2) {
						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match4_WestMiddle(amount);
						if(fix.getTicketBought_Match4_WestMiddle() > fix.getTicketLeft_Match4_WestMiddle()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match4_WestMiddle(amount);
						side(200, amount ,fix.getTicketLeft_Match4_WestMiddle(), fix.getTicketBought_Match4_WestMiddle(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "West", "Middle", match4, stadium4, amount, "GM4.WST.MDL");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					}
					
					else if (rowChoose == 3) {

						System.out.println("Select amount: ");
						amount = in.nextInt();
						fix.setTicketBought_Match4_WestBack(amount);
						if(fix.getTicketBought_Match4_WestBack() > fix.getTicketLeft_Match4_WestBack()) {
							System.out.println("Ticket amount exceeded! Try again!");
							
							continue;
						}
						fix.decreaseTicketLeft_Match4_WestBack(amount);
						side(200, amount ,fix.getTicketLeft_Match4_WestBack(), fix.getTicketBought_Match4_WestBack(), fix);
						
						paymentProcess(buyer);
						System.out.println("Give confirmation:\n1.Buy\n2.Go to first option\n3.Press any key to exit");
						confirm = in.nextInt();
						if(confirm == 1)
							fix.DownloadTicket(buyer, "West", "Back", match4, stadium4, amount, "GM4.WST.BCK");
						else if (confirm == 2)
							continue;
						else
							System.exit(0);
					
					}
					
					else {
						System.out.println("Invalid input , try again!");
						continue;
					}
				}


				else {
					System.out.println("Invalid input , try again!");
					continue;
				}



			}
			else {
				System.out.println("Invalid input , try again!");
				continue;
			}

	}
	
}	
	


	public static void side (int rate, int amount, int ticketLeft, int ticketBought, Fixture fix) {
		//Scanner in = new Scanner(System.in);
		
		fix.setTotalMoney(rate, amount);
		System.out.println("Total money: " + fix.getTotalMoney());
		System.out.println("Ticket left: " + ticketLeft);
		System.out.println("Ticket bought: " + ticketBought);
	}
	
	public static void paymentProcess(Payment buyer) {
		//BuyerInfo info = new BuyerInfo();
		Scanner sc = new Scanner(System.in);
		//Payment buyer = new Payment();
		System.out.println("**********************************************\n");
		System.out.println("Enter your Name:\n");
		buyer.setName(sc.nextLine() + "\n");
		//System.out.println(buyer.getName());
		System.out.println("Enter your Nationality:\n");
		buyer.setNationality(sc.nextLine());
		System.out.println("Enter your phone number:\n");
		buyer.setPhoneNumber(sc.nextLine());
		System.out.println("Enter your email:\n");
		buyer.setEmail(sc.nextLine());
		System.out.println("Enter your MasterCard Number:\n");
		buyer.setMasterCard(sc.nextLine());
		System.out.println("Enter your PIN number:\n");
		buyer.setPinNumber(sc.nextLine());
		System.out.println(buyer.toString()); //polymorphism
	}
	

}
