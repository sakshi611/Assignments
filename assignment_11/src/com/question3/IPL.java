package com.question3;
import java.util.Scanner;
public class IPL {

	public void homeTeamStadium(Stadium stadium)
	{
//		Stadium stad = Stadium.CHIDAMBARAM_STADIUM;
		switch(stadium)
		{
		case EDEN_GARDENS_STADIUM: 
			System.out.println("This is the home ground of KKR");
		    break;
		case WANKHEDE_STADIUM:
			System.out.println("This is the home ground of Mumbai Indians");
			break;
		case CHIDAMBARAM_STADIUM:
			System.out.println("This is the home ground of CSK");
			break;
		case M_CHINNASWAMY_STADIUM:	
			System.out.println("This is the home ground of RCB");
			break;
			default:
				System.out.println("Other Stadium");
		}
	}
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter Stadium Name");
		 String StadiumName  = scan.next();
		 Stadium sn = Stadium.valueOf(StadiumName);
		 IPL name = new IPL();
		 name.homeTeamStadium(sn);
		 
	}
}
