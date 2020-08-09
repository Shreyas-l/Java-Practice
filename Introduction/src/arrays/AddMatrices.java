package arrays;
import java.util.Scanner;

public class AddMatrices {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int[][] a;
		int[][] b;
		int[][] c;
		int n;
		
		System.out.println("Enter n :");
		n = sc.nextInt();
		
		a = new int[n][n];
		b = new int[n][n];
		c = new int[n][n];
		
		System.out.println("Enter Matrix A :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println("Enter Matrix B :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println("Matrix C :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
			
		}
	}

}
