package backjoon;

public class kakao01 {
	
	static String dartResult = "1S2D*3T";
	
	public static void Main(String[] args) {
		solution(dartResult);
	}
	
	public static int solution(String dartResult) {
	      int answer = 0;
	      char dart[] = dartResult.toCharArray();
	      
	      
	      
	      for(int i = 0 ; i < dart.length ; i++) {
	    	  System.out.println(dart[i]);
	    	  
	    	  
	      }
	      
	      return answer;
	  }
}
