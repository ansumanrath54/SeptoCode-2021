package septoCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AnsumanRath_day20 {
	
	static void allPrimeNumbers(int n) {
		ArrayList<Integer> arr = new ArrayList<>();
		int cnt=0;
		if (n % 2 == 1) {
			arr.add(3);	cnt++;	n -= 3;
	    }
	    while (n>0) {
	    	arr.add(2);	cnt++;	n -= 2;
	    }
	    System.out.println(cnt);
	    Collections.sort(arr);
	    for(int i:arr) {
	    	System.out.print(i+" ");
	    }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			allPrimeNumbers(n);
			System.out.println();
		}
	}
}
