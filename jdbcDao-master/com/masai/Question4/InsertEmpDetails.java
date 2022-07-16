package com.masai.Question4;

import java.util.Scanner;

import com.masai.EmpDao.EmpDaoImpl;

public class InsertEmpDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enetr Number of employees");
		int n=sc.nextInt();
		int i=0;
		while(i<n) {
			System.out.println("Enetr employee Id");
			int id=sc.nextInt();
			
			System.out.println("Enetr Name");
			String name=sc.next();
			
			System.out.println("Enetr Salary");
			int Salary=sc.nextInt();
			
			String address= null;
			
			EmpDaoImpl edi= new EmpDaoImpl();
			
			String msg=edi.insertEmployeeDetails(id, name, address, Salary);
			
			System.out.println(msg);
			i++;
		}
	}

}
