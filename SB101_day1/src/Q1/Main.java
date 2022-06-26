package Q1;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
			FileReader  fr = new FileReader("F://abc.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line !=null) {
				System.out.println(line);
				line = br.readLine();
			}br.close();
	}
}
