package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class acmicpc12865 {
	public static void main(String[] agrs) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String[] strArr = reader.readLine().split(" ");
			int n = Integer.parseInt(strArr[0]); //물품의 수
			int k = Integer.parseInt(strArr[1]); //버틸 수 있는 무게
			int[][] goods = new int[n+1][2]; //물건, [[0,0] [6,15], [4,8], [3,6], [5,12]] 구조, [무게, 가치]
			int[][] dp = new int[k+1][n+1]; //최대가치, [[현재체크무게, 물건순번], ...] 구조
			
			for(int i=1; i<=n; i++) {
				goods[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); 
			}
			
			for(int i=1; i<=k; i++) { //무게 1 ~ 버틸 수 있는 무게
				for(int j=1; j<=n; j++) { //물건 순번
					//j순번 물건의 무게 <= 버틸 수 있는 무게
						//j-1 순번 까지의 무게 + j순번 물건의 무게 <= 버틸 수 있는 무게 	-> j순번 물건의 가치 + j-1 순번까지의 dp  
						//j-1 순번 까지의 무게 + j순번 물건의 무게 > 버틸 수 있는 무게 	-> j순번 물건의 가치
					//j순번 물건의 무게 > 버틸수 있는 무게 						-> j-1 순번까지의 dp
				
				}
			}
			
			
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
	
}
