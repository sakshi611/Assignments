package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter EID :");
		int eid= sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("problem with loding the driver main class");
		}
		
//		Driver d = new Driver();
		
		String cs = "jdbc:mysql://localhost:3306/db1";
		
		try {
			Connection conn = DriverManager.getConnection(cs,"root","Casper@116");
			
		PreparedStatement ps= conn.prepareStatement("select salary from employee where eid= "+eid+"");
			
		ResultSet rs= ps.executeQuery();
		
		
		    rs.next();
			int s= rs.getInt("salary");
			
			System.out.println("Salary is :"+s);
			
			System.out.println("=========================");
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		
	}

}
