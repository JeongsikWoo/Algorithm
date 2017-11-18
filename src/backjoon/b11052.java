package backjoon;

import java.util.Scanner;

public class b11052 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] p = new int[1001];
		int n = s.nextInt();
		int max = 0;

		for (int i = 1; i <= n; i++) {
			p[i] = s.nextInt();
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				max = Math.max(max, p[j] + p[i-j]);
			}
			if (max > p[i]) { p[i] = max; }
		}
		System.out.println(p[n]);
	}
}
/*
 * p1*2 : p2 p1*3 : p1+p2 : p3 p1*4 : p1*2+p2 : p2*2 : p1+p3 : p4 p1*5 : p1*
 */