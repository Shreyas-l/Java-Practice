package oops;

public class Teacher extends Person{

	
	public Teacher(String name) {
		super(name);
		System.out.println("Inside Teacher Constructor!");
		
	}
	
	public void teach() {
		System.out.println("Teach!");
	}
	
	public void eat() {         //METHOD OVERRIDING
		System.out.println("Teacher is Eating!");
	}
	
	public static void main(String[] args) {
		

		Teacher Rakhi = new Teacher("Rakhi");
		
		//Rakhi.name = "Rakhi";
		
		Rakhi.eat();
		Rakhi.walk();
		Rakhi.teach();

		System.out.println(Rakhi instanceof Person);
		
		System.out.println(Rakhi instanceof Teacher);
	}

}
