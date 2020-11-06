import java.util.Scanner;

public class _2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int[] n = new int[10];
		int sum = A * B * C;
		int num;
		
		for(int i = 0; i<n.length; i++) {
			n[i]=0;
		}
		while(true) {
			if(sum==0) {
				break;
			}
			num = sum % 10;
			sum /= 10;
			switch(num) {
			case 0: n[0]++; break;
			case 1: n[1]++; break;
			case 2: n[2]++; break;
			case 3: n[3]++; break;
			case 4: n[4]++; break;
			case 5: n[5]++; break;
			case 6: n[6]++; break;
			case 7: n[7]++; break;
			case 8: n[8]++; break;
			case 9: n[9]++; break;
			}
		}
		for(int number : n) {
			System.out.println(number);
		}
	}
}
