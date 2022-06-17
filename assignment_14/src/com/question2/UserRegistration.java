package com.question2;

import java.util.Scanner;

public class UserRegistration {
	
	public String RegisterUser(String country) throws InvalidCountryException
	{
		 if(country.equals("India"))
		{
			 return ("User registration done successfully");
			 
		}
		 else
		 {
			 InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered”");
			 throw ice;
		 }
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Country:");
		String country = scan.next();
		System.out.println("Enter Your Name:");
		String name =  scan.next();
		
		UserRegistration user = new UserRegistration();
		try {
			String result=user.RegisterUser(country);
			System.out.println(result);
		} catch (InvalidCountryException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
