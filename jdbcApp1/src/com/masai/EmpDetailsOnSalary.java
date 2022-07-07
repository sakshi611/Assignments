package com.masai;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDetailsOnSalary {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //
			String cs="jdbc:mysql://localhost:3306/db1"; // connection string
			try (Connection conn=DriverManager.getConnection(cs, "root", "Casper@116")){
				

				
				PreparedStatement ps=conn.prepareStatement("select * from employee where salary>80000");
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					int i=rs.getInt("eid");
					String n=rs.getString("name");
					String ad=rs.getString("address");
					int sal=rs.getInt("salary");
					
					System.out.println("EId: "+i);
					System.out.println("Name: "+n);
					System.out.println("Address: "+ad);
					System.out.println("Salary: "+sal);
					System.out.println("==================================== ");
					System.out.println(" ");
					
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
