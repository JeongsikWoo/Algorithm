package backjoon;

import java.util.Scanner;

public class b2441 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				
		int n = s.nextInt();
		        
		for(int i = 1; i <= n ; i++){
            for(int j = n; j >= 1 ; j--){
                if(j > n-i + 1){
                    System.out.print(" ");
                }
                else{
		            System.out.print("*");
                }
	        }
	        System.out.println();
	    }
	}
}
