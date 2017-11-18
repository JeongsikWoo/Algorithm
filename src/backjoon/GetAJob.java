package backjoon;

import java.util.Scanner;

public class GetAJob {
	static int input[][] = new int[500][500];
	static boolean visited[][] = new boolean[500][500];
	static int dp[][] = new int[500][500];
	static int count;

	final static int dx[] = { 1, -1, 0, 0 };
	final static int dy[] = { 0, 0, 1, -1 };

	static int cnt;
	static int k;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		k = s.nextInt();

		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				input[i][j] = s.nextInt();
				dp[i][j] = 1;
			}
		}

		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				if (cnt < dfs(i, j))
					cnt = dfs(i, j);
			}
		}

		System.out.println(cnt);
	}

	static int dfs(int x, int y) {
		if (visited[x][y] == false) {
			count++;
			visited[x][y] = true;
			for (int i = 0; i < 4; ++i) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if ((0 <= nx && nx < k) && (0 <= ny && ny < k)
						&& input[x][y] < input[nx][ny]) {
					dfs(nx, ny);

				}
			}
		}
		return count;
	}
}