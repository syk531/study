package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class acmicpc3036 {
	public static void main(String[] agrs) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(reader.readLine());
			int[] intArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			int a = intArr[0];
			for(int i=0; i<n-1; i++) {
				int b = intArr[i+1];
				
				int gcd = getGCD(a,b);
				writer.append(String.valueOf(a/gcd) + "/" + String.valueOf(b/gcd) + "\n");
			}
			
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
	
	public static int getGCD(int a, int b) {
		int big = 0;
		int small = 0;
		int remain = -1;
		
		if(a>b) {
			big = a;
			small = b;
		} else {
			big = b;
			small = a;
		}
		
		while(true) {
			remain = big%small;
			if(remain == 0) {
				return small;
			} else if(remain == 1) {
				return 1;
			} else {
				big = small;
				small = remain;
			}
		}
	} 
	
	
}
