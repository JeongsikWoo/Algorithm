package backjoon;

import java.util.Scanner;

public class b1546 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		double score[] = new double[n];
		double top_score = Integer.MIN_VALUE;
		double result = 0;
		
		for(int i = 0 ; i < n ; i++) {
			top_score = Math.max(top_score, score[i] = s.nextInt());
		}
		
		for(int i = 0 ; i < n ; i++) {
			score[i] = (double)score[i]/top_score*100;
			result += score[i];
		}
		result /= n;
		
		System.out.println(result);
	}
}