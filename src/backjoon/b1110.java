package backjoon;

import java.util.Scanner;

public class b1110 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int preN = n;
		int nextN = 100;
		
		int ten, one;
		
		int result = 0;
		
		while(n != nextN) {
			if(preN < 9)
				ten = 0;
			else
				ten = preN / 10;
			one = preN % 10;
			
			nextN = one*10 + (one+ten)%10;
			preN = nextN;
			
			result++;
		}
		
		System.out.println(result);
	}
}

