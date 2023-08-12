package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class acmicpc1072 {
    public static void main(String args[]) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String[] strArr = reader.readLine().split(" ");
            long x = Integer.parseInt(strArr[0]);
            long y = Integer.parseInt(strArr[1]);
            int z = (int) ((double) y / x * 100);
            long addGame = -1;
            long maxLong = Long.MAX_VALUE;
            if(z < 99) {
                for(;x + addGame < maxLong; addGame++) {
                    if(z < (long) ((double) (y + addGame) / (x + addGame) * 100)) {
                        break;
                    }
                }

                if(x + addGame == maxLong) {
                    addGame = -1;
                }
            }

            writer.append(String.valueOf(addGame));
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
