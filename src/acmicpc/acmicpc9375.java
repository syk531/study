package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class acmicpc9375 {
	public static void main(String[] agrs) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int num = Integer.parseInt(reader.readLine());
			for(int i=0; i<num; i++) {
				int n = Integer.parseInt(reader.readLine());
				Map<String, Integer> map = new HashMap<>();
				for(int j=0; j<n; j++) {
					String strArr[] = reader.readLine().split(" ");
					String key = strArr[1];
					
					if(map.containsKey(key)) {
						map.put(key, map.get(key)+1); 
					} else {
						map.put(key, 1);
					}
				}
				
				int cnt = 1;
				for(String key : map.keySet()) {
					cnt = cnt * (map.get(key)+1);
				}
				writer.append(String.valueOf(cnt-1)+"\n");
			}
			
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
	
}
