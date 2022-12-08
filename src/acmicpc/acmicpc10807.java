package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class acmicpc10807 {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(reader.readLine());
			int intArr[] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int v = Integer.parseInt(reader.readLine());
			int cnt = 0;
			
			for(int i : intArr) {
				if(i == v) {
					cnt++;
				}
			}
			
			writer.append(String.valueOf(cnt));
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
}
