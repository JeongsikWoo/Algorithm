package backjoon;

import java.util.Scanner;

public class b10817 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
        int number[] = new int[3];
        
        for(int i = 0 ; i < 3 ; i++){
		    number[i] = s.nextInt();
        }
        
        if(number[0] >= number[1]){
            if(number[0] >= number[2]){
                // 0 is top
                if(number[1] >= number[2]){
                    // 1 is second
                    System.out.println(number[1]);
                }
                else {
                    // 2 is second
                    System.out.println(number[2]);
                }
            }
            else {
                // 2 is top
                if(number[0] >= number[1]){
                    // 0 is second
                    System.out.println(number[0]);
                }
                else {
                    // 1 is second
                    System.out.println(number[1]);
                }
            }
        }
        else if(number[0] <= number[1]){
            if(number[1] >= number[2]){
                // 1 is top
                if(number[0] >= number[2]){
                    System.out.println(number[0]);
                }
                else{
                    System.out.println(number[2]);
                }
            }
            else {
                // 2 is top
                if(number[0] >= number[1]){
                    System.out.println(number[0]);
                }
                else{
                    System.out.println(number[1]);
                }
            }
        }
	}
}