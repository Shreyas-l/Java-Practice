package oops;


class Cat{
	
	boolean hasFur;
	String color, breed;
	int eyes,legs;
	
	public void walk() {
		System.out.println("Cat Walking!");
	}
	
	public void eat() {
		System.out.println("Cat Eating!");
	}
	
	public void describe() {
		System.out.println("Cat has "+legs+ "Legs and "+eyes+"Eyes!");
	}
	
}

class Dog{
	
}


public class MainClass {

	public static void main(String[] args) {
		

		Cat meredith = new Cat();
		
		Cat olivia = new Cat();
		
		meredith.walk();
		
		olivia.eat();
		
		meredith.legs = 3;
		meredith.eyes = 2;
		
		olivia.legs = 1;
		olivia.eyes = 4;
		
		meredith.describe();
		
		olivia.describe();

	}

}
