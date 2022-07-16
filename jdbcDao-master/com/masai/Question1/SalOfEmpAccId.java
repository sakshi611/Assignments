package com.masai.Question1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.masai.EmpDao.EmpDaoImpl;

public class SalOfEmpAccId {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enetr employee Id");
		int id=sc.nextInt();
		
		EmpDaoImpl edo= new EmpDaoImpl();
		
		edo.salAccordingId(id);

	}

}
