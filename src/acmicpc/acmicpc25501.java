package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class acmicpc25501 {
	static int cnt = 0;
	
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int t = Integer.parseInt(reader.readLine());
			for(int i=0; i<t; i++) {
				String s = reader.readLine();
				writer.append(String.valueOf(recursion(s, 0, s.length()-1)));
				writer.append(" ");
				writer.append(String.valueOf(cnt));
				writer.append("\n");
				cnt = 0;
			}
			
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
	
	public static int recursion(String s, int l, int r){
		cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}
