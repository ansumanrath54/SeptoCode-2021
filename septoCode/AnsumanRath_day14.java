package septoCode;
import java.util.Arrays;
import java.util.Scanner;

public class AnsumanRath_day14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<n;j++) {
				arr[j] = sc.nextInt();
			}
			int max = Arrays.stream(arr).max().getAsInt();
			for(int k=0;k<n;k++) {
				if(max == arr[k]) 
					System.out.println(k+1);
			}
		}
	}
}
