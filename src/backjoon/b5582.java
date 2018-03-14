package backjoon;

import java.util.Scanner;

public class b5582 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int dp[][] = new int[4005][4005];
		String str1;
		String str2;
		
		str1 = s.nextLine();
		str2 = s.nextLine();
	    int str1_ln = str1.length();
	    int str2_ln = str2.length();
	    int ans = 0;
	    for(int i = 0 ; i < str1_ln ; ++i){
	        for(int j = 0 ; j < str2_ln ; ++j){
	            if(str1.charAt(i) == str2.charAt(j)){
	                dp[i+1][j+1] = dp[i][j]+1;
	                System.out.println("dp : " + dp[i+1][j+1]);
	                ans = Math.max(ans, dp[i+1][j+1]);
	            }
	        }
	    }
	    System.out.println(ans);
	}
}