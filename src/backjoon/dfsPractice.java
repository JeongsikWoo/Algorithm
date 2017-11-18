package backjoon;

import java.util.Scanner;

public class dfsPractice {
	
	static int e;
	static int v;
	static int[][] ad;
	static boolean[] visit;
	
	public static void dfs(int i){
		visit[i] = true;
		System.out.println(i + " ");
		
		for(int j = 1 ; j <= v ; j++) {
			if(ad[i][j] == 1 && visit[j] == false){
				dfs(j);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		v = s.nextInt();
		e = s.nextInt();
		ad = new int[v+1][v+1];
		visit = new boolean[v+1];
		
		for(int i = 0 ; i < e ; i++) {
			int m = s.nextInt();
			int n = s.nextInt();
			
			ad[m][n] = ad[n][m] = 1;
		}
		
		dfs(1);
	}
}
