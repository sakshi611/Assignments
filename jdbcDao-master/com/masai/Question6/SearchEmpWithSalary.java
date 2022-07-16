package com.masai.Question6;

import java.util.Scanner;

import com.masai.EmpDao.EmpDaoImpl;

public class SearchEmpWithSalary {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enetr salary");
		int salary=sc.nextInt();
		
		System.out.println("Here are employees");
		System.out.println("********************");
		EmpDaoImpl edi= new EmpDaoImpl();
		
		edi.empDetailsAccordingSalary(salary);

	}

}
