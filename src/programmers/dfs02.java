package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class dfs02 {
	public static void main(String args[]) {
		int n = 3;  
		int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		//[[1, 1, 0], [1, 1, 1], [0, 1, 1]]
		solution(n, computers);
	}
	
	public static int solution(int n, int[][] computers) {
		ArrayList<HashMap<Integer, Integer>> list = new ArrayList<HashMap<Integer, Integer>>();
		
		for(int i=0; i<computers.length; i++) {
			for(int j=0; j<computers[i].length; j++) {
				if(computers[i][j] != 1) {
					continue;
				}
				
				boolean putted = false;
						
				for(HashMap<Integer, Integer> map : list) {
					if(map.containsKey(i)) {
						map.put(j, j);
						putted = true;
						break;
					} else if(map.containsKey(j)) {
						map.put(i, i);
						putted = true;
						break;
					}
				}
				
				if(putted) {
					continue;
				}
				
				HashMap<Integer, Integer> newMap = new HashMap<Integer, Integer>();
				newMap.put(i, i);
				
				list.add(newMap);
			}
		}
		
		int answer = list.size();
        return answer;
    }
}
