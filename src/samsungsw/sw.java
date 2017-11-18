package samsungsw;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1937
 * 백준 1937 욕심쟁이 판다
 * BFS
 * 2017.10.05
 */
public class sw {
	public static int N;
	
	public static int[][] tree = new int[500][500];
	public static int[][] dp = new int[500][500];
	public static boolean[][] check = new boolean[500][500];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 크기

		int K = 0; // 살 수 있는 일 수
		int tmp = 0;
		
		dp = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				tree[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				tmp = dfs(i, j);
				if (tmp < K) {
					tmp = K;
				}
			}
		}
		
		

		System.out.println(K);
	}

	public static int dfs(int x, int y) {
		if (check[x][y] == false) {
			int dx[] = { 1, -1, 0, 0 };
			int dy[] = { 0, 0, 1, -1 };

			dp[x][y] = 1;

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
					continue;
				}

				if (tree[x][y] < tree[nx][ny]) {
					int tmp = dfs(x, y) + 1;
					if (dp[x][y] < tmp) {
						dp[x][y] = dfs(nx, ny) + 1;
						check[x][y] = true;
					}
				}
			}
		}
		return dp[x][y];
	}
}