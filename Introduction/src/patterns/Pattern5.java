package patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i =0;i<n;i++) {
			
			for(int s=i;s>0;s--) {
				System.out.print("  ");
			}
			
			for(int j =n-i-1;j>=0;j--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
