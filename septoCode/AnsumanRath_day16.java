package septoCode;
import java.util.Scanner;

public class AnsumanRath_day16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int cnt_e=0, cnt_o=0, odd=0, even=0;
			for(int j=0;j<n;j++) {
				arr[j] = sc.nextInt();
				if(arr[j]%2==0) {
					cnt_e++; even=j+1;
				}	
				else {
					cnt_o++; odd=j+1;
				}
			}
			if(cnt_e>1)
				System.out.println(odd);
			else
				System.out.println(even);
		}
	}
}
