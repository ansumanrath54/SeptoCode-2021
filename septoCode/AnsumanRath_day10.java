package septoCode;
import java.util.Arrays;
import java.util.Scanner;

public class AnsumanRath_day10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		int n = Integer.valueOf(sc.nextLine());
		for(int i=0;i<n;i++) {
			Arrays.fill(arr, 0);
			int flag=0;
			String str = sc.nextLine();
			for(int j=0;j<str.length();j++) {
				int r = str.charAt(j);
				arr[r-97]++;
			}
			for(int k=0;k<26;k++) {
				if(arr[k] == 0) {
					flag = 1;
					break;
				}
			}
			if(flag == 1)
				System.out.println("Fail");
			else
				System.out.println("Pass");
		}
	}
}
