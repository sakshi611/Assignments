package com.masai;

public class Employee {
     private int employeeId;
     private String employeeName;
     private double salary;
     private double netSalary;
     private int pfpercentage;
     
     Employee( int employeeId,String employeeName,double salary,int pfpercentage){
    	 this.employeeId = employeeId;
    	 this.employeeName = employeeName;
    	 this.salary = salary;
    	 this.pfpercentage= pfpercentage;
     }

     
     public void calculateNetSalary(int pfpercentage) {
    	 double pf = (this.salary*this.pfpercentage)/100;
    	 
    	 double neTSalary = this.salary-pf;
    	 this.netSalary = neTSalary;
     }
     
     public void showDetails() {
    	 System.out.println("ID:"+employeeId);
    	 System.out.println("Name:"+employeeName);
    	 System.out.println("Salary:"+salary);
    	 System.out.println("Net Salary:"+netSalary);
     }
     
     public void setEmplpoyeeId(int employeeId) {
    	 this.employeeId =  employeeId;
     }
     
     public void setEmployeeName(String employeeName) {
    	 this.employeeName = employeeName;
     }
     
     public void setSalary (double salary) {
    	 this.salary = salary;
     }
     
     public void setNetSalary(double netSalary) {
    	 this.netSalary = netSalary;
     }
     
     public int getEmployeeId() {
    	 return employeeId;
     }
     
     public String getEmployeeName() {
    	 return employeeName;
     }
     
     public double getSalary() {
    	 return salary;
     }
     
     public double netSalary() {
    	 return netSalary;
     }
}
