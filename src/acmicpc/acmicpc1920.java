package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class acmicpc1920 {
    public static void main(String args[]) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

            boolean[] chk = new boolean[100000];
            int n = Integer.parseInt(reader.readLine());
            String[] nStrArr = reader.readLine().split(" ");

            for(int i=0; i<n; i++) {
                chk[Integer.parseInt(nStrArr[i])] = true;
            }

            int m = Integer.parseInt(reader.readLine());
            String[] mStrArr = reader.readLine().split(" ");
            int num = 0;
            for(int i=0; i<m; i++) {
                num = chk[Integer.parseInt(mStrArr[i])] ? 1 : 0;
                writer.append(String.valueOf(num) + "\n");
            }

            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
