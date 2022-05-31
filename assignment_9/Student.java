package assignment_day9;
import java.util.Scanner;


public class Student {

	private  int roll;
	private String name;
	private int marks;
	private char Grade;
	
	Student(){}
	
	Student(int r,String n,int m){
		roll = r;
		name = n;
		marks = m;
		System.out.println(toString());
		System.out.println("Grade:"+calculateGrade());
		
	}
	
	public String toString(){//overriding the toString() method  
		  return "Roll No: "+roll+" "+"Name: "+name+" "+"Marks: "+marks;  
	}  
	
	public void displayDetails() {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter Rollno.: ");
		int r = myObj.nextInt();
		System.out.println("Enter Name: ");
		String n = myObj.next();
		System.out.println("Enter Marks: ");
		int m = myObj.nextInt();
		//myObj.close();
		
		new Student(r, n, m);
		
		 
	}
	private char calculateGrade() {

		if (marks >= 500) {
			 Grade = 'A';
		}
		else if (marks < 500 && marks >= 400) {
			 Grade = 'B';
		}
		else if (marks < 400){
			Grade = 'C';
		}

		return Grade;
	}
}
