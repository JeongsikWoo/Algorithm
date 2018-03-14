package backjoon;

import java.util.Scanner;

public class b1065 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 1 ~ 1000
		int n = s.nextInt();
		int arr[] = new int[3];
		int count = 0;
		
		if(n == 1000) n = 999;
		if(n >= 100) {
			count = 99;
			
			for(int i = 100 ; i <= n ; i++) {
				
				int num = i;
				
				for(int j = 0 ; j < 3 ; j++) {
					arr[j] = num % 10;
					num = num / 10;
					
					if(num == 0)
						break;
				}
				
				if(arr[0] - arr[1] == arr[1] - arr[2])
					count++;
			}
		}
		else {
			count = n;
		}
		
		System.out.println(count);
	}
}
