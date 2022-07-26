package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class acmicpc1676 {
	public static void main(String[] agrs) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(reader.readLine());
			int cnt = 0;
			
			for(int i=1; i<=n; i++) {
				int a = i; 
				
				while(true) {
					int remain = a%5;
					if(remain > 0) {
						break;
					} else {
						a = a/5;
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
