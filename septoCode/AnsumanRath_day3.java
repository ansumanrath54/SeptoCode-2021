package septoCode;
import java.util.Scanner;

public class AnsumanRath_day3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] p = s.split(",");
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i]);
		}
	}
}
