package septoCode;
import java.util.Scanner;

public class AnsumanRath_day17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			while(n/10 != 0) {
				int sum=0;
				while(n>0) {
					sum = (int) (sum + Math.pow(n%10, 2));
					n = n/10;
				}
				n=sum;
			}
			if(n == 1)
				System.out.println("lucky");
			else
				System.out.println("unlucky");
		}
	}
}
