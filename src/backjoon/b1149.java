package backjoon;

import java.util.Scanner;

public class b1149 {
	static public void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int total_cost[][] = new int[n][3];
		int cost[][] = new int[n][3];
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				cost[i][j] = s.nextInt();
			}
		}
		
		total_cost[0][0] = cost[0][0];
		total_cost[0][1] = cost[0][1];
		total_cost[0][2] = cost[0][2];
		
		for(int i = 1; i < n ; i++) {
			total_cost[i][0] = Math.min(total_cost[i-1][1], total_cost[i-1][2]) + cost[i][0];
			total_cost[i][1] = Math.min(total_cost[i-1][0], total_cost[i-1][2]) + cost[i][1];
			total_cost[i][2] = Math.min(total_cost[i-1][0], total_cost[i-1][1]) + cost[i][2];
		}
		
		int result = Math.min(total_cost[n-1][0], Math.min(total_cost[n-1][1], total_cost[n-1][2]));
		
		System.out.println(result);
		
	}
}
