package patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int num = 1;
		for(int i =0;i<n;i++) {
			
			for(int s=n-i+1;s>=0;s--) {
				System.out.print("  ");
			}
			
			for(int j =i;j>=0;j--) {
				System.out.print(num+"   ");
				num++;
			}
			
			System.out.println();
		}

	}

}
