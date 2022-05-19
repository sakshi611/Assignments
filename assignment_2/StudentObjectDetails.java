package assignment_2;

public class StudentObjectDetails {
	
	int roll;
	String name;
	int marks;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentObjectDetails sod1 = new StudentObjectDetails();
		StudentObjectDetails sod2 = new StudentObjectDetails();
		
		sod1.name = "Sakshi";
		sod1.roll = 10;
		sod1.marks = 100;
		
		sod2.name = "Ankit";
		sod2.roll = 20;
		sod2.marks = 200;
		
		System.out.println(" Name: "+ sod1.name +" Roll No: "+ sod1.roll+ " Marks: "+ sod1.marks);
		System.out.println(" Name: "+ sod2.name +" Roll No: "+ sod2.roll+ " Marks: "+ sod2.marks);
	}

}
