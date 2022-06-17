package com.question2;

public class InvalidCountryException extends Exception{

	private String message;
	
	public  InvalidCountryException(String message)
	{
		this.message = message;
	}
	public String getMessage()
	{
		return this.message;
	}
}
