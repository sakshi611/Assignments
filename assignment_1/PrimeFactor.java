package assignment_1;

public class PrimeFactor {

		public static void main(String args[]) {
			primeFactor(135);
		}
		static void primeFactor(int num) {
			if(num<2 || num>200) {
				System.out.println("Invalid numbers");
			}else {
				for(int i=2;i<num/2;i++) {
					if(num%i==0) {
						boolean f=false;
						for(int j=2;j<i;j++) {
							if(i%j==0) {
								f=true;
								break;
							}
						}
						if(f==false) {
							System.out.println(i);
						}
					}
				}
			}
		

	}

}
