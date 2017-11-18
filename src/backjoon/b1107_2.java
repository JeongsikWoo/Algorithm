package backjoon;

import java.util.Scanner;

public class b1107_2 {

	static boolean check[] = new boolean[10];

	static int is_broken(int num) {
		int cnt = 0;
		while (num-- > 0) {
			if (check[num % 10])
				return -1;
			num /= 10;
			cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		int n, m, k=0;
		int ans, res;

		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		m = s.nextInt();

		for (int i = 0; i < m; i++)
			k = s.nextInt();
		check[k] = true;

		ans = n - 100;
		if (ans < 0)
			ans = -ans;
		if (!check[0])
			ans = ans < n + 1 ? ans : n + 1;
		for (int i = n; i < 1111111; i++) {
			res = is_broken(i);
			if (res > 0) {
				res += i - n;
				ans = ans < res ? ans : res;
				break;
			}
		}
		for (int i = n; i > 0; i--) {
			res = is_broken(i);
			if (res > 0) {
				res += n - i;
				ans = ans < res ? ans : res;
				break;
			}
		}
		System.out.println(ans);
	}
}