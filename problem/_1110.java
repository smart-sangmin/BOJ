import java.util.Scanner;

public class _1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int num1, num2;
		int sum = N;
		for (int i = 1;; i++) {
			num1 = sum / 10;
			num2 = sum % 10;
			sum = (num2 * 10) + ((num1 + num2)%10);
			if (sum == N) {
				System.out.println(i);
				break;
			}
		}
	}

}
