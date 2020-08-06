package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		
		byte x = 4;
		int y = x;
		double z = y;
		int zint = (int)z;   //Manual TypeCast
		
		
		System.out.println(y);
		System.out.println(z);
		System.out.println(zint);
	}

}
