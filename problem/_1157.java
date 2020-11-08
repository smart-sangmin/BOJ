import java.util.Scanner;

public class _1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toUpperCase();

		int[] count = new int[26];

		char a = 'A';
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - a]++;
		}

		int max = 0;
		char ch = 0;

		for (int i = 0; i < 26; i++) {
			if (count[i] > max) {
				max = count[i];
				ch = (char) (a + i);
			} else if (max == count[i]) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
