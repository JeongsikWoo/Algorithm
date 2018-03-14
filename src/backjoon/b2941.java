package backjoon;

import java.util.Scanner;

public class b2941 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		int cnt = 0;
		
		while(str.length() != 0) {
			if(str.length() >= 3) {
				String sub_ = str.substring(0, 3);
				
				if(sub_.equals("dz=")) {
					str = str.substring(3);
					cnt++;
				}
				else if(str.length() >= 2) {
					String sub = str.substring(0, 2);
					
					if(sub.equals("c=")) {
						str = str.substring(2);
						cnt++;
					}
					else if(sub.equals("c-")) {
						str = str.substring(2);
						System.out.println(str);
						cnt++;
					}
					else if(sub.equals("d-")) {
						str = str.substring(2);
						cnt++;
					}
					else if(sub.equals("lj")) {
						str = str.substring(2);
						cnt++;
					}
					else if(sub.equals("nj")) {
						str = str.substring(2);
						System.out.println(str);
						cnt++;
					}
					else if(sub.equals("s=")) {
						str = str.substring(2);
						cnt++;
					}
					else if(sub.equals("z=")) {
						str = str.substring(2);
						cnt++;
					}
					else {
						str = str.substring(1);
						cnt++;
					}
				}
			}
			
			else if(str.length() >= 2) {
				String sub = str.substring(0, 2);
				
				if(sub.equals("c=")) {
					str = str.substring(2);
					cnt++;
				}
				else if(sub.equals("c-")) {
					str = str.substring(2);
					cnt++;
				}
				else if(sub.equals("d-")) {
					str = str.substring(2);
					cnt++;
				}
				else if(sub.equals("lj")) {
					str = str.substring(2);
					cnt++;
				}
				else if(sub.equals("nj")) {
					str = str.substring(2);
					cnt++;
				}
				else if(sub.equals("s=")) {
					str = str.substring(2);
					cnt++;
				}
				else if(sub.equals("z=")) {
					str = str.substring(2);
					cnt++;
				}
				else {
					str = str.substring(1);
					cnt++;
				}
			}
			else {
				str = str.substring(1);
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
