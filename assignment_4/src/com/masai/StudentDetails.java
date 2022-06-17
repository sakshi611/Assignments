package com.masai;

public class StudentDetails {
   Students s1 = new Students();
   
   StudentDetails(){
	   
   }
   StudentDetails(int roll,int age,int marks,String name){
	   s1.StudentDetail(roll,age,marks,name);
   }
   
   public static void main(String[] args) {
	
	   StudentDetails student1 = new StudentDetails();
	   student1.s1.StudentDetail(10, 25, 400, "Anubhav");
	   
	   StudentDetails student2 = new StudentDetails(11, 35, 450, "Briju");
       
   }
}
