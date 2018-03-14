package backjoon;

import java.util.Scanner;

public class b2577 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int result[] = new int[10];
		
		int multiple = a*b*c;
		
		for(int i = 0 ; multiple != 0; i++) {
			result[multiple % 10]++;
			multiple /= 10;
		}
		
		for(int i = 0 ; i < 10; i++)
			System.out.println(result[i]);
	}
}
