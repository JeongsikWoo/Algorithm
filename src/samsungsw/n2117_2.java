package samsungsw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n2117_2 {

	static int graph[][] = new int[20][20];
	static boolean visited[][] = new boolean[20][20];

	static int n, m;
	static int result = 0;
	
	static int oper_cost;
	static int company_profit;
	static int customer_num;

	static final int[] dx = { 0, 0, -1, 1 };
	static final int[] dy = { 1, -1, 0, 0 };

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		// roof algorithm at 't' times
		for (int testcase = 1; testcase <= t; testcase++) {
			result = 0;
			n = s.nextInt();
			m = s.nextInt();

			// input '0' or '1' in graph
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					graph[i][j] = s.nextInt();
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					dfs(i, j);
					refresh();
				}
			}
			System.out.println("#" + (testcase) + " " + result);
		}
	}
	
	// initialization
	static void refresh() {
		customer_num = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				visited[i][j] = false;
			}
		}
	}

	static void dfs(int i, int j) {
		Queue<Node> q = new LinkedList();

		q.add(new Node(i, j, 1));
		visited[i][j] = true;

		while (!q.isEmpty()) {
			Node node = q.poll();

			int cur_i = node.i;
			int cur_j = node.j;
			int cur_k = node.k;
			
			if(graph[cur_i][cur_j] == 1) {
				customer_num++;
			}
			
			oper_cost = cur_k*cur_k + (cur_k-1)*(cur_k-1);
			company_profit = customer_num*m - oper_cost;
			if(company_profit >= 0) {
				result = Math.max(result, customer_num);
			}

			for (int _i = 0; _i < 4; _i++) {
				int next_i = cur_i + dx[_i];
				int next_j = cur_j + dy[_i];

				if (next_i >= 0 && next_j >= 0 && next_i < n && next_j < n) {
					if (!visited[next_i][next_j]) {
						q.add(new Node(next_i, next_j, cur_k+1));
						visited[next_i][next_j] = true;
					}
				}
			}
		}
	}

	static class Node {
		int i, j, k;

		Node(int i, int j, int k) {
			this.i = i;
			this.j = j;
			this.k = k;
		}
	}
}
