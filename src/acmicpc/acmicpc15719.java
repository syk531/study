package acmicpc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class acmicpc15719 {
    public static void main(String args[]) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {

            int n = Integer.parseInt(reader.readLine());
            long sum = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).sum();
            long answer = 0;

            if(n % 2 == 0) {
                if(sum % n >  n / 2) {
                    answer = sum % n - n / 2;
                } else {
                    answer = sum % n + n / 2;
                }
            } else {
                answer = sum % n;
            }

            System.out.print(answer);
        } catch (Exception e) {}
    }
}
