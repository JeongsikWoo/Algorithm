package backjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b5014 {
	static int f, s, g, u, d;
	static int[] dx = {-1, 1};
	static boolean[] visited = new boolean[1000001]; // 1 <= F <= 1000000

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		f = sc.nextInt(); // 건물은 총 f층
		s = sc.nextInt(); // 츨발
		g = sc.nextInt(); // 도착
		u = sc.nextInt(); // 위로 u층만큼 이동
		d = sc.nextInt(); // 아래로 d층만큼 이동
		
		dx[0] = dx[0]*d;
		dx[1] = dx[1]*u;
		
		System.out.println(bfs(s));
	}
	
	public static String bfs(int s) {
		Queue<Node> q = new LinkedList<>();
		
		q.add(new Node(0, s));
		visited[s] = true;
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			int cnt = node.count;
			int floor = node.floor;
			
			if(floor == g)
				return String.valueOf(cnt);
			
			for(int i = 0 ; i < 2 ; i++) {
				int next = dx[i] + floor;
				
				if(1 <= next && next <= f) {
					if(!visited[next]) {
						q.add(new Node(cnt + 1, next));
						visited[next] = true;
					}
				}
			}
		}
		return "use the stairs";
	}
	
	public static class Node{
		int count;
		int floor;
		
		Node(int count, int floor){
			this.count = count;
			this.floor = floor;
		}
	}
}