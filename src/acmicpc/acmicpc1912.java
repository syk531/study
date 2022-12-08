package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class acmicpc1912 {
	public static void main(String[] agrs) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(reader.readLine());
			int intArr[] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int max = Integer.MIN_VALUE;
			int dp[] = new int[n+1];
			dp[0] = Integer.MIN_VALUE;
			
			for(int i=1; i<=n; i++) {
				if(dp[i-1] + intArr[i-1] > 0) {
					dp[i] = dp[i-1] + intArr[i-1];
				} else {
					dp[i] = intArr[i-1];
				}
				
				if(max < dp[i]) {
					max = dp[i];
				}
			}
			
			writer.append(String.valueOf(max));
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
	
}
