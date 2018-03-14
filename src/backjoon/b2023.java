package backjoon;

import java.util.Scanner;

public class b2023 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int prime[] = new int[10];
		int new_prime[];
		
		boolean is_prime;
		
		prime[0] = 2;
		int index = 1;
		
		// find prime number
		for(int i = 3 ; i < 10 ; i++) {
			
			is_prime = true;
			
			for(int j = 0 ; j < index ; j++) {
				if(i % prime[j] == 0)
					is_prime = false;
			}
			
			if(is_prime) {
				System.out.println(i + " is prime number");
				prime[index++] = i;
			}
		}
		
		for(int i = 0 ; i < index ; i++) {
			System.out.println(prime[i]);
		}
	}
}
