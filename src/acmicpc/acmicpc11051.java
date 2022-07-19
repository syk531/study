package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class acmicpc11051 {
	public static void main(String[] agrs) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int[] intArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			int n = intArr[0];
			int k = intArr[1];
			
			int[][] dp = new int[n+1][n+1];
			
			for(int i=1; i<=n; i++) {
				for(int j=0; j<=n; j++) {
					if(i == j || j == 0) {
						dp[i][j] = 1;
					} else {
						dp[i][j] = (dp[i-1][j-1] + dp[i-1][j]) % 10007; 
					}
				}
			}
			
			writer.append(String.valueOf(dp[n][k])); 
			
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
	
}
