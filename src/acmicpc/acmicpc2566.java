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
			int n=1;
			int max = Integer.MIN_VALUE;
			
			while(true) {
				String str = reader.readLine();
				if(null == str) {
					break;
				}
				
				int[] intArr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
				for(int i=0; i<intArr.length; i++) {
					if(max < intArr[i]) {
						max = intArr[i];
						answerN = n;
						answerM = i+1;
					}
				}
				
				n++;
			}
			
			writer.append(String.valueOf(max) + "\n");
			writer.append(String.valueOf(answerN) + " " + String.valueOf(answerM));
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
}
