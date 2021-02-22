package leetcode;

import java.util.HashMap;

public class lengthOfLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lengthOfLongestSubstring("abcabcbb");
	}
	
	public static int lengthOfLongestSubstring(String s) {
		HashMap<String, String> map = new HashMap<String, String>();
		int maxLength = 0;
		int length = 0;
        
        for(int i=0; i<s.length(); i++) {
        	length = 0;
        	map.clear();
        	
            for(int j=i; j<s.length(); j++) {
                String subStr = String.valueOf(s.charAt(j));
            	if(map.containsKey(subStr)) {
                	break;
                } else {
                	map.put(subStr, subStr);
                	length++;
                }
            }
            
            if(maxLength < length) {
            	maxLength = length;
            }
        }
        
        return maxLength;
    }

}
