package backjoon;

import java.util.Scanner;

public class b1152 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean character = false;
		int cnt = 0;
		
		String input = s.nextLine();
		
		for(int i = 0 ; i < input.length() ; i++) {
			if(input.charAt(i) == ' ') {
				character = false;
			}
			else if(!character && input.charAt(i) != ' '){
				cnt++;
				character = true;
			}
		}
		System.out.println(cnt);
	}
}
