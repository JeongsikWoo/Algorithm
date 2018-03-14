package backjoon;

import java.util.Scanner;

public class b10039 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int score = 0;
		int average = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			score = s.nextInt();
			if(score < 40) score = 40;
			average += score;
		}
		
		System.out.println(average/5);
	}
}
