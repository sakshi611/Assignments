package assignment_1;
import java.util.Scanner;

public class NaturalNumber {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any number");
			int number = sc.nextInt();
			int totalSum = number * (number+1)/2;
			System.out.println(totalSum);
			sc.close();
		}
}
