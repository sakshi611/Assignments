package Q2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Address ad= new Address("UP","Bareilly","243001");
		Student st = new Student(0, "sakshi", ad, "sakshi@gmail.com", "123");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serail.txt"));
		oos.writeObject(st);
		oos.close();
		System.out.println("done dona done......");
	}

}
