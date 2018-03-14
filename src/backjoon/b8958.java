package backjoon;

import java.util.Scanner;

public class b8958 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		int score_tmp = 0;
		int total_score = 0;
		s.nextLine();
		
		while(t-- > 0) {
			score_tmp = 0;
			total_score = 0;
			
			String input = s.nextLine();
			
			for(int i = 0 ; i < input.length() ; i++) {
				if(input.charAt(i) == 'O')
					score_tmp++;
				else
					score_tmp = 0;
				total_score += score_tmp;
			}
			
			System.out.println(total_score);
		}
	}
}
