package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class algorithm {
	public static void main(String[] args) {
		//자바 hashmap key 값으로 정렬
		Map<Integer, String> testMap = new HashMap<Integer, String>();
		testMap.put( 1, "apple");
		testMap.put( 4, "pineapple");
		testMap.put( 2, "orange");
		Object[] mapkey = testMap.keySet().toArray();
		Arrays.sort(mapkey);
		for (Integer nKey : testMap.keySet()) {
			System.out.println(testMap.get(nKey));
		}
		
		//자바 hashmap value 값으로 정렬
		Map<String, Integer> testMap2 = new HashMap<String, Integer>();
		testMap2.put("apple", 1);
		testMap2.put("pineapple", 4);
		testMap2.put("orange", 2);
		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(testMap2.entrySet());
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				// 오름 차순 정렬
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});
		for(Entry<String, Integer> entry : list_entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
