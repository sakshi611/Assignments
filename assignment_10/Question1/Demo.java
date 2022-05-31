package assignment_day10.Question1;
import java.util.Scanner;

public class Demo {

	
	public Hotel provideFood(int amount) {
		
		if(amount>=1000)
		{
			TajHotel tajHotel = new TajHotel();
			return tajHotel;
		}
		else {
			RoadSideHotel roadHotel = new RoadSideHotel();
			return roadHotel;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount");
		int amount = sc.nextInt();
		if(amount<=200) {
			System.out.println("Enter valid Amount");
		}
		else
		{
		    Demo d1 = new Demo();
		    Hotel o1=d1.provideFood(amount);
		    if(o1 instanceof TajHotel) {
		    	TajHotel taj = new TajHotel();
		    	taj.welcomeDrink();
		    }
		    else if(o1 instanceof RoadSideHotel) {
		    	RoadSideHotel road = new RoadSideHotel();
		    	road.masalaDosa();
		    }
		}
		
		sc.close();
		
    }

}
