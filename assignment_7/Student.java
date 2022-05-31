package assignment_day7;

public class Student {

	int studId;
	String studName;
	double examFee = 10000;
	double totalFee;
	
	void displayDetails(){
		System.out.println("Student Id: "+studId+" "+"Student Name: "+studName+" ");
	}
	double payFee(double p){
		return (examFee-p);
	}
}

class DayScholar extends Student{
	
	DayScholar(int sid,String st){
		this.studId =sid;
		this.studName=st;
	}

	double	transportFee = 15000;
	
	double payFee(double p){
		return ( examFee+transportFee-p);
	}
}
class Hosteller extends Student{
	double hostelFee = 30000;
	
	Hosteller(int sid,String st){
		this.studId =sid;
		this.studName=st;
	}
	
	double payFee(double p){
		return ( examFee+hostelFee-p);
	}
}