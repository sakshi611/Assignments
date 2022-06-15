package Q1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {


		TreeSet <Product> products = new TreeSet <>(new SortByProductId());
		TreeSet <Product> products1 = new TreeSet <>(new SortByProductPrice());
		TreeSet <Product> products2 = new TreeSet <>(new SortByProductName());
		Scanner scan = new Scanner(System.in);
		
		 int count = 1;
		 
		 while(true)
		 {
			 System.out.println("Enter Product Details "+count++ );
			 
			 System.out.println("Enter ProductId:");
			 int pid = scan.nextInt();
			 
			 System.out.println("Enter productName:");
			 String pName = scan.next();
			 
			 System.out.println("Enter ProductPrice:");
			 double price  = scan.nextDouble();
			 
			 products.add(new Product(pid,pName,price));
			 products1.add(new Product(pid,pName,price));
			 products2.add(new Product(pid,pName,price));
			 System.out.println("Want More To Add y/n");
			 String ans = scan.next();
			 if(ans.equalsIgnoreCase("n"))
			 {
				 break;
			 }
			 
		 }
		 System.out.println("Enter your choice for sorting:");
		 System.out.println("1 for sorting the product according to the productPrice");
		 System.out.println("2 for sorting the product according to the productName");
		 System.out.println("3 for sorting the product according to the productId");
		String choice = scan.next();
		 if(choice.equals("1"))
		 {
			
			 System.out.println(products1);
		 }
		 else if(choice.equals("2"))
		 {
			
			 System.out.println(products2);
		 }
		 else if(choice.equals("3"))
		 {
			
			 System.out.println(products);
		 }
		 else
		 {
			
			 System.out.println(products);
		 }
		 
		 scan.close();

	}

}
