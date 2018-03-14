package backjoon;

import java.util.Scanner;

public class b14888 {
	
	static int[] numbers = new int[12];
	static int n, plus_input, minus_input, multiple_input, division_input;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// Input length of array in 'N' (2 <= N <= 11)
		n = s.nextInt();
		
		// Input value of array in 'A' (1 <= A[i] <= 100)
		for(int i = 0 ; i < n ; i++) {
			numbers[i] = s.nextInt();
		}
		
		// Input number of each operators 
		plus_input = s.nextInt();
		minus_input = s.nextInt();
		multiple_input = s.nextInt();
		division_input = s.nextInt();
		
		dfs(1, 0, 0, 0, 0, numbers[0]);
		
		System.out.println(max);
		System.out.println(min);
		
		s.close();
	}
	
	static void dfs(int idx, int plus, int minus, int multiple, int division, int total) {
		System.out.println(idx + ", " + plus + ", " + minus + ", " + multiple + ", " + division + ", " + total);
		
		if(idx == n) {
			max = Math.max(max, total);
			min = Math.min(min, total);
			return;
		}
		if(plus < plus_input) {
			dfs(idx+1, plus+1, minus, multiple, division, total+numbers[idx]);
		}
		if(minus < minus_input) {
			dfs(idx+1, plus, minus+1, multiple, division, total-numbers[idx]);
		}
		if(multiple < multiple_input) {
			dfs(idx+1, plus, minus, multiple+1, division, total*numbers[idx]);
		}
		if(division < division_input) {
			dfs(idx+1, plus, minus, multiple, division+1, total/numbers[idx]);
		}
	}
}