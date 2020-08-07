package stackDS;
import java.util.Scanner;

public class Stack {

	
	static Scanner sc = new Scanner(System.in);
	static int stack[],top = -1,capacity;

	static{  // STATIC BLOCK EXECUTES BEFORE MAIN METHOD!!!
		Stack.createStack();
	}

	public static void main(String[] args){

		int ch,item;
		while(true){
			System.out.println("1. PUSH");
			System.out.println("2. POP");
			System.out.println("3. PEEK");
			System.out.println("4. TRAVERSE");
			System.out.println("5. QUIT");

			System.out.println("Enter Your Choice:");
			ch = sc.nextInt();

			switch(ch){
				case 1:
						System.out.println("Enter Element to Push:");
						item = sc.nextInt();
						push(item);
						break;
				case 2: item = pop();
						if(item==0){
							System.out.println("No Element to Pop!");
						}
						else{
							System.out.println("Popped Element: "+item);
						}
						break;
				case 3: item = peek();
						if(item==0){
							System.out.println("No Element to Peek!");
						}
						else{
							System.out.println("Peeked Element: "+item);
						}
						break;
				case 4: traverse();
						break;
				case 5: System.exit(1);

				default: System.out.println("Invalid Choice!");
			}
	}
	}

	static void createStack(){

		System.out.println("Enter Stack Capacity:");
		capacity = sc.nextInt();
		stack = new int[capacity];  // WOW
		System.out.println("Stack Created!");

	}

	static void push(int item){
		if(isFull()){
			System.out.println("Stack is Full!");
		}
		else{
			stack[++top] = item;
		}
	}

	static boolean isFull(){
		if(top == capacity-1){
			return true;
		}
		else{
			return false;
		}
	}

	static int pop(){
		if(isEmpty()){
			return 0;
		}
		else{
			return stack[top--];
		}
	}

	static boolean isEmpty(){
		if(top==-1){
			return true;
		}
		else{
			return false;
		}
	}

	static int peek(){
		if(isEmpty()){
			return 0;
		}
		else{
			return stack[top];
		}
	}

	static void traverse(){
		if(isEmpty()){
			System.out.println("Stack is Empty!");
		}
		else{
			for(int i=top;i>=0;i--){
				System.out.println(stack[i]);
			}
		}
	}
	
}
