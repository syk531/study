package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class acmicpc2004 {
	public static void main(String[] agrs) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int intArr[] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int n = intArr[0];
			int m = intArr[1];

			int answer[][] = {{n, 0, 0}, {n-m, 0, 0}, {m, 0, 0}}; //{num, 5 약수개수, 2 약수개수}
			int cnt = 0;
			
			if(m >= 1) {
				for(int i=0; i<3; i++) {
					int num = answer[i][0];
					cnt = 0;
					int jisu = 1;
					
					//5 약수개수
					while(true) {
						int quotient = num / (int)Math.pow(5, jisu++);
						if(quotient > 0) {
							cnt += quotient;
						} else {
							answer[i][1] = cnt;
							break;
						}
					}
					
					cnt = 0;
					jisu = 1;
					
					//2 약수개수
					while(true) {
						int quotient = num / (int)Math.pow(2, jisu++);
						if(quotient > 0) {
							cnt += quotient;
						} else {
							answer[i][2] = cnt;
							break;
						}
					}
				}
				
				writer.append(String.valueOf(Math.min(answer[0][1] - answer[1][1] - answer[2][1], answer[0][2] - answer[1][2] - answer[2][2])));
			} else if(m < 1) {
				writer.append(String.valueOf(cnt));
			}
			
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
	
}
