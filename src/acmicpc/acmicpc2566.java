package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class acmicpc2566 {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int answerN=1;
			int answerM=1;
			int max = Integer.MIN_VALUE;
			
			for(int i=1; i<=9; i++) {
				String str = reader.readLine();
				
				int[] intArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
				for(int j=0; j<intArr.length; j++) {
					if(max < intArr[j]) {
						max = intArr[j];
						answerN = i;
						answerM = j+1;
					}
				}
			}
			
			writer.append(String.valueOf(max) + "\n");
			writer.append(String.valueOf(answerN) + " " + String.valueOf(answerM));
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
}
