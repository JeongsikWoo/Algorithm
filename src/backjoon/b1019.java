package backjoon;

import java.util.Scanner;

public class b1019 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int N, prev = 0;
		int [] cnt = {0,0,0,0,0,0,0,0,0,0};
		
		N = s.nextInt();

		for (int i = 1 ; N > 0 ; i *= 10) {
				int now = N % 10;
				N /= 10;
				
				for (int j = 0; j < now; ++j)
					cnt[j] += (N + 1) * i;
				cnt[now] += N * i + prev + 1;
				
				for (int j = now + 1; j < 10; ++j)
					cnt[j] += N * i;
				
				cnt[0] -= i;
				
				prev += now * i;
		}
		
		for (int i = 0 ; i < 10; ++i) {
			System.out.print(cnt[i]);
			if(i != 9)
				System.out.print(" ");
		}
	}
}
