package com.masai.EmpDao;

import java.sql.ResultSet;

public interface EmpDao {
	 public String insertEmployeeDetails(int eid, String name, String address, int salary);
	 
	 public String updateSalaryWithBonus(int bonus);
	 
	 public void salAccordingId(int eid);
	 
	 public void allEmpDetails();
	 
	 public void empDetailsAccordingId(int eid);
	 
	 public void empDetailsAccordingSalary(int salary);
	 
}
