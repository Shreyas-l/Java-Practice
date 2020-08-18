package oops;

class Vehicle{
	int wheels;
	
	
//	Vehicle(){      //DEFAULT CONSTRUCTOR
//		this.wheels = 0;
//	}
	
	//CONSTRUCTOR OVERRIDING
	Vehicle(){      //NON-PARAMETERISED CONSTRUCTOR
		this.wheels = 5;
	}
	
	//CONSTRUCTOR OVERLOADING
	Vehicle(int wheels){      //PARAMETERISED CONSTRUCTOR
		this.wheels = wheels;
	}
	
	void describe() {
		System.out.println(this.wheels);
	}
}


public class MyConstructor {

	MyConstructor(){      //NO ARG CONSTRUCTOR
		System.out.println("Constructor Invoked!");
	}
	public static void main(String[] args) {
		

		MyConstructor mc = new MyConstructor();
		
		Vehicle alto = new Vehicle(4);
		alto.describe();

	}

}
