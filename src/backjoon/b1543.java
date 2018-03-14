package backjoon;

import java.util.Scanner;

public class b1543 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String sub = s.nextLine();
		
		int result = 0;
		
		for(;str.indexOf(sub) > -1; result++) {
				str = str.substring(str.indexOf(sub) + sub.length(), str.length());
		}
		System.out.println(result);
	}
}
