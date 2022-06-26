package Q2;

import java.io.Serializable;

public class Student implements Serializable{

	private int rollNo;
	private String name;
	private Address address;
	private String email;
	transient private String password;
	
	
	public Student() {

	}

	public Student(int rollNo, String name, Address address, String email, String password) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}
	
	
	
	
}
