package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class hash03 {

	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		//String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		int answer = solution(clothes);
		System.out.println(answer);
	}
	
	public static int solution(String[][] clothes) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<String> clothesDiviList = new ArrayList<String>(); 
		int answer = 0; 	
		
		for(int i=0; i<clothes.length; i++) {
			String clothesDivi = clothes[i][1];
			if(map.containsKey(clothesDivi)) {
				map.put(clothesDivi, map.get(clothesDivi)+1);
			} else {
				map.put(clothesDivi, 1);
				clothesDiviList.add(clothesDivi);
			}
		}
		
		if(clothesDiviList.size() > 0) {
			answer = 1;
			
			for(int i=0; i<clothesDiviList.size(); i++) {
				answer = answer * (map.get(clothesDiviList.get(i)) + 1); 
			}
			
			answer = answer - 1;
		}
		
        return answer;
    }

}
