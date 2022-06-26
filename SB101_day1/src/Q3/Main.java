package Q3;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character");
		char ch = sc.next().charAt(0);
		
		File f = new File("F://abc.txt");
		FileReader fr = new FileReader(f);
		int i = fr.read();
		int count = 0;
		while(i!=-1) {
			if((char)i == ch) {
				count++;
			}
			i=fr.read();
		}
		System.out.println("File  "+ f + " " + "has " +  count +" "+ "instances of letter '" + ch + "'");
		fr.close();
		sc.close();
	}
}
