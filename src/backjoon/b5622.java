package backjoon;

import java.util.Scanner;

public class b5622 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		int num[] = new int[str.length()];
		int result = 0;
		
		for(int i = 0 ; i < str.length() ; i++) {
			char c = str.charAt(i);
			
			if(c=='A' || c=='B' || c=='C')
				num[i] = 2;
			else if(c=='D' || c=='E' || c=='F')
				num[i] = 3;
			else if(c=='G' || c=='H' || c=='I')
				num[i] = 4;
			else if(c=='J' || c=='K' || c=='L')
				num[i] = 5;
			else if(c=='M' || c=='N' || c=='O')
				num[i] = 6;
			else if(c=='P' || c=='Q' || c=='R' || c=='S')
				num[i] = 7;
			else if(c=='T' || c=='U' || c=='V')
				num[i] = 8;
			else if(c=='W' || c=='X' || c=='Y' || c=='Z')
				num[i] = 9;
		}
		for(int i = 0 ; i < str.length() ; i++)
			result += (num[i]+1);
		
		System.out.println(result);
	}
}
