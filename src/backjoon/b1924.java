package backjoon;

import java.util.Scanner;

public class b1924 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
					
		int x = s.nextInt();
		int y = s.nextInt();
		
		int day = 0;
		
		String week;
		
		for(int i = 1; i < x ; i++) {
			if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
				day += 31;
			else if(i==2)
				day += 28;
			else
				day += 30;
		}
		day += y;
		
		day = day % 7;
		
		if(day == 1)
			week = "MON";
		else if(day == 2)
			week = "TUE";
		else if(day == 3)
			week = "WED";
		else if(day == 4)
			week = "THU";
		else if(day == 5)
			week = "FRI";
		else if(day == 6)
			week = "SAT";
		else
			week = "SUN";
		
		System.out.println(week);
	}
}
