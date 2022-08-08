package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class acmicpc3003 {
	public static void main(String[] agrs) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int[] intArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] piece = {1, 1, 2, 2, 2, 8};
			
			for(int i=0; i<intArr.length; i++) {
				writer.append(String.valueOf(piece[i] - intArr[i]) + " ");
			}
			
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
}
