package com.masai.EmpDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.EmpUtility.DBConnUtil;

public class EmpDaoImpl implements EmpDao{

	@Override
	public String insertEmployeeDetails(int eid, String name, String address, int salary) {
		String msg="Not inserted..";
		
		try(Connection conn=DBConnUtil.provideConn()){
			
			PreparedStatement ps=conn.prepareStatement("insert into employee3 values(?,?,?,?)");
			ps.setInt(1, eid);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setInt(4, salary);
			
			int x=ps.executeUpdate();
			if(x>0) {
				msg="Inserted ...";
			}
			
		} catch (SQLException e) {
			msg=e.getMessage();
		}
		return msg;
	}
	
	@Override
	public String updateSalaryWithBonus(int bonus) {
		String msg="Not inserted..";
		try(Connection conn=DBConnUtil.provideConn()){
			PreparedStatement ps=conn.prepareStatement("update employee3 set salary=salary+"+bonus+"");
			int x=ps.executeUpdate();
			if(x>0) {
				msg="Updated..!";
			}
		} catch (SQLException e) {
			msg=e.getMessage();
		}
		
		return msg;
	}

	
	@Override
	public void salAccordingId(int eid) {
		ResultSet rs=null;
		try(Connection conn=DBConnUtil.provideConn()){
			PreparedStatement ps=conn.prepareStatement("select salary from employee3 where eid="+eid+"");
			rs=ps.executeQuery();
			
			if(rs.next()) {
				   int sal=rs.getInt("salary");	
				   System.out.println("Salary : " +sal);
				}
				else {
					System.out.println("record not found.");
				}
			
		} catch (SQLException e) {
			e.getMessage();
		}
		
		
	}

	@Override
	public void allEmpDetails() {
		ResultSet rs=null;
		try(Connection conn=DBConnUtil.provideConn()){
			PreparedStatement ps=conn.prepareStatement("select * from employee3 ");
			rs=ps.executeQuery();
			
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
			e.getMessage();
		}
	}

	@Override
	public void empDetailsAccordingId(int eid) {
		ResultSet rs=null;
		try(Connection conn=DBConnUtil.provideConn()){
			PreparedStatement ps=conn.prepareStatement("select * from employee3 where eid="+eid+"");
			rs=ps.executeQuery();
			
			if(rs.next()) {
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
			else {
				System.out.println("record not found");
			}
			
		} catch (SQLException e) {
			e.getMessage();
		}
	}

	@Override
	public void empDetailsAccordingSalary(int salary) {
		ResultSet rs=null;
		try(Connection conn=DBConnUtil.provideConn()){
			PreparedStatement ps=conn.prepareStatement("select * from employee3 where salary<"+salary+"");
			rs=ps.executeQuery();
			
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
			e.getMessage();
		}
	}
	

}
