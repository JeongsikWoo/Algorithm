package backjoon;

import java.util.Scanner;

public class b11728 {
	public static void main(String[] args) {
		int A[] = new int[1000001];
		int B[] = new int[1000001];
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		    
		for(int i = 0 ; i < n ; i++)
			A[i] = s.nextInt();
		for(int i = 0 ; i < m ; i++)
		    B[i] = s.nextInt();
		int a = 0, b=0;
		    
		while (a < n && b < m) {
			if(A[a] > B[b])
				System.out.print(B[b++]);
			else
				System.out.print(A[a++]);
		    }
		for(int i = b ; i < m ; i++)
			System.out.print(B[i]);
		    for(int i = a ; i < n ; i++)
		    System.out.print(A[i]);
	}
}
