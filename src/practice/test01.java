package practice;

public class test01 {
	public static void main(String args[]) {
		int[] A = {4,1,1,1};
		int S = 3;
		solution(A, S);
	}
	
	
	public static int solution(int []A, int S) {
        int answer = 0;
        int sum = 0;
        
		for(int i=0; i<A.length; i++) {
			sum = 0; 
			
			for(int j=i; j<A.length; j++) {
				sum = sum + A[j];
				
				if(sum == S) {
					answer++;
				}
				
				if(sum >= S) {
					break;
				}
			}
		}

        return answer;
    }
}
