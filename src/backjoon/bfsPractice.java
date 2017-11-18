package backjoon;
import java.util.*;

public class bfsPractice {
	
	static int a[][];
	static boolean visit[];
	static int e, v;
	
	static void bfs(int i) {
		Queue<Integer> q = new<Integer>LinkedList();
		
		q.offer(i);
		visit[i] = true;
		
		while(!q.isEmpty()) {
			int tmp = q.poll();
			System.out.print(tmp);
			
			for(int j = 1 ; j <= v ; j++) {
				if(a[tmp][j] == 1 && visit[j] == false) {
					q.offer(j);
					visit[j] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		v = s.nextInt();
		e = s.nextInt();
		
		a = new int[v+1][v+1];
		visit = new boolean[v+1];
		
		for(int i = 0 ; i < e ; i++) {
			int m, n;
			
			m = s.nextInt();
			n = s.nextInt();
			
			a[m][n] = a[n][m] = 1;
		}
		
		bfs(1);
	}
}
