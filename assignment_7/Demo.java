package assignment_day7;
import java.util.Scanner;


public class Demo {

	public static Bank getBank(String bank) {
		if(bank.equalsIgnoreCase("Axis")) {
			return new  AxisBank();
		}
		else if(bank.equalsIgnoreCase("Icici")) {
			return new  ICICIBank();
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bank Name");
		String bankName = sc.next();
		Bank b1 = new Demo().getBank(bankName);
		sc.close();
		b1.displayDetails();
	}

}
