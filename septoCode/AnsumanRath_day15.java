package septoCode;
import java.util.Scanner;

public class AnsumanRath_day15 {
	
	static void findCheater(int students[],int n) {
		int flag=0;
		for(int i=0;i<n;i++) {
			int flag1=0;
			for(int j=0;j<n;j++) {
				if(i+1 == students[j])
					flag1=1;
			}
			if(flag1 == 0) {
				System.out.println(i+1);
				flag=1;
			}
		}
		if(flag == 0)
			System.out.println(0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int[] students = new int[n];
			for(int j=0;j<n;j++) {
				students[j] = sc.nextInt();
			}
			findCheater(students,n);
		}
	}
}
