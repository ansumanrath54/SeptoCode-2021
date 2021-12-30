package septoCode;
import java.util.Scanner;

public class AnsumanRath_day11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int steps = 0;
			while(n!=1) {
				n = n/2;
				steps++;
			}
			System.out.println(steps);
		}
	}
}
