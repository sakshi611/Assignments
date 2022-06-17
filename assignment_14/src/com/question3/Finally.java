package com.question3;

public class Finally {

	//this keyword is use for  irrespective of try ans catch if we want to execute some 
	//code then we can use finally block.
	//it is block used with try and catch block.
	public static void main(String[] args) {
		System.out.println("Mian yaha se shuru");
		try{
			System.out.println("Try yaha se shuru");
			System.out.println(100/10);
			System.out.println("Try yaha khtm");
		}
		catch(Exception e)
		{
			System.out.println("Catch is here");
		}
		finally{
			System.out.println("Finally Is Here");
		}
	}
}
