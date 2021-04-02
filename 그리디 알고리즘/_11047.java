import java.util.Scanner;

public class _11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] money = new int[N];
		int count = 0;
		for (int i = 0; i < N; i++) {
			money[i] = sc.nextInt();
		}
		for (int i = N - 1; i >= 0; i--) {
			if (K >= money[i]) {
				count += (K / money[i]);
				K %= money[i];
			}
		}
		System.out.println(count);
	}
}
