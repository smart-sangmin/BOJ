import java.util.Scanner;

public class _10809new {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		for(char a = 'a'; a<='z'; a++) {
			System.out.print(S.indexOf(a)+" ");
		}
	}

}
