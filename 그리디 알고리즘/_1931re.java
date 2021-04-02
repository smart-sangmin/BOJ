import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _1931re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] time = new int[N][2];

		for (int i = 0; i < N; i++) {
			time[i][0] = sc.nextInt();
			time[i][1] = sc.nextInt();
		}

		Arrays.sort(time, new Comparator<int[]>() {
			@Override
			public int compare(int[] n1, int[] n2) {
				if (n1[1] == n2[1]) {
					return n1[0] - n2[0];
				}
				return n1[1] - n2[1];
			}
		});
		int count = 0;
		int prev = 0;
		for (int i = 0; i < N; i++) {
			if(prev <= time[i][0]) {
				count++;
				prev = time[i][1]; 
			}
		}
		
		System.out.println(count);
	}
}
