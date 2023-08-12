package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.TreeSet;

public class acmicpc1920 {
    public static void main(String args[]) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

            Set<Integer> set = new TreeSet<>();
            int n = Integer.parseInt(reader.readLine());
            String[] nStrArr = reader.readLine().split(" ");

            for(int i=0; i<n; i++) {
                set.add(Integer.parseInt(nStrArr[i]));
            }

            int m = Integer.parseInt(reader.readLine());
            String[] mStrArr = reader.readLine().split(" ");
            for(int i=0; i<m; i++) {
                writer.append(String.valueOf(set.contains(Integer.parseInt(mStrArr[i])) ? 1 : 0) + "\n");
            }

            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
