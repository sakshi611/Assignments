package com.question1;

public interface Y {

	void name1();
	public static void middle1() {
		
	};
	
	default void last1() {
		System.out.println("Default method of y");
	}
}
