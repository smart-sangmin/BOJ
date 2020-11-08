import java.util.Scanner;

public class _2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = -1;

		for (int i = 0; i * 3 <= N; i++) {
			for (int j = 0; j * 5 <= N; j++) {
				if (N - (j * 5) - (i * 3) == 0) {
					num = (i + j);
					break;
				}
			}
			if (num != -1) {
				break;
			}
		}
		System.out.println(num);
	}
	
}