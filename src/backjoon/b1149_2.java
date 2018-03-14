package backjoon;

import java.util.Scanner;

public class b1149_2 {
	
	static int color[][];
	static int n;
	static int result = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		color = new int [n][3];
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				color[i][j] = s.nextInt();
			}
		}
		
		for(int i = 0 ; i < 3 ; i++)
			search(0, i, 0);
		
		System.out.println(result);
	}
	
	static void search(int idx, int rgb, int t) {
		
		int total = t;
		int index = idx;
		
		total += color[index][rgb];
			
		if(index == n-1) {
			result = Math.min(total, result);
			return;
		}
		else {
			for(int i = 0 ; i < 3 ; i++) {
				if(rgb != i)
					search(index+1, i, total);
			}
		}
	}
}
