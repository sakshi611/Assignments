package assignment_day6;
import java.util.Scanner;

public class EvenSumInColumns {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of rows: ");
		int N = sc.nextInt();
		System.out.println("Enter Number of columns: ");
		int M = sc.nextInt();
		
	
		
		int[][] arr = new int[N][M];
		  
        for(int i=0; i<N;i++)
         {            
            for(int j=0; j<M;j++)
            {
            	System.out.println("enter the elements for the Matrix");
                arr[i][j]=sc.nextInt();
            }
         }


        System.out.print("column sum :\n");
        for (int i = 0; i < M; i++) {
        	int sum =0;
          for (int j = 0; j < N; j++) {
            if(arr[i][j]%2==0){
            	sum+=arr[j][i];
            }
          }
          System.out.println(sum);
        }
        
        sc.close();
	}
	
	

}
