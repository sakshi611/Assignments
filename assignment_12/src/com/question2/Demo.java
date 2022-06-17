package com.question2;
import java.util.Scanner;
import java.util.regex.Matcher;
public class Demo {
	
	public boolean validate(String name, String mobileNum, String aadharCard) {
		
		if(aadharCard.matches("[0-9]{12}") && mobileNum.matches("[6789]{1}[0-9]{9}")&& name.matches("[a-z]{3,8}"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = scan.next();
		
		System.out.println("Enter MobleNo.:");
		String moblie = scan.next();
		
		System.out.println("Enter Addhar Number:");
		String addhar = scan.next();
		
		Demo d1 = new Demo();
		Boolean bool = d1.validate(name, moblie, addhar);
		if(bool)
		{
			Citizen citizen =  new Citizen(name, moblie, addhar);
			citizen.Display();
		}
		else
		{
			System.out.println("Please fill the Correct Details");
		}
	}
	
}
