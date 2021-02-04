package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class dfs01 {
	public static void main(String args[]) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		solution(numbers, target);
	}
	
	public static int solution(int[] numbers, int target) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int number = 0;
		
		for(int i=0; i<numbers.length; i++) {
			ArrayList<Integer> list2 = new ArrayList<Integer>();
				
			number = numbers[i];
			if(map.containsKey(i-1)) {
				list = map.get(i-1);
				for(int j : list) {
					list2.add(j+number);
					list2.add(j-number);
					map.put(i, list2);
				}
			} else {
				list.add(target+number);
				list.add(target-number);
				map.put(i, list);
			}
		}	

        int answer = 0;
		for(int i : map.get(numbers.length-1)) {
			if(i == 0) {
				answer++;	
			}
		}
		
        return answer;
    }
}
