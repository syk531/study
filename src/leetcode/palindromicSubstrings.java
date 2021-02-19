package leetcode;

public class palindromicSubstrings {

	public static void main(String[] args) {
		String s = "aaa";
		countSubstrings(s);
	}

	public static int countSubstrings(String s) {
		String subStr = "";
		StringBuffer stringBuffer = new StringBuffer();  
		int answer = 0;
		
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<=s.length(); j++) {
				subStr = s.substring(i, j);
				stringBuffer.setLength(0);
				stringBuffer.append(subStr);
				
				if(subStr.equals(stringBuffer.reverse().toString())) {
					answer++;
				}
			}
		}
		
		return answer;
    }
}
