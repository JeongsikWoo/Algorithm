package backjoon;

public class b4673 {
	
	static boolean arr[];
	
	public static void main(String[] args) {
		arr = new boolean[10001];
		
		arr[0] = true;
		arr[1] = false;
		
		for(int i = 1 ; i <= 10000 ; i++) {
			if(!arr[i])
				find_constructor(i);
		}
		
		for(int i = 1 ; i <= 10000 ; i++) {
			if(arr[i] == false)
				System.out.println(i);
		}
	}
	
	public static void find_constructor(int n) {
		int num = n;
		int new_num = num;
		
		if(num > 10000)
			return;
		
		while(true) {
			new_num += num % 10;
			num /= 10;
			
			if(num == 0)
				break;
		}
		if(new_num <= 10000)
			arr[new_num] = true;
		find_constructor(new_num);
	}
}
