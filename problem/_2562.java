import java.util.Scanner;

public class _2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max = 0;
		
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 9; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		for(int i=0; i<9; i++) {
			if(max==arr[i]) {
				System.out.println(max);
				System.out.println(i+1);
				break;
			}
		}
	}

}
