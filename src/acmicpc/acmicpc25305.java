package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class acmicpc25305 {
	public static void main(String[] agrs) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int[] intArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int n = intArr[0];
			int k = intArr[1];
			
			String[] strArr = reader.readLine().split(" ");
			Integer intArr2[] = new Integer[n];
			for(int i=0; i<strArr.length; i++) {
				intArr2[i] = Integer.parseInt(strArr[i]);  
			}
			Arrays.sort(intArr2, Comparator.reverseOrder());
			
			writer.append(String.valueOf(intArr2[k-1]));
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
}
