package com.question1;

public class AccountDemo {

	public static void main(String[] args) {
		
		Account account = new Account("12345678");
		account.deposit(1234);
		try {
			int x = 12000;
			double leftAmount = account.withdraw(x);
			System.out.println("Left Amount: "+leftAmount);
		}
		catch(InsufficientFundException ae)
		{
			System.out.println(ae.getMessage());
		}
	}
}
