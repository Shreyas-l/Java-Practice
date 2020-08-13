package strings;
import java.io.*;

public class PalString {

	public static void main(String[] args) throws IOException{
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().trim();
		String reverse = new StringBuffer(str).reverse().toString();
		
		if(str.equals(reverse)) {
			System.out.println("Palindrome!");
		}else {
			System.out.println("Not a Palindrome!");
		}

	}

}
