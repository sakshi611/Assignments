package assignment_3;

public class demo {

	demo(){
		this("sakshi");
		System.out.println("Default Construtor");
	}
	
	demo(String s){
		this(11);
		System.out.println(""+s);
	}
	demo(int i){
		this(11.1f);
		System.out.println(""+i);
	}
	demo(float f){
		System.out.println(""+f);
	}

	
	public static void main(String[] args) {
		new demo();
	}

}
