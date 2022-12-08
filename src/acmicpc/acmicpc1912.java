package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.Stream;

public class acmicpc1912 {
	public static void main(String[] agrs) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

			int n = Integer.parseInt(reader.readLine());
			int numArr[] = Stream.of(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			int dp[] = new int[n];
			dp[0] = numArr[0];
			int max = dp[0];
			
			for(int i=1; i<n; i++) {
				if(dp[i-1] > 0 && dp[i-1] + numArr[i] > 0) {
					dp[i] = dp[i-1] + numArr[i];
				} else {
					dp[i] = numArr[i];
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
