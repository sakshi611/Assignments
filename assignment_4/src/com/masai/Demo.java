package com.masai;

public class Demo {
   Demo(){
	   this("Anubhav");
	   System.out.println("This is the Demo() constructor");
   }
   
   Demo(String s)
   {
	   this(10);
	   System.out.println("This is the Demo(String s) constructor");
   }
   
   Demo(int i)
   {
	   this(15.3f);
	   System.out.println("This is the Demo(int i) constructor");
   }
   
   Demo(float f)
   {
	   System.out.println("This is the Demo(float f) constructor");
   }
   
   public static void main(String[] args) {
	   new Demo();
	}
}
