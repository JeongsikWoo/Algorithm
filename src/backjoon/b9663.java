package backjoon;

import java.util.Scanner;

public class b9663 {

	static int answer, n;
	static int[] fx = new int[15];

	public static void dfs(int line) {
		if (line == n) {
			++answer;
		} else {
			for (int i = 1; i <= n; i++) {
				fx[line + 1] = i; // (line+1, i) 퀸 놓기
				if (check(line + 1)) {
					dfs(line + 1);
				} else {
					fx[line + 1] = 0;
				}
			}
		}
		fx[line] = 0;
	}

	public static boolean check(int c) {
		for (int i = 1; i < c; i++) {
			if (fx[i] == fx[c]) {
				return false;
			}
			if (Math.abs(fx[i] - fx[c]) == Math.abs(i - c)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			fx[1] = i; // (1, i)에 퀸 위치
			dfs(1);
		}
		System.out.println(answer);
	}
}
