package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Comparator;

public class acmicpc11652 {
    public static void main(String[] agrs) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(reader.readLine());
            int num = 0;
            Map<Integer, Integer> map = new HashMap<>();

            for(int i=0; i<n; i++) {
                num = Integer.parseInt(reader.readLine());
                if(map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }

            List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
            entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    if(o2.getValue().equals(o1.getValue())) {
                        return (int) o1.getKey() - (int) o2.getKey();
                    } else {
                        return (int) o2.getValue() - (int) o1.getValue();
                    }
                }
            });

            writer.append(String.valueOf(entryList.get(0).getKey()));
            writer.flush();
        } catch (Exception e) {}
    }
}
