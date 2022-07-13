package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class acmicpc1934 {
	public static void main(String[] agrs) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(reader.readLine());
			for(int i=0; i<n; i++) {
				String[] strArr = reader.readLine().split(" ");
				int a = Integer.parseInt(strArr[0]);
				int b = Integer.parseInt(strArr[1]);
				
				writer.append(String.valueOf(a*b/getGCD(a, b)));
				writer.append("\n");
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
