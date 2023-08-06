package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class acmicpc23972 {
    public static void main(String args[]) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));) {
            int intArr[] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int a = intArr[0];
            int b = intArr[1];
            int answer = b == 1 ? -1 : (int) Math.ceil((double) a / (b-1)) + a;

            writer.append(String.valueOf(answer));
            writer.flush();
        } catch(Exception e) {}
    }
}
