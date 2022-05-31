package assignment_day7;

public class Member {
	 String Name;
	 int Age;
	 String Phone_number;
	 String Address;
	 double Salary;

	 
	 void printSalary() {
		 System.out.println(Salary);
	 }
	 
	 public String toString(){//overriding the toString() method  
		  return "Name: "+Name+" "+"Age: "+Age+" "+"Phone Number: "+Phone_number+" "+"Address: "+" "+Address+" "+"Salary: "+Salary;  
	}  
	 
}

class Employee extends Member{

	String  Specialisation= "Java";
	String Department = "IT";
	Employee(String n, int a, String p, String ad, double s){
		this.Name =n;
		this.Age=a;
		this.Phone_number=p;
		this.Address=ad;
		this.Salary=s;
	}
	
}

class Manager extends Member{
	 String Specialisation = "something";
	 String Department = "something";

	Manager(String n, int a, String p, String ad, double s){
		this.Name =n;
		this.Age=a;
		this.Phone_number=p;
		this.Address=ad;
		this.Salary=s;
	}
}
