package backjoon;
import java.util.Scanner;
public class b1934 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T-- > 0) {
			int A = s.nextInt();
			int B = s.nextInt();
			int GCM=1, LCM=1;
		
			for(int i = 1; i < (A>B?B:A)/2 ; i++) {
				if(A%i == 0 && B%i == 0)
					GCM = i;
			}
			LCM = A*B/GCM;
			System.out.println(LCM);
		}
	}
}
