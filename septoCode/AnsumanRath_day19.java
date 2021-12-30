package septoCode;
import java.util.Scanner;

public class AnsumanRath_day19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int flag=0;
			for(int j=0;j<n;j++) {
				arr[j] = sc.nextInt();
				if(j>0 && arr[j]==arr[j-1])
					flag=1;
			}
			if(flag==1)
				System.out.println("Gentle");
			else
				System.out.println("Steep");
		}
	}
}
