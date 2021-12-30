package septoCode;
import java.util.ArrayList;
import java.util.Scanner;

public class AnsumanRath_day18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int j;
			ArrayList<Integer> arr = new ArrayList<>();
			for(j=0;j<n;j++) {
				int a = sc.nextInt();
				arr.add(a);
			}
			for(j=1;j<=n;j++) {
				if(!arr.contains(j))
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
