package assignment_day10.Question2;
import java.util.Scanner;

public class AllStudents {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Student Name");
		String name = scan.next();
		
		
		System.out.println("Enter Address");
		String address = scan.next();
		
		
		System.out.println("Enter physicsMarks");
		int physics = scan.nextInt();
		System.out.println("Enter chemistryMarks");
		int chemistry = scan.nextInt();
		System.out.println("Enter mathsMarks");
		int maths = scan.nextInt();	
		ScienceStudent scienceStudent = new ScienceStudent(physics, chemistry, maths);
		scienceStudent.setName(name);
		scienceStudent.setAddress(address);
		double per1=scienceStudent.getPercentage();
		System.out.println("Name:"+scienceStudent.getName());
		System.out.println("Address:"+scienceStudent.getAddress());
		System.out.println("Percentage of Science Student:"+per1+'%');
		System.out.println("=========================");
		System.out.println(" ");

		
		System.out.println("Enter Student Name");
		String name2 = scan.next();
		System.out.println("Enter Address");
		String address2 = scan.next();
		System.out.println("Enter historyMarks");
		int history = scan.nextInt();
		System.out.println("Enter civicsMarks");
		int civics = scan.nextInt();

		HistoryStudent historyStudent = new HistoryStudent(history, civics);
		historyStudent.setAddress(address2);
		historyStudent.setName(name2);
		double per=historyStudent.getPercentage();
		
		System.out.println("Name:"+historyStudent.getName());
		System.out.println("Address:"+historyStudent.getAddress());
		System.out.println("Percentage of History Studrnt:"+per+"%");
		
		
		scan.close();
		
	}

}
