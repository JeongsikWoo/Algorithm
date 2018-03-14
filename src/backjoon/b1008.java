package backjoon;

import java.util.Scanner;

public class b1008 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int sugar = n;
		int three, five, result;
		
		five = sugar / 5;
		
		while(true) {
			sugar = n;
			
			sugar -= five * 5;
			
			if(sugar % 3 == 0) {
				three = sugar / 3;
				result = five + three;
				break;
			}
			else {
				five--;
				if(five < 0) {
					result = -1;
					break;
				}
			}
		}
		
		System.out.println(result);
	}
}