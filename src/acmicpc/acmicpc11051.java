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
			
			int remain = 1;
			if(k == 0) {
				remain = 0;
			}
			
			for(int i=1; i<=k; i++) {
				remain = remain * (n-i+1) / i % 10007;  
			}
			
			writer.append(String.valueOf(remain)); 
			
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
	
}
