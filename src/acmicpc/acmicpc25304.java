package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class acmicpc25304 {
	public static void main(String[] agrs) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int x = Integer.parseInt(reader.readLine());
			int n = Integer.parseInt(reader.readLine());
			
			int sum = 0;
			for(int i=0; i<n; i++) {
				int[] intArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				sum = sum + intArr[0] * intArr[1];
			}
			
			writer.append(sum == x ? "Yes" : "No"); 
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
}
