package com.masai;
import java.util.Scanner;
public class EmployeeDetails {
 
	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int employeeId = scanner.nextInt();
		
		System.out.println("Enter Employee Name");
		String employeeName = scanner.next();
		
		System.out.println("Enter Salary");
		double salary = scanner.nextDouble();
		
		System.out.println("Enter Pf Percentage");
		int pfPercentage = scanner.nextInt();
		
		
		Employee e1 = new Employee(employeeId,employeeName,salary,pfPercentage);
		e1.calculateNetSalary(pfPercentage);
		e1.showDetails();
	}
	
}
