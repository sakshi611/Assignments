package com.masai;
import java.util.Scanner;
public class AccountDetails {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter account id:");
		int accountId = scan.nextInt();
		
		System.out.println("Enter account type:");
		String accountType = scan.next();
		
		System.out.println("Enter balance:");
		int balance = scan.nextInt();
		
		System.out.println("Enter Withdraw Amount:");
		int withdraw = scan.nextInt();
		
		Account a1 = new Account(accountId,accountType,balance,withdraw);
		a1.withdraw(8);
	}
}
