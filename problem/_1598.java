import java.util.Scanner;

public class _1598 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int sum = 0;
		
		a-=1;
		b-=1;
		
		sum = Math.abs(a/4-b/4) + Math.abs(a%4-b%4);
		
		System.out.println(sum);
	}

}
