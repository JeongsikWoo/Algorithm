package backjoon;

import java.util.Scanner;

public class b1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[26];
		
		int max = Integer.MIN_VALUE;
		char result = ' ';
		String input = sc.nextLine();
		
		for(int i = 0 ; i < input.length() ; i++) {
			if((int)input.charAt(i) <= 90) {
				arr[(int)input.charAt(i) - 65]++;
			}
			else {
				arr[(int)input.charAt(i) - 97]++;
			}
		}
		
		for(int i = 0 ; i < 26 ; i++) {
			if(arr[i] > max) {
				max = arr[i];
				result = (char)(i+65);
			}
			else if(arr[i] == max) {
				result = '?';
			}
		}
		
		System.out.println(result);
	}
}
