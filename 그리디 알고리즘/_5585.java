import java.util.Scanner;

public class _5585 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int money = 1000 - sc.nextInt();
		int count = 0;
		int[] coin = { 500, 100, 50, 10, 5, 1 };
		
		for(int i = 0; i < coin.length; i++) {
			if(money>=coin[i]) {
				count += (money / coin[i]);
				money %= coin[i];
			}
		}

		System.out.println(count);
	}
}
