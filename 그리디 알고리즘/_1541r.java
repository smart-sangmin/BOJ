import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1541r {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		int sum = Integer.MAX_VALUE;
		
		while(st.hasMoreTokens()) {
			int temp = 0;
			StringTokenizer tz = new StringTokenizer(st.nextToken(), "+");
			
			while(tz.hasMoreTokens()) {
				temp += Integer.valueOf(tz.nextToken()); 
			}
			if(sum == Integer.MAX_VALUE) {
				sum = temp;
			}else {
				sum -= temp;
			}
		}
		System.out.println(sum);
	}

}
