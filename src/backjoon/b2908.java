package backjoon;

import java.util.Scanner;

public class b2908 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int _a[] = new int[3];
		int b = s.nextInt();
		int _b[] = new int[3];
		
		for(int i = 0; i < 3 ; i++) {
			_a[i] = a%10;
			_b[i] = b%10;
			a /= 10; 
			b /= 10;
		}
		
		a = _a[0]*100 + _a[1]*10 + _a[2];
		b = _b[0]*100 + _b[1]*10 + _b[2];
		
		if(a > b)
			System.out.println(a);
		else
			System.out.println(b);
		
		
	}
}
