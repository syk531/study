package leetcode;

public class longestPalindromeSubstring {

	public static void main(String[] args) {
		String s = "a";
		longestPalindrome(s);
	}

	public static String longestPalindrome(String s) {
		int start = 0;
		int end = 0;
		int length = s.length();
		
		String longestPalStr = "";
		String palStr = "";
		String palStr2 = "";
		String startStr = "";
		String endStr = "";
		
		for(int i=0; i<s.length(); i++) {
			//중심값 1개
			start = i-1;
			end = i+1;
			palStr = String.valueOf(s.charAt(i));
			
			while(start >= 0 && end < s.length()) {
				startStr = String.valueOf(s.charAt(start));
				endStr = String.valueOf(s.charAt(end));
				
				if(startStr.equals(endStr)) {
					palStr = startStr + palStr +  endStr;
				} else {
					break;
				}
				
				start--;
				end++;
			}
			
			if(longestPalStr.length() < palStr.length()) {
				longestPalStr = palStr;
			}
			
			//중심값 2개
			if(i+1 < s.length()) {
				palStr = String.valueOf(s.charAt(i));
				palStr2 = String.valueOf(s.charAt(i+1));
						
				if(palStr.equals(palStr2)) {
					start = i-1;
					end = i+2;
					palStr += palStr2;
					
					while(start >= 0 && end < s.length()) {
						startStr = String.valueOf(s.charAt(start));
						endStr = String.valueOf(s.charAt(end));
						
						if(startStr.equals(endStr)) {
							palStr = startStr + palStr +  endStr;
						} else {
							break;
						}
						
						start--;
						end++;
					}
				}
			}
			
			if(longestPalStr.length() < palStr.length()) {
				longestPalStr = palStr;
			}
		}
		
		return longestPalStr;
    }
}
