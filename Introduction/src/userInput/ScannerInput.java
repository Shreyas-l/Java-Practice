package userInput;
import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		double y = sc.nextDouble();
		
		System.out.println("Input Something");
		
		sc.nextLine();
		String i = sc.nextLine();
		
		char ch = sc.nextLine().charAt(0);
		
		//System.out.println(x);
		System.out.println("The input String is : " + i);
		System.out.println("The input Char is : " + ch);

	}

}
