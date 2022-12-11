package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class acmicpc2563 {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			boolean[][] square = new boolean[101][101];
			int n = Integer.parseInt(reader.readLine());
			
			for(int i=0; i<n; i++) {
				String[] strArr = reader.readLine().split(" ");
				int a = Integer.parseInt(strArr[0]);
				int b = Integer.parseInt(strArr[1]);
				
				for(int j=a+1; j<=a+10; j++) {
					for(int k=b+1; k<=b+10; k++) {
						square[j][k] = true;
					}
				}
			}
			
			int cnt = 0;
			for(int i=0; i<=100; i++) {
				for(int j=0; j<=100; j++) {
					if(square[i][j]) {
						cnt++;
					}
				}
			}
			
			writer.append(String.valueOf(cnt));
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
}
