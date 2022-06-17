package com.masai;

public class nonStaticMethod {
  
	void number(int n) {
		
		if (n>=0)
		{
			if(n%2!=0)
			{
				System.out.println(n);
			}
			else
			{
				int b = (n/10)*10;
				//System.out.println(n/10);
				//System.out.println(b);
				int a = b + 10;
				System.out.println(a);
			}
		}
		else
		{
			System.out.println("Error");
		}
			
	}
	public static void main(String[] args) {
		
		new nonStaticMethod().number(46);
	}
}
