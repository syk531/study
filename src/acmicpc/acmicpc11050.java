package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class acmicpc11050 {
	public static void main(String[] agrs) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int[] intArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			int n = intArr[0];
			int k = intArr[1];
			
			int a = 1;
			int b = 1;

			for(int i=1; i<=k; i++) {
				a = a*(n-i+1);
				b = b*i;
			}
			
			writer.append(String.valueOf(a/b)); 
			
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
