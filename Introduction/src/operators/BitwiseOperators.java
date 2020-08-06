package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
			
		int a = 5;
		int b = 6;
		
		int c = a & b;
		System.out.println(c);
		
		int x = 10;
		
		int y = x >> 1;  //RS = /2
		int z = x << 1;  //LS = *2
		System.out.println("Right Shift :" + y +" Left Shift : " + z);

	}

}
