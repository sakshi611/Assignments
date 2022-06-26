package Q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) throws Exception{

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serail.txt"));
		Student st = (Student) ois.readObject();
		System.out.println(st);
		ois.close();
	}

}
