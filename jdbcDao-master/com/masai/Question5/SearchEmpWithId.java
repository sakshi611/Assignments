package com.masai.Question5;

import java.util.Scanner;

import com.masai.EmpDao.EmpDaoImpl;

public class SearchEmpWithId {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enetr employee Id");
		int id=sc.nextInt();
		
		EmpDaoImpl edi= new EmpDaoImpl();
		
		edi.empDetailsAccordingId(id);

	}

}
