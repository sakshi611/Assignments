package Q2;
import java.io.*;

public class Demo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("F://abc.txt");
		int i = fr.read();
		while(i!=-1) {
			System.out.println((char)i);
			i=fr.read();
		}fr.close();
	}
}
