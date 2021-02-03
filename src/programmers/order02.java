package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class order02 {
	public static void main(String args[]) {
		int[] numbers = {0, 0};
		solution(numbers);
	}
	
	public static String solution(int[] numbers) {
		String[] numberStrArr = new String[numbers.length]; 
		for(int i=0; i<numbers.length; i++) {
			numberStrArr[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(numberStrArr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				String s12 = s1 + s2;
				String s21 = s2 + s1;
				int i12 = Integer.valueOf(s12);
				int i21 = Integer.valueOf(s21);
				
				if(i12 > i21) {
					return -1;
				} else if (i12 == i21) {
					return 0;
				} else {
					return 1;
				}
			}
		});
		
		String answer = "";
		for(int i=0; i<numberStrArr.length; i++) {
			if(i==0 && "0".equals(numberStrArr[i])) {
				answer = numberStrArr[i];
				break;
			}
			
			answer = answer + numberStrArr[i];  
		}
		
		return answer;
    }
}
