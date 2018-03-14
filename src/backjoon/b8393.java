package backjoon;

import java.util.Scanner;

public class b8393 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
					
		int n = s.nextInt();
		int result = 0 ;
        
        for(int i = 1 ; i <= n ; i++)
            result += i;
        
		System.out.println(result);
	}
}