package com.question1;

public class Account {

	private String accountNumber;
	private double Balance;
	
	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void deposit(int amount) {
		double total  = this.Balance+amount; 
		this.Balance = total;
	}
	
	public double withdraw(int amount)throws InsufficientFundException {
		if(amount<Balance)
		{
			return Balance-amount;
		}
		else
		{
			InsufficientFundException ife = new InsufficientFundException("No Balance Please Fill Right Amount");
			
			throw ife;
		}
		
	}
}
