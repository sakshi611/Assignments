package com.masai;

public class Ticket {
	
	private int ticketId;
	private int price; 
	private static int availableTickets;
	private int noOfTickets;
	private int left;
	private int amount;
	
	Ticket(int availableTicket){
		availableTickets = availableTicket;
//		System.out.println(availableTickets);
	}
	
	
	     Ticket(int ticketId,int price,int noOfTickets){
		this.ticketId = ticketId;
		this.price  = price;
		this.noOfTickets=noOfTickets;
//		System.out.println(noOfTickets);
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets=noOfTickets;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	
	
	public void setTicketId(int ticketId)
	{
		this.ticketId=ticketId;
	}
	public void TotalPrice(int noOfTickets) {
//		System.out.println(noOfTickets);
		int amount =  this.price*this.noOfTickets;
		this.amount=amount;
//		return amount;
	}
	
	public void setAvailableTickets() {
		if(availableTickets<0)
		{
			System.out.println(-1);
		}
		else {
			int leftTickets = availableTickets - this.noOfTickets;
			this.left = leftTickets;
			availableTickets=leftTickets;
			this.showData();
		}
	}
	public int getAvailableTickets() {
		return left;
	}
	
	public void showData() {
		System.out.println("Available Tickets:"+availableTickets);
		System.out.println("Amount:"+amount);
		System.out.println("Available ticket after booking:"+left);
	}
}
