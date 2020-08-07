package arrays;
import java.util.Scanner;

public class AverageMarks {

	static Scanner sc = new Scanner(System.in);
	static int num,marks[],sum=0;
	
	static {
		getNumStudents();
	}
	
	public static void main(String[] args) {
	
		System.out.println("Enter the Marks : ");
		
		for(int i=0;i<marks.length;i++) {
			marks[i] = sc.nextInt();
			sum+=marks[i];
		}
		
		System.out.println("Average Marks are : "+sum/marks.length);

	}
	
	static void getNumStudents() {
		System.out.println("Enter the number of students : ");
		num = sc.nextInt();
		
		marks = new int[num];
		
	}

}
