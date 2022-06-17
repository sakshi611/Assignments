package com.question1;

public interface X {

	void name();
	public static void middle() {
		
	};
	
	default void last() {
		System.out.println("Default method of x");
	}
}
