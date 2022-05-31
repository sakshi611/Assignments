package assignment_day6;

import java.util.Scanner;
class Main {
	public static String reversString(String input){
		String rev = "";
		for(int i=input.length()-1; i>=0; i--) {
			rev += input.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		sc.close();
		String result = reversString(orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);
	}
}