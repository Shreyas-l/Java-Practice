package userInput;
import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*int x = sc.nextInt();
		double y = sc.nextDouble();*/
		
		System.out.println("Input Something");
		
		String i = sc.nextLine();
		
		//System.out.println(x);
		System.out.println("The input is : " + i);

	}

}
