package practice;

import java.util.Arrays;
import java.util.HashMap;

public class test03 {
	public static void main(String args[]) {
		int[] arr = {1, 5, 8};
		int n = 10;
		solution(arr, n);
	}
	

	public static boolean solution(int[] arr, int n) {
		Arrays.sort(arr);
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= n) {
				break;
			} else {
				map.put(arr[i], arr[i]);
			}
		}
		
		boolean answer = false;
        
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= n) {
				break;
			}
			
			if(n != 2*arr[i] && map.containsKey(n-arr[i])) {
				answer = true;
				break;
			}
		}
		
        return answer;
    }
	
}
