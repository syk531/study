package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exhaustiveSearch02 {
	public static void main(String args[]) {
		String numbers = "17";
		solution(numbers);
	}
	
	public static int solution(String numbers) {
		/*
		  	numbers는 길이 1 이상 7 이하인 문자열입니다.
			numbers는 0~9까지 숫자만으로 이루어져 있습니다.
			013은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
		 */
		
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>(); //자리수, 숫자
		List<Integer> list = new ArrayList<Integer>();
		int digit = 1; //자리수
		int number = 0;
		
		while(digit == numbers.length()) {
			for(int i=0; i<numbers.length(); i++) {
				number = Integer.parseInt(numbers.substring(i, i+1));
				
				if(map.containsKey(digit)) {
					list = map.get(digit);
				}
				
				if(digit == 1) {
					list.add(number);
					map.put(digit, list);
				} else {
					list = map.get(digit-1);
				}
			}
		}
		
        int answer = 0;
        return answer;
    }
}
