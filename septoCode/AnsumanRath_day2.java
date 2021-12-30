package septoCode;
import java.util.Scanner;

public class AnsumanRath_day2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt() , i, res1, res2;
		int[] res = new int[t];
		for(i=0;i<t;i++) {
			int a = sc.nextInt() , b = sc.nextInt();
			if((a%4 == 0 && a%100 != 0) || (a%400 == 0)) 
				res1 = 366;
			else
				res1 = 365;
			if((b%4 == 0 && b%100 != 0) || (b%400 == 0)) 
				res2 = 366;
			else
				res2 = 365;
			res[i] = res1 + res2;
		}
		for(i=0;i<t;i++) {
			System.out.println(res[i]);
		}
		sc.close();
	}
}
