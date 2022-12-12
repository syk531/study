package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class acmicpc2587 {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int[] numArr = new int[5]; 
			for(int i=0; i<5; i++) {
				numArr[i] = Integer.parseInt(reader.readLine());
			}
			
			Arrays.sort(numArr);
			int avg = Arrays.stream(numArr).sum() / 5;
			
			writer.append(String.valueOf(avg) + "\n");
			writer.append(String.valueOf(numArr[2]));
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
}
