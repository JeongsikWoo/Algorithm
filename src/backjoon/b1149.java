package backjoon;

import java.util.Scanner;

public class b1149 {
	
	static int r[];
	static int b[];
	static int g[];
	static int s_r=0;
	static int s_b=0;
	static int s_g=0;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		r = new int[n+1];
		g = new int[n+1];
		b = new int[n+1];
		for(int i=1; i<=n ; i++) {
			r[i] = s.nextInt();
			g[i] = s.nextInt();
			b[i] = s.nextInt();
		}
		
		for(int i = n ; i>1 ; i--) {
			//r
			Math.min(b[i-1]+r[i], g[i-1]+r[i]);
		}
		System.out.println(Math.min(s_r, Math.min(s_g, s_b)));
		
		
		
	}
}
