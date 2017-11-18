package backjoon;

import java.util.Scanner;
import java.util.Stack;

public class b3111 {
	public static void main(String args[]) {
		boolean check = true;
		Scanner s = new Scanner(System.in);
		
		String A = s.nextLine();
		String T = s.nextLine();
		
		Stack st_f = new Stack();
		Stack st_b = new Stack();
		
		
		for(int i = 0 ; i < T.length(); i++)
			st_f.push(T.charAt(i));
		for(int i = 0 ; i < T.length(); i++)
			System.out.println(st_f.pop());
		
		for(int i = 0 ; i < T.length(); i ++) {
			
		}
		
	}
}
