package backjoon;

import java.util.Scanner;

public class b2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String result;
		
		while(t-- > 0) {
			int r = sc.nextInt();
			String s = sc.nextLine().trim();
			
			for(int i = 0 ; i < s.length() ; i++) {
				for(int j = 0 ; j < r ; j++) {
					System.out.print(s.charAt(i));
				}
			}
			System.out.println();
		}
	}
}
