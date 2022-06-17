package com.masai;
import java.util.Scanner;
public class TicketsDetails {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter No Of Bookings");
		int bookings = scan.nextInt();
		
		System.out.println("Available Tickets");
		int availableTickets = scan.nextInt();
		
		Ticket t2 = new Ticket(availableTickets);
		
		for(int i=1;i<=bookings;i++) {
		   System.out.println("Enter Ticket Id");
		   int id = scan.nextInt();
		   
		   System.out.println("Enter Price");
		   int price = scan.nextInt();
		   
		   System.out.println("Enter No Of Tickets");
		   int noOfTickets=scan.nextInt();
		   
		   Ticket t1 = new Ticket(id,price,noOfTickets);
		   t1.TotalPrice(noOfTickets);
           t1.setAvailableTickets();
		   
		   
		}
	}
}
