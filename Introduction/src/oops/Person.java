package oops;

public class Person {

	protected String name;
	
	public Person(String name) {
		this.name = name;
		System.out.println("Inside Person Constructor!");
	}
	public void walk() {
		System.out.println("Walk");
	}
	
	public void eat() {
		System.out.println("Eat");
	}

}
