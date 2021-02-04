package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exhaustiveSearch02 {
	public static void main(String args[]) {
		String numbers = "011";
		solution(numbers);
	}
	
	public static int solution(String numbers) {
		Map<Integer, List<Number>> map = new HashMap<Integer, List<Number>>(); //자리수, 넘버클래스리스트
		int digit = 1; //자리수
		String substrNumber = "";
		String concatNumber = "";
		
		//조합가능 숫자 만들기
		while(digit <= numbers.length()) {
			for(int i=0; i<numbers.length(); i++) {
				substrNumber = numbers.substring(i, i+1);

				List<Number> numberList = new ArrayList<Number>();
				List<Integer> indexList = new ArrayList<Integer>();
				
				if(digit == 1) {
					indexList.add(i);
					Number number = new Number(indexList, substrNumber);
					
					if(!map.containsKey(digit)) {
						numberList.add(number);
						map.put(digit, numberList);
					} else {
						numberList = map.get(digit);
						numberList.add(number);
					}
				} else {
					List<Number> beforeNumberList = map.get(digit-1); //자리수 하나 작은 넘버클래스리스트
					
					for(Number numberObj : beforeNumberList) {
						indexList = numberObj.indexList;
						concatNumber = numberObj.number; 
						
						if(!indexList.contains(i)) { //연결안한 인덱스일 경우에 연결해주기
							indexList.add(i);
							
							Number number = new Number(indexList, concatNumber + substrNumber);
							
							if(!map.containsKey(digit)) {
								numberList.add(number);
								map.put(digit, numberList);
							} else {
								numberList = map.get(digit);
								numberList.add(number);
							}
						}
					}
				}
			}
			
			digit++;
		}
		
		//조합가능 숫자 중에서 소수 구하기
		int answer = 0;
		int num = 0;
		List<Number> numberList = new ArrayList<Number>();
		for(Integer key : map.keySet()) {
			numberList = map.get(key);
			
			for(Number number : numberList) {
				//소수인지 체크
				boolean isPrime = false;
				num = Integer.parseInt(number.number); 
				if(num > 0) {
					for(int i=2; i<num/2; i++) {
						if(num % i == 0) {
							isPrime = false;
							break;
						} else {
							isPrime = true;
						}
					}
				}
				
				if(isPrime) {
					answer++;
				}
			}
		}
        
        return answer;
    }
}

class Number {
	List<Integer> indexList = new ArrayList<Integer>();
	String number = "";
	
	Number(List<Integer> indexList, String number) {
		this.indexList = indexList;
		this.number = number;
	}
}