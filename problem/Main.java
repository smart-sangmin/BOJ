import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cup[] arr = new Cup[4];
		int num =sc.nextInt();
		
		for(int i = 0; i<4; i++) {
			arr[i]= new Cup();
		}
		arr[1].ball =true;
		
		for(int i=0; i<num; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			Cup temp = arr[X];
			arr[X] = arr[Y];
			arr[Y] = temp;
		}
		for(int i = 1; i<4; i++) {
			if(arr[i].ball==true) {
				System.out.println(i);
				break;
			}
		}
	}
}
	
class Cup{
	boolean ball;
}