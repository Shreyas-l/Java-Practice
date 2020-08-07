package loops;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int no = sc.nextInt();
		
		int f = 1;
		for(int i=no;i>0;i--) {
			f*=i;
		}
		
		
		System.out.println("Factorial of " + no + " is : " + f);
	}

}
