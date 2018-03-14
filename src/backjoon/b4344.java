package backjoon;

import java.util.*;

public class b4344 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int c = s.nextInt();
		
		while(c-- > 0) {
			int n = s.nextInt();
			double score[] = new double[n];
			double average = 0;
			double result = 0.000;
			
			for(int i = 0 ; i < n ; i++) {
				score[i] = s.nextDouble();
				average += score[i];
			}
			
			average /= n;
			
			for (int i = 0 ; i < n ; i++) {
				if(score[i] > average) {
					result += 1;
				}
			}
			
			System.out.printf("%.3f%%\n", result/n*100);
		}
		s.close();
	}
}