package backjoon;

import java.util.Scanner;

public class b1463 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n+1];
		
		arr[1] = 0;
		for(int i = 2 ; i <= n ; i++) {
			arr[i] = 1+arr[i-1];
			if(i%2 == 0 && arr[i] > 1+arr[i/2])
				arr[i] = 1 + arr[i/2];
			if(i%3 == 0 && arr[i] > 1+arr[i/3])
				arr[i] = 1+ arr[i/3];
		}
		
		System.out.println(arr[n]);
	}
}
