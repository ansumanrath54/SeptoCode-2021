package septoCode;
import java.util.Scanner;

public class AnsumanRath_day21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int x = sc.nextInt();
			int sum=0;
			while(x!=0) {
				sum=sum+(x%2);
				x=x/2;
			}
			System.out.println(sum);
		}
	}
}
