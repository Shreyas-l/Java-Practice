package oops.packages.models;

public class Student {

	private int age;
	
	public void setter(int age) {
		this.age=age;
	}
	
	public void getter() {
		System.out.println(this.age);
	}
	
	public Student(){
		System.out.println("Constructor Invoked!");
	}
	
	public static void main(String[] args) {
	

	}

}
