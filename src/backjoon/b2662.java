package backjoon;

import java.util.Scanner;

public class b2662 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int m = s.nextInt();
		int n = s.nextInt();
		
		int[][] invest = new int[m][n];
		
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				invest[i][j] = s.nextInt();
			}
		}
		
		int result = 0;
		int[] check = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				invest[i][j] = s.nextInt();
			}
		}
		
		System.out.println(result);
		System.out.print(s);
	}
}
