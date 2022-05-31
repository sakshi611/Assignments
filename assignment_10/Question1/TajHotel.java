package assignment_day10.Question1;

public class TajHotel implements Hotel{

	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
	}

	@Override
	public void chickenBiryani() {

		System.out.println("chickenBiryani from Tajhotel");
		
	}

	@Override
	public void masalaDosa() {
		
		System.out.println("masalaDosa from Tajhotel");
		
	}
	
}
