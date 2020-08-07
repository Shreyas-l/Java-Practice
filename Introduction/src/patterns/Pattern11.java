package patterns;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i =0;i<n;i++) {
			for(int j =i;j>=0;j--) {
				if(j == 0 || j == i || i == n-1) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
