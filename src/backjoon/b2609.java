package backjoon;
import java.util.Scanner;

public class b2609 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, gcm = 0;
		
		a = s.nextInt();
		b = s.nextInt();
		
		int n = (a<b ?  a : b);

		for(int i=1; i <= n; i++) {
			if(a%i==0 && b%i==0) {
				gcm = i;
			}
		}
		// GCM
		System.out.println(gcm);
		// LCM
		System.out.print(a*b/gcm);
	}
}
