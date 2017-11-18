package backjoon;

import java.util.Scanner;

public class b1003 {
	
	static int zero = 0;
	static int one = 0;
	
	static void fibonacci(int n) {
		if(n==0) {
			zero ++ ;
		}
		else if(n==1) {
			one ++;
		}
		else {
			fibonacci(n-1);
			fibonacci(n-2);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		while(t-- > 0) {
			zero = 0;
			one = 0;
			int n = s.nextInt();
			fibonacci(n);
			System.out.print(zero + " " + one);
			System.out.println();
		}
		
	}
}
