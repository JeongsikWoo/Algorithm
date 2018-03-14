package backjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b1260 {
	
	// 그래프의 정보를 저장할 인접행렬
	static int node[][] = new int[1001][1001];
	// 방문한 노드를 표시할 배열
	static boolean check[] = new boolean[1001];
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		// 정점의 개수 입력
		int n = s.nextInt();
		// 간선의 개수 입력
		int m = s.nextInt();
		// 탐색을 시작할 정점 번호 입력
		int v = s.nextInt();
		
		// 간선이 연결하는 두 정점의 번호를 인접행렬을 통해 저장
		for(int i = 0 ; i < m ; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			
			node[x][y] = 1;
			node[y][x] = 1;
		}
		
		// dfs 실행
		dfs(v);
		
		// check 배열 초기화 및 줄바꿈
		for(int i = 1 ; i < 1001 ; i++)
			check[i] = false;
		System.out.println( );
		
		// bfs 실행
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
