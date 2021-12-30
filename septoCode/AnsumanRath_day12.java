package septoCode;
import java.util.Scanner;

public class AnsumanRath_day12 {
	
	static void absoluteDifference(int[][] arr,int n) {
		int row=0,column=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1)
					row+=arr[i][j];
				
				if(j==0 || j==n-1)
					column+=arr[i][j];
			}
		}
		System.out.println(Math.abs(row-column));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					arr[j][k] = sc.nextInt();
				}
			}
			absoluteDifference(arr,n);
		}
	}
}
