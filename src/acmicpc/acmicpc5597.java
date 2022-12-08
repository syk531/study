package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class acmicpc5597 {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			boolean num[] = new boolean[31];
			
			for(int i=1; i<=28; i++) {
				int index = Integer.parseInt(reader.readLine());
				num[index] = true;
			}
			
			for(int i=1; i<=30; i++) {
				if(!num[i]) {
					writer.append(String.valueOf(i) + "\n");
				}
			}
			
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
}
