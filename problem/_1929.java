import java.util.Scanner;

public class _1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		int[] a = new int[N + 1];

		for (int i = 0; i <= N; i++)
			a[i] = 0;
		a[1]=1;

		for (int i = 2; i <= N; i++) {
			for (int j = 2; i * j <= N; j++) {
				a[i * j] = 1;
			}
		}

		for (int i = M; i <= N; i++) {
			if (a[i] != 1) {
				System.out.println(i);
			}
		}
	}

}