package backjoon;

import java.io.*;

public class b15552 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
					
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			
			String input[] = br.readLine().split(" ");
			
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
	        
			bw.write((a+b) + "\n");
		}
		bw.flush();
	}
}