package assignment_2;

public class StaticAndNotStatic {

		int myVariable;
		  static int data = 30;
		   
		   public static void main(String args[]){
			   StaticAndNotStatic obj = new StaticAndNotStatic();
		      
		      System.out.println("Value of instance variable: "+obj.myVariable);
		      System.out.println("Value of static variable: "+data );
		   }


}
