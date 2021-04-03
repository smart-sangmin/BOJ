import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _1946re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int count = 1;

			ArrayList<Person> list = new ArrayList<Person>();

			for (int j = 0; j < N; j++) {
				Person p = new Person(sc.nextInt(), sc.nextInt());
				list.add(p);
			}
			Collections.sort(list);

			Person bp = list.get(0);

			for (int j = 0; j < N; j++) {
				if(bp.interview > list.get(j).interview) {
					bp = list.get(j);
					count++;
				}
			}

			System.out.println(count);
		}
	}
}

class Person implements Comparable<Person> {
	int paper;
	int interview;

	public Person(int paper, int interview) {
		this.paper = paper;
		this.interview = interview;
	}

	@Override
	public int compareTo(Person o) {
		return this.paper - o.paper;
	}
}