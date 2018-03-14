package backjoon;

import java.util.Scanner;

public class b1316 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();s.nextLine();
		int cnt = 0;
		boolean is_group = true;
		boolean arr[] = new boolean[26];
		
		
		
		while(n-- > 0) {
			String str = s.nextLine();
			char pre = ' ';
			char next = ' ';
			
			for(int i = 0 ; i < str.length(); i++) {
				next = str.charAt(i);
				
				if(pre != next) {
					pre = next;
					
					if(!arr[(int)str.charAt(i)-97])
						arr[(int)str.charAt(i)-97] = true;
					else {
						is_group = false;
						break;
					}
				}
			}
			
			if(is_group) cnt++;
			else is_group = true;
			
			for(int i = 0 ; i < 26; i++)
				arr[i] = false;
		}
		
		System.out.println(cnt);
	}
}
