import java.util.Scanner;

public class _8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			int sum = 0;
			int score = 1;
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				switch (s.charAt(j)) {
				case 'O':
					sum += score;
					score++;
					break;
				case 'X':
					score = 1;
					break;
				}
			}
			System.out.println(sum);
		}
		
	}
}