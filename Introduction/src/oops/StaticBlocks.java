package oops;

public class StaticBlocks {
	
	static {
		System.out.println("Static 1");
	}
	
	static {
		System.out.println("Static 2");
	}

	public static void main(String[] args) {
		

		System.out.println("Main");

	}
	
	static {
		System.out.println("Static 3");
	}

}
