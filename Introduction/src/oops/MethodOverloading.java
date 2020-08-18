package oops;

public class MethodOverloading {

	public static void main(String[] args) {
		

		myName();
		myName(10);

	}
	
	static void myName() {
		System.out.println("Hello!");
	}
	
	static void myName(int x) {        //DIFFERENT SIGNATURE
		System.out.println("Hello!");
	}

}
