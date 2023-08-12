package acmicpc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class acmicpc9996 {
    public static void main(String args[]) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(reader.readLine());
            String[] chkStrArr = reader.readLine().split("\\*");
            String startStr = chkStrArr[0];
            String endStr = chkStrArr[1];

            String yes = "DA";
            String no = "NE";
            String fileName = "";
            int startStrIndex = -1;
            int lastStrIndex = -1;
            for(int i=0; i<n; i++) {
                fileName = reader.readLine();
                startStrIndex = fileName.indexOf(startStr);
                lastStrIndex = fileName.lastIndexOf(endStr);

                if(startStrIndex > -1 && startStrIndex + startStr.length() <= lastStrIndex) {
                    writer.append(yes).append("\n");
                } else {
                    writer.append(no).append("\n");
                }
            }

            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
