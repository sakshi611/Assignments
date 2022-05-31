package assignment_day10.Question2;

public abstract class Student {

	String name;
	String address;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	abstract double getPercentage( );
}
