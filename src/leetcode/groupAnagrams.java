package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        String key = "";
        String value = "";
        
        for(int i=0; i<strs.length; i++) {
        	value = strs[i];
        	char[] cArr = value.toCharArray();
        	Arrays.sort(cArr);
        	key = String.valueOf(cArr);
        			
        	if(map.containsKey(key)) {
                map.get(key).add(value);
            } else {
            	List<String> list = new ArrayList<String>(); 
            	list.add(value);
            	map.put(key, list);
            }
        }
        
        List<List<String>> resultList = new ArrayList<List<String>>(); 
        List<String> list = new ArrayList<String>();
        for(String mapKey : map.keySet()) {
        	list = map.get(mapKey);
        	resultList.add(list);
        }
        
        return resultList;
    }
}
