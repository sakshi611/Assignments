package com.masai;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDetailsWithoutAddress {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Employee");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Enter Employee id");
			int eid= sc.nextInt();
			System.out.println("Enter Employee name");
			String name=sc.next();
//			String address=sc.next();
			System.out.println("Enter Employee salary");
			int salary=sc.nextInt();
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //
			String cs="jdbc:mysql://localhost:3306/db1"; // connection string
				try (Connection conn=DriverManager.getConnection(cs, "root", "Casper@116")){
//			   *****	To Insert data********
					
					PreparedStatement ps=conn.prepareStatement("insert into employee values(?,?,?,?)");
					ps.setInt(1, eid);
					ps.setString(2, name);
					ps.setString(3, null);
					ps.setInt(4, salary);
					
					int x=ps.executeUpdate();
					
					if(x>0) {
						System.out.println("Inserted..");
					}
					else {
						System.out.println("Not Inserted..");
					}
					
	
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub

	}

}
