package programmers;

import java.util.Arrays;

public class hash02 {

	public static void main(String[] args) {
		//String[] phone_book = {"119", "97674223", "1195524421"};
		String[] phone_book = {"119", "97674223"};
		boolean solution = solution(phone_book);
		System.out.println(solution);
	}
	
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		int i=0;
		
		Arrays.sort(phone_book);
		
		while(i<phone_book.length-1) {
			if(phone_book[i+1].indexOf(phone_book[i]) > -1) {
				answer = false;
				break;
			}
			
			i++;
		}
		
        return answer;
    }

}
