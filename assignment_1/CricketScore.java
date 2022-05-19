package assignment_1;

public class CricketScore {

	static void cricketScore(int r1,int r2,int r3,int r4,int r6) {
		int result=(r1*1+r2*2+r3*3+r4*4+r6*6);
		System.out.println("Total score by Batsman: "+result);
	}
	public static void main(String args[]) {
		cricketScore(2,3,4,5,6);
	}
}
