package septoCode;
import java.util.Scanner;

public class AnsumanRath_day7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			int index0 = str.indexOf("000000");
			int index1 = str.indexOf("111111");
			if(index0 == -1 && index1 == -1)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
