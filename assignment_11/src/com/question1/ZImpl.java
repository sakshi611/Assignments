package com.question1;

public class ZImpl implements Z {

	@Override
	public void print() {
		System.out.println("Abstract method of x");
		
	}

	@Override
	public void name() {
		System.out.println("Abstract method of y");
		
	}

	@Override
	public void name1() {
		System.out.println("Abstract method of Z");
		
	}

	@Override
	public void last() {
		System.out.println("Default method of x which is override");
	}
	
}
