import java.util.Scanner;

public class _1075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		int F = sc.nextInt();

		N /= 100;
		N *= 100;
		
		for (int i = 0; i < 100; i++) {
			if ((N + i) % F == 0) {
				if (i < 10) {
					System.out.println("0" + i);
					break;
				} else {
					System.out.println(i);
					break;
				}
			}
		}

	}

}
