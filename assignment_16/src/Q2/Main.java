package Q2;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {

		TreeSet <Employee> employee = new TreeSet <>(new sortBySalary());
		Scanner scan = new Scanner(System.in);
		
 int count = 1;
		 
		 while(true)
		 {
			 System.out.println("Enter Product Details "+count++ );
			 
			 System.out.println("Enter Employee Id:");
			 int empId = scan.nextInt();
			 
			 System.out.println("Enter Employee Name:");
			 String empName = scan.next();
			 
			 System.out.println("Enter Employee salary:");
			 double salary  = scan.nextDouble();
			 
			 employee.add(new Employee(empId, empName,salary));
	
			 System.out.println("Want More To Add y/n");
			 String ans = scan.next();
			 if(ans.equalsIgnoreCase("n"))
			 {
				 break;
			 }
			 
		 }
		 
		 System.out.println(employee);
		 scan.close();
	}
	
	

}
