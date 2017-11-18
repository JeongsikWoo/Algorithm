package backjoon;

import java.util.Scanner;

public class b2302 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int m = s.nextInt();
		int start = 0;
		int result = 1;

		int vip[] = new int[m];
		for (int i = 0; i < m; i++) {
			vip[i] = s.nextInt();
		}

		for (int i = 0; i < m; i++) {
			int num = vip[i] - start - 1;
			start = vip[i];
			result *= cal(num);
		}
		result *= cal(n - vip[m - 1]);

		System.out.println(result);
	}

	static int cal(int num) {
		if (num == 0)
			return 1;
		else if (num == 1)
			return 1;
		else {
			return cal(num - 1) + cal(num - 2);
		}
	}
}
