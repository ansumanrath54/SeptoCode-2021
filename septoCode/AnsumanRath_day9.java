package septoCode;
import java.util.Scanner;

public class AnsumanRath_day9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.valueOf(sc.nextLine());
		for(int i=0;i<t;i++) {
			String str = sc.nextLine();
			int cnt = 0;
			for(int j=0,k=j+1;k<str.length();j++,k++) {
				if(str.charAt(j) == str.charAt(k))
					cnt++;
			}
			System.out.println(cnt);
		}
	}
}
