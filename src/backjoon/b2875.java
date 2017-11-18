package backjoon;

import java.util.Scanner;

public class b2875 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); // Female
		int M = s.nextInt(); // Male
		int K = s.nextInt(); // Internship
		int Team = 0;
		
		while(true) {
			if(N+M >= K+3 && N >= 2 && M >= 1) {
				N -= 2;
				M -= 1;
				Team++;
			}
			else
			 break;
		}
		
		System.out.println(Team);
	}
}
