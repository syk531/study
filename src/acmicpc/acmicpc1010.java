package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class acmicpc1010 {
	public static void main(String[] agrs) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int num = Integer.parseInt(reader.readLine()); 
			
			int[][] dp = new int[30][30];
			
			for(int i=1; i<=29; i++) { 
				for(int j=0; j<=29; j++) {
					if(i == j || j == 0) {
						dp[i][j] = 1;
					} else {
						dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
					}
				}
			}
			
			for(int i=0; i<num; i++) {
				int intArr[] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				int n = intArr[0];
				int m = intArr[1];
				writer.append(String.valueOf(dp[m][n]) + "\n");
			}
			
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
	
}
