package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class acmicpc15726 {
    public static void main(String args[]) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));) {
            int intArr[] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            long a = intArr[0];
            long b = intArr[1];
            long c = intArr[2];

            int answer = (int) Math.max(a*b/c, a*c/b);
            writer.append(String.valueOf(answer));
            writer.flush();
        } catch(Exception e) {}
    }
}
