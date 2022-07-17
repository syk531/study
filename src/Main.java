import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TreeSet;

public class Main {
	public static int solution(int[] A) {
        // write your code in Java SE 8
		int n = 0; 
		int m = 0;
		for(int i=0; i<A.length; i++) {
			n+=A[i];
			m+=(i+1);
		}
		
		return Math.abs(n-m);
    }
	
	public static void main(String[] args) {
		try {
			//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			//BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String now = ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ISO_DATE_TIME);
			System.out.println(now);
			//now.format()
			
			//writer.flush();
			//writer.close();
		} catch (Exception e) {
		}
	}
	
}
