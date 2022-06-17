package com.question2;
import java.util.Scanner;
public class Mobile {

	static String[] outdatedModels = {"note4","note5","note6","note7"};
	public void searchOutdatedModel(String company,String... name){
		for(int i = 0;i<outdatedModels.length;i++)
		{
			if(name[0].equals(outdatedModels[i]))
			{
				System.out.println(name[0]+"_OUTDATED");
				return;
			}
		}
		System.out.println("Error");
	}
	public static void main(String[] args) {
	 
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter Model name");
		String model = scan.next();
		Mobile mobile = new Mobile();
		mobile.searchOutdatedModel("Samsung",model);
	}
}
