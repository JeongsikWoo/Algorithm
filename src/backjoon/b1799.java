package backjoon;

import java.util.Scanner;

public class b1799 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// n is a natural number less than 10
		int n = s.nextInt();
		int array[][] = new int[n][n];
		int result = 0;
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0; j < n ; j++) {
				array[i][j] = s.nextInt();
			}
		}
		
		dfs(0, 0);
		
		System.out.println(result);
	}
	public static void dfs(int i , int j) {
		
	}
}
