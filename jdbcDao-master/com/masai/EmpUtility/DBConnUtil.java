package com.masai.EmpUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnUtil {
	public static Connection provideConn() {
    	Connection conn=null;
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //
    	}
    	catch (Exception e) {
			System.out.println("Proble with driver class.");
		}
    	String cs="jdbc:mysql://localhost:3306/db3";
    	try {
    		conn=DriverManager.getConnection(cs, "root", "Chandani@99");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return conn;
    }

}
