package com.masai;

public class Student {
 
	private int roll;
	private String name;
	private String address;
	private String collageName;
	
		
	public Student(String name,String address,int roll,boolean from)
	{
		if(from==true)
		{
			this.roll=roll;
			this.name=name;
			this.address=address;
//			this.collageName="NIT";
		}
		else
		{
			this.roll=roll;
			this.name=name;
			this.address=address;
			this.collageName="Masai";
		}
	}

	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	public int getRoll()
	{
		return roll;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void showDetails()
	{
		System.out.println("Roll no. is:"+roll);
		System.out.println("Name is:"+name);
		System.out.println("Address is:"+address);
		if(collageName!=null) {
			System.out.println("CollageName is:"+collageName);
		}
		
	}
}
