package septoCode;
import java.util.Scanner;

public class AnsumanRath_day4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] points = new int[n];
		for(int i=0;i<n;i++) {
			points[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int rem;
			if(points[i]>35) {
				rem = points[i]%5;
				if(rem >= 3) {
					points[i] = ((points[i]/5)+1)*5;
				}
			}
			System.out.println(points[i]);
		}
	}
}
