package backjoon;

import java.util.Scanner;

public class b2858 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int r_brick = s.nextInt();
		int b_brick = s.nextInt();
		
		int l, w;
		
		for(l = 1 ; ; l++) {
			
			if(b_brick % l == 0) {
				w = b_brick / l;

				if(l*2 + w*2 + 4 == r_brick) {
					System.out.println((w+2) + " " + (l+2));
					break;
				}
			}
		}
	}
}
