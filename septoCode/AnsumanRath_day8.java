package septoCode;
import java.util.Scanner;

public class AnsumanRath_day8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.valueOf(sc.nextLine());
		for(int i=0;i<t;i++) {
			int upper=0,lower=0;
			String str = sc.nextLine();
			for(int j=0;j<str.length();j++) {
				char ch = str.charAt(j);
				if(ch>='A' && ch<='Z')
					upper++;
				else
					lower++;
			}
			if(upper<=lower) {
				String s = str.toLowerCase();
				System.out.println(s);
			}
			else {
				String s = str.toUpperCase();
				System.out.println(s);
			}
		}
		sc.close();
	}
}
