package com.masai;

public class Students {

	private int roll;
	private int age;
	private int marks;
	private String name;
	
	Students(){
		
	}
  public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    void StudentDetail(int roll,int age,int marks,String name) {
	  if(age<18 || age>60 || marks<0 || marks>500)
	  {
		 System.out.println("Enter valid Credentials"); 
	  }
	  else
	  {
	  System.out.println("The Roll is:" + roll +"\n"+"The age is:" + age +"\n"+"The Mas are:" +  marks +"\n"+ "The name is:"+ name);
	  }
  }
}
