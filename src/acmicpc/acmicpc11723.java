package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class acmicpc11723 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(reader.readLine());
            Set<Integer> set = new HashSet<>();

            for(int i=0; i<n; i++) {
                String[] strArr = reader.readLine().split(" ");
                int num = 0;
                if(!"all".equals(strArr[0]) && !"empty".equals(strArr[0])) {
                    num = Integer.parseInt(strArr[1]);
                }

                switch (strArr[0]) {
                    case "add":
                        set.add(num);
                        break;
                    case "remove":
                        set.remove(num);
                        break;
                    case "check":
                        if(set.contains(num)) {
                            writer.append(String.valueOf(1)).append("\n");
                        } else {
                            writer.append(String.valueOf(0)).append("\n");
                        }
                        break;
                    case "toggle":
                        if(set.contains(num)) {
                            set.remove(num);
                        } else {
                            set.add(num);
                        }
                        break;
                    case "all":
                        for(int j=1; j<=20; j++) {
                            set.add(j);
                        }
                        break;
                    case "empty":
                        set.clear();
                }
            }

            writer.flush();
        } catch (Exception e) {}
    }
}
