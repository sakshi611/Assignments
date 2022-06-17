package com.question1;

public class InsufficientFundException extends Exception{

	
	
	private String message;
	public InsufficientFundException(String message)
	{
		this.message = message;
	}
	public String getMessage()
	{
		return this.message;
	}
}
