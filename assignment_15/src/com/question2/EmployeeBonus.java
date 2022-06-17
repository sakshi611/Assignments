package com.question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeBonus {

	public double checkBonus(String jDate) throws InvalidAgeException
	{
		try {
			LocalDate prsentD = LocalDate.now();
			LocalDate d1 = LocalDate.parse(jDate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			if(d1.isBefore(prsentD))
			{
				Period p = Period.between(prsentD, d1);
				if(p.getYears()>2)
				{
					return 10000;
				}
				else if(p.getYears()<2 && p.getYears()>1)
				{
					return 8000;
				}
				else if(p.getYears()<1 && p.getYears()>0)
				{
					return 5000;
				}
				else
				{
					InvalidAgeException iae = new InvalidAgeException("Please pass the date in the correct format");
					throw iae;
				}
			}
			else 
			{
				System.out.println("Age should not be in the future");
				return 0;
			}
		}
		catch(Exception e)
		{
			InvalidAgeException iae = new InvalidAgeException("Please pass the date in the correct format");
			throw iae;
		}
			

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The date of joining in the formate of dd-MM-yyyy:");
		String jDate = scan.next();
		
		
		try {
			EmployeeBonus employeeBonus = new EmployeeBonus();
			double bonus= employeeBonus.checkBonus(jDate);
			if(bonus!=0)
			{
			  System.out.println("Bonus Is: "+bonus);
			}
		} catch (InvalidAgeException e) {
			
			System.out.println(e.getMessage());
		}
	}

	
}
