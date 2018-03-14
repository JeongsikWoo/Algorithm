package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class b2920 {
	public static void main(String[] args) {
		int asc[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int des[] = {8, 7, 6, 5, 4, 3, 2, 1};
		int input[] = new int[8];
		
		Scanner s = new Scanner(System.in);
		for(int i = 0 ; i < 8 ; i++) {
			input[i] = s.nextInt();
		}
		
		if(Arrays.equals(input, asc))
			System.out.println("ascending");
		else if(Arrays.equals(input, des))
			System.out.println("descending");
		else
			System.out.println("mixed");
	}
}
