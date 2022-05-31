package assignment_day8;

public class Main1 {

	public static void main(String[] args){
		//create an array of Animal class with size 3
		Animal[] an = new Animal[3];
		an[0] = new Dog();
		an[1] = new Cat();
		an[2] = new Tiger();
		
		an[0].makeNoise();
		an[0].eat();
		an[0].walk();
		
		an[1].makeNoise();
		an[1].eat();
		an[1].walk();
		
		an[2].makeNoise();
		an[2].eat();
		an[2].walk();
		
	}

}

class Animal{
	public void makeNoise(){
		System.out.println("Animal making Noise");
	}
	public void eat(){
		System.out.println("Animal is eating");
	}
	public void walk(){
		System.out.println("Animal is walking");
	}
	
}

class Dog extends Animal{
	public void makeNoise(){
		System.out.println("Barking...");
	}
}

class Cat extends Animal{
	public void makeNoise(){
		System.out.println("Meaw...");
	}
}

class Tiger extends Animal{
	public void makeNoise(){
		System.out.println("Raoring...");
	}
}