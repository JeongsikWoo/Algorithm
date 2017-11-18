package backjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class testtesttest {

	public static int des_x;
	public static int des_y;
	public static boolean[][] visited;
	public static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T-- > 0) {
			N = sc.nextInt();
			int[][] map = new int[N][N];
			visited = new boolean[N][N];
			int now_x = sc.nextInt();
			int now_y = sc.nextInt();
			des_x = sc.nextInt();
			des_y = sc.nextInt();
			System.out.println(bfs(now_y, now_x));
		}
	}

	public static class node {
		int x, y, cnt;

		node(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}

	public static int bfs(int x, int y) {
		Queue<node> q = new LinkedList<>();
		q.add(new node(x, y, 0));

		int[] dx = { 1, 2, 2, 1, -1, -2, -2, -1 };
		int[] dy = { 2, 1, -1, -2, -2, -1, 1, 2 };

		while (!q.isEmpty()) {
			int q_size = q.size();
			node node = q.poll();
			x = node.x;
			y = node.y;
			int cnt = node.cnt;
			if (x == des_x && y == des_y) {
				return cnt;
			}

			for (int j = 0; j < 8; j++) {
				int nx = x + dx[j];
				int ny = y + dy[j];
				if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
					if (!visited[nx][ny]) {
						visited[nx][ny] = true;
						q.add(new node(nx, ny, cnt+1));
					}
				}
			}
		}
		return -1;
	}
}
