package com.masai.Question3;

import java.util.Scanner;

import com.masai.EmpDao.EmpDaoImpl;

public class UpdateSalWithBonus {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enetr Bonus");
		int bonus=sc.nextInt();
		
		EmpDaoImpl edi= new EmpDaoImpl();
		
		String msg=edi.updateSalaryWithBonus(bonus);
		
		System.out.println(msg);
	}

}
