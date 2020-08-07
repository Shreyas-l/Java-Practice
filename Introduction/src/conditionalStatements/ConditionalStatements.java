package conditionalStatements;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 11;
		
		if(x>3) {
			System.out.println("Greater than 3");
		}
		else if(x <= 3 && x >=-3) {
			System.out.println("Between -3 and 3");
		}
		else {
			System.out.println("Less than -3");
		}
		
		
		int max = x>y?x:y;
		System.out.println("MAX : "+max);
	}

}
