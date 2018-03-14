package backjoon;

import java.util.Scanner;

public class b10809 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
        String str = s.nextLine();
        int result[] = new int [26];
        for(int i = 0 ; i < 26 ; i++)
        		result[i] = -1;
        
        for(int i = 0 ; i < str.length() ; i++) {
	        	if(result[(int)str.charAt(i)-97] == -1)	
	        		result[(int)str.charAt(i)-97] = i;
        }
        for(int i = 0 ; i < 26 ; i++) {
        		System.out.print(result[i]);
        		if(i != 25)
        			System.out.print(" ");
        }
	}
}
