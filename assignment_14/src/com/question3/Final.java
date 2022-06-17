package com.question3;

public class Final {

	//this keyword is use for to make the variable and method 
	//immutable means we can't change/modify 
	//their value in the other class.
	final int age = 10;
	
	public static void main(String[] args) {
		
		Final fin = new Final();
		//fin.age = 12;//here we can't modify;
	}
}