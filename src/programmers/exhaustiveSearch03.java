package programmers;

public class exhaustiveSearch03 {
	public static void main(String args[]) {
		int brown = 10; 
		int yellow = 2;
		solution(brown, yellow);
	}
		
	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		boolean finished = false;
		
		for(int i=1; i<=yellow; i++) { //i
			for(int j=1; j<=yellow; j++) {//j
				if(yellow == i*j && (brown+yellow) == (i+2)*(j+2)) {
					if(i > j) {
						answer[0] = i+2;
						answer[1] = j+2;
					} else {
						answer[0] = j+2;
						answer[1] = i+2;
					}
				
					finished = true;
					break;
				}
			}
			
			if(finished) {
				break;
			}
		}
        
        return answer;
    }
}
