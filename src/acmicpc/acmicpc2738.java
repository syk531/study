package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class acmicpc2738 {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

			String[] strArr = reader.readLine().split(" ");
			int n = Integer.parseInt(strArr[0]);
			int m = Integer.parseInt(strArr[1]);
			
			//procession : 행렬
			int[][] processionA = new int[n][m];
			int[][] processionB = new int[n][m];

			for(int i=0; i<n; i++) {
				processionA[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); 
			}
			
			for(int i=0; i<n; i++) {
				processionB[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); 
			}
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					writer.append(String.valueOf(processionA[i][j] + processionB[i][j]) + " ");
				}
				writer.append("\n");
			}
			
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
}
