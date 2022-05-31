package assignment_day7;

public class Bank {
	String branchName;
	String IfscCode;
	
	void displayDetails() {
		System.out.println("Branch Name: "+branchName+" "+"IFSC Code: "+IfscCode);
	}
}
class AxisBank extends Bank{
	String branchName = "Axis";
	String IfscCode = "Ax0123";
	double rateOfInterest = 12;
	
	void displayDetails() {
		System.out.println("Branch Name: "+branchName+" "+"IFSC Code: "+IfscCode+" "+"Rate Of Interest: "+rateOfInterest);
		getCreditCard();
	}
	
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}

class ICICIBank extends Bank{
	String branchName = "ICICI";
	String IfscCode = "ICICI1234";
	double rateOfInterest = 15;
	
	void displayDetails() {
		System.out.println("Branch Name: "+branchName+" "+"IFSC Code: "+IfscCode+" "+"Rate Of Interest: "+rateOfInterest);
	}
}