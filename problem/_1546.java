import java.util.Scanner;

public class _1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] score = new double[N];
		double max = 0;
		double result = 0;

		for (int i = 0; i < N; i++) {
			score[i] = sc.nextDouble();
			if (max < score[i]) {
				max = score[i];
			}
		}

		for (int i = 0; i < N; i++) {
			result += score[i] / max * 100;
		}

		System.out.printf("%.2f", result / N);
	}
}
