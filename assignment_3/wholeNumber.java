package assignment_3;

public class wholeNumber {

	void checkNumber(int n){
		if(n>0){
			if(n%2 !=0) {
				System.out.println(n);
			}
			else{
				System.out.println((n + 9) / 10 * 10);
			}
		}
		else {
			System.out.println("Error");
		}
		
	}
	public static void main(String[] args) {
		wholeNumber wn = new wholeNumber();
		wn.checkNumber(44);
		wn.checkNumber(45);
		wn.checkNumber(-5);
	}

}
