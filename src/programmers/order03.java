package programmers;

import java.util.Arrays;
import java.util.Collections;

public class order03 {
	public static void main(String args[]) {
		int[] citations = {0, 5, 6, 7, 8, 1};
		solution(citations);
	}
	
	public static int solution(int[] citations) {
		Integer[] integerArr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
		Arrays.sort(integerArr, Collections.reverseOrder());
		int answer = 0;
        
		for(int i=0; i<integerArr.length; i++) {
			if(integerArr[i] < i+1) {
				answer = i;
				break;
			}
			
			if(i == integerArr.length-1) {
				answer = i+1;
			}
		}
		
        return answer;
    }
}
