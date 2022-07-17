package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class acmicpc2981 {
	public static void main(String[] agrs) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(reader.readLine());
			int[] intArr = new int[n];
			
			for(int i=0; i<n; i++) {
				int num = Integer.parseInt(reader.readLine());
				intArr[i] = num;
			}
			
			int[] intArr2 = new int[n-1]; //차이 배열
			for(int i=0; i<n-1; i++) {
				intArr2[i] = Math.abs(intArr[i] - intArr[i+1]); 
			}
			
			int gcdVal = 0;
			
			if(n==2) {
				gcdVal = intArr2[0];
			} else {
				for(int i=0; i<n-2; i++) {
					if(gcdVal > 0) {
						gcdVal = getGCD(gcdVal, intArr2[i+1]);
					} else {
						gcdVal = getGCD(intArr2[i], intArr2[i+1]);
					}
				}
			}
			
			for(int i=2; i<=gcdVal; i++) {
				if(gcdVal % i == 0) {
					writer.append(String.valueOf(i) + " ");
				}
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
