package leetcode;

public class longestPalindromeSubstring {

	public static void main(String[] args) {
		String s = "a";
		longestPalindrome(s);
	}

	public static String longestPalindrome(String s) {
		String subStr = "";
		StringBuffer stringBuffer = new StringBuffer();
		String answer = "";
		int answerLength = 0;
		
        for(int i=0; i<s.length(); i++) {
        	for(int j=i+1+answerLength; j<=s.length(); j++) {
        		subStr = s.substring(i, j);
        		stringBuffer.setLength(0);
        		stringBuffer.append(subStr);
        		
        		if(subStr.equals(stringBuffer.reverse().toString())) {
        			answer = subStr;
        			answerLength = answer.length();
        		}
        	}
        }
		
        return answer;
    }
}
