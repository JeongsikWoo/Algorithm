package backjoon;

import java.util.Scanner;

public class b1026 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		int A[] = new int[N];
		int B[] = new int[N];
		int _B[] = new int[N];
		int tmp = 0;
		int result = 0;
		
		for(int i = 0 ; i < N ; i++) {
			A[i] = s.nextInt();
		}
		for(int i = 0 ; i < N ; i++) {
			B[i] = s.nextInt();
		}
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = i+1 ; j < N ; j++) {
				if(A[i] > A[j]) {
					tmp = A[j];
					A[j] = A[i];
					A[i] = tmp;
				}
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = i+1 ; j < N ; j++) {
				if(B[i] < B[j]) {
					tmp = B[j];
					B[j] = B[i];
					B[i] = tmp;
				}
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			result += A[i]*B[i];
		}
		System.out.println(result);
	}
}
