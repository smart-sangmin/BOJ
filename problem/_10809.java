

import java.util.Scanner;

public class _10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		char a ='a';

		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < S.length(); j++) {
				if (S.charAt(j) == a) { 
					System.out.print(j + " ");
					break;
				}
				if(j == S.length()-1) {
					System.out.print("-1 ");
				}
			}
			a++;
		}
	}

}
