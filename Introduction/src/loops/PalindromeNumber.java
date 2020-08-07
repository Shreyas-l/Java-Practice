package loops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digit;
		int ogn = n;
		int ultan = 0;
		while(n!=0) {
			
			digit = n%10;
			ultan = ultan*10 + digit;
			//System.out.println(digit);
			n = n/10;
		}
		
		System.out.println(ultan);
		 if(ogn == ultan) {
			 System.out.println("Palindrome!");
		 }else {
			 System.out.println("Not a Palindrome!");
		 }
		
	}

}
