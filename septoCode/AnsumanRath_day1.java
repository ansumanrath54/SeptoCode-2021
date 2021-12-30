package septoCode;
import java.util.Scanner;

public class AnsumanRath_day1 {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] res = new int[n];
		for(i=0;i<n;i++) {
			int a,b,c;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			res[i] = a+b*c/a-b;
		}
		for(i=0;i<n;i++)
			System.out.println(res[i]);
		
		sc.close();
	}
}
