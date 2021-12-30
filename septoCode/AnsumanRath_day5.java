package septoCode;
import java.util.Scanner;

public class AnsumanRath_day5 {
	
	static void uniqueElements(int arr[]) {
		int uflag = 0;
		for(int i=0;i<arr.length;i++) {
			int flag = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i] == arr[j] && i!=j)
					flag = 1;
			}
			if(flag == 0) {
				System.out.print(arr[i] + " ");
				uflag = 1;
			}
		}
		if(uflag == 0)
			System.out.print(0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<n;j++) {
				arr[j] = sc.nextInt();
			}
			uniqueElements(arr);
			System.out.println();
		}
		sc.close();
	}
}
