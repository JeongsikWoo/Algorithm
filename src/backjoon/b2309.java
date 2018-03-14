package backjoon;

import java.util.Scanner;

public class b2309 {
	
	static int height[] = new int [9];
	static boolean is_find = false;
	static int total = 0;
	static int a=0, b=0;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// Input the height of 9 dwarfes
		for(int i = 0 ; i < 9 ; i++) {
			height[i] = s.nextInt();
		}
		
		// Search for all case
		for(int i = 0 ; !is_find ; i++) {
			for(int j = i+1 ; j < 9 && !is_find ; j++) {
				is_find = search(i, j);
			}
		}
		
		int tmp = 0;
		
		// Sort Ascending
		for(int i = 0 ; i < 8 ; i++) {
			for(int j = i+1 ; j < 9 ; j++) {
				if(i!=a && i!=b && j!=a && j!=b && height[i] > height[j]) {
					tmp = height[i];
					height[i] = height[j];
					height[j] = tmp;
				}
			}
		}
		
		// Print
		for(int i = 0 ; i < 9 ; i++) {
			if(i != a && i != b) {
				System.out.println(height[i]);
			}
		}
	}
	
	public static boolean search(int i, int j) {
		
		a = i;
		b = j;
		
		for(int k = 0 ; k < 9 ; k++) {
			if(k != a && k != b) {
				total += height[k];
			}
		}
		
		if(total == 100) {
			return true;
		}
		else {
			total = 0;
			return false;
		}
		
	}
}
