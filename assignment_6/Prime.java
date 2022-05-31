package assignment_day6;

public class Prime {
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		//write the logic to iterate through the supplied inputArray and
		//determine each element whether it is prime or not
		//create a second array of Integer
		int[] arr1 = new int[inputArray.length];
		int index = -1;
		for (int i = 0; i < inputArray.length; i++) {
            int j = 2;
            int p = 1;
            
            while (j < inputArray[i]) {
                if (inputArray[i] % j == 0) {
                    p = 0;
                    break;
                }
                j++;
            }
            if (p == 1) {
            	arr1[++index]=inputArray[i];
                
            }
        }
		
		return arr1;

		}
		public static void main(String[] args){
		//Create the object of Main class
			Prime pr = new Prime();
			int[] arr = {10,12,5,50,11,14,15};
			int[] result = pr.findAndReturnPrimeNumbers(arr);
			

			
			for(int i=0; i< result.length; i++) {
				if(result[i] !=0) {
					System.out.print(result[i] + " ");
				}
	
			}
		
		}
}
