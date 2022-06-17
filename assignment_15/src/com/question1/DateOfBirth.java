package com.question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateOfBirth {
	
	public int CalculateAge(String dob)throws InvalidDateFormatException
	{
		try {
		    
			LocalDate date = LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate d1 = LocalDate.now();
			if(date.isBefore(d1))
			{
				Period p = Period.between(date, d1);
				
				if(p.getYears() > 0)
				{
					return p.getYears(); 
				}
				
				else 
				{
					InvalidDateFormatException idf = new InvalidDateFormatException("Enter Valid Age");
					throw idf;
				}
			}
			else 
			{
				System.out.println("Date should not be in Future");
				return 0;
			}
		}
		catch(Exception e)
		{
			InvalidDateFormatException idf = new InvalidDateFormatException("Enter Valid Age");
			throw idf;
		}
			
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Date Of Bith");
		String dob = scan.next();	
		try 
		{
			DateOfBirth dateOfBirth = new DateOfBirth();
		    int age = dateOfBirth.CalculateAge(dob);
		    if(age!=0)
		    {
		    	 System.out.println(age);
		    }		   
		}
		catch(InvalidDateFormatException idfe)
		{
			System.out.println(idfe.getMessage());
		}
	}
}
