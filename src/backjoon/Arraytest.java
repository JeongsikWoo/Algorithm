package backjoon;
import java.util.ArrayList;

public class Arraytest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		for(int i = 1 ; i <= 10; i++) {
			list.add(i);	
			System.out.println(list.get(i-1));
		}
	}
}
