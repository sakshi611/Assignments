package com.masai;

public class Account {

	private int accountId;
	private String accountType;
	private int balance;
	private int withdraw;
	
	Account (int accountId,String accountType,int balance,int withdraw)
	{
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
		this.withdraw = withdraw;
	}
	public boolean withdraw(int l) {
		if(this.balance>this.withdraw) {
			int leftBalance =  this.balance-this.withdraw;
			System.out.println("Balance amount after withdraw:"+leftBalance);
			return true ; 
		}
		else {
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
		
	}
	
	
}
