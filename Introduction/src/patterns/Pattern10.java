package patterns;
import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i =0;i<n;i++) {
			for(int j =i;j>=0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i =0;i<n-1;i++) {
			for(int j =n-i-2;j>=0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		

	}

}
