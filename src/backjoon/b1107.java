package backjoon;

import java.util.Scanner;

public class b1107 {

	static boolean[] b_btn = new boolean[10];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt(); // 0 ~ 500,000
		int m = s.nextInt(); // 0 ~ 10
		
		final int init = 100;
		int result = 0;

		while (m-- > 0) {
			b_btn[s.nextInt()] = true;
		}
		
		for(int i = 0 ; i < 999999 ; i++) {
			if(is_broken(i)) {
				int num = i;
				int l = 0;
				
				while (num > 0) {
					num/=10;
					l++;
				}
				int count = Math.abs(i-n) + l;
				
				if(result == 0)
					result = count;
				else
					result = Math.min(result, count);
			}
		}
		
		if(result == 0)
			result = Math.abs(init-n);
		else
			result = Math.min(result, Math.abs(init-n));
		
		System.out.println(result);
	}

	static boolean is_broken(int n) {
		while (n > 0) {
			if (b_btn[n % 10]) return false;
			n /= 10;
		} return true;
	}
}