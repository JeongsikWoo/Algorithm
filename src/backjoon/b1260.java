package backjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b1260 {
	
	static int node[][] = new int[1001][1001];
	static boolean check[] = new boolean[1001];
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int v = s.nextInt();
		
		for(int i = 0 ; i < m ; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			
			node[x][y] = 1;
			node[y][x] = 1;
		}
		dfs(v);
		for(int i = 1 ; i < 1001 ; i++)
			check[i] = false;
		System.out.println( );
		bfs(v);
	}
	
	public static void bfs(int v) {
		Queue<Integer> q = new LinkedList();
		q.add(v);
		check[v] = true;
		
		while(!q.isEmpty()) {
			int tmp = q.poll();
			System.out.print(tmp + " ");
			for(int i = 1 ; i < 1001; i++) {
				if(node[tmp][i] == 1 && !check[i]) {
					check[i] = true;
					q.add(i);
				}
			}
		}
	}
	
	public static void dfs(int v) {
		System.out.print(v);
		check[v] = true;
		for(int i = 1 ; i < 1001; i++) {
			if(node[v][i] == 1 && !check[i]) {
				System.out.print(" ");
				dfs(i);
			}
		}
	}
}
