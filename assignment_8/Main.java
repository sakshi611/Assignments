package assignment_day8;

public class Main {

	public static void main(String[] args){
		Bird b1 = new Parrot();
		b1.fly();
		
		Parrot p1 = (Parrot) b1;
		p1.sing();

	}

}

class Bird{
	public void fly(){
		System.out. println("Bird is flying");
	}
}

class Parrot extends Bird{
	public void fly(){
		System.out.println("I am Flying");
	}
	
	public void sing(){
		System.out.println("I am Singing");
	}
	
}
