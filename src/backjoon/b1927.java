package backjoon;

import java.util.*;

public class b1927 {
	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		while(num-- >0) {
			int n = s.nextInt();
			
			if(n == 0) {
				if(q.size() ==0)
					System.out.println(0);
				else
					System.out.println(q.poll());
			}
			else {
				q.add(new Integer(n));
			}
				
		}
		
	}
}
