package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		

		int[] a = {7,6,5,4,3,2,1};
		int n = a.length;
		
		for(int i=0;i<n-1;i++) {
			
			boolean sorted = true;     //OPTIMIZATION : ARRAY MAY NOT BE COMPLETELY DESCENDING (WORST CASE)
			
			for(int j=0;j<n-1-i;j++) { //OPTIMIZATION : ARRAY IS ALWAYS SORTED TOWARDS THE END
				
				if(a[j+1]<a[j]) {
					
					sorted = false;
					
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
			
			if(sorted) {
				break;
			}
		}
		
		for(int item:a) {
			System.out.print(item+" ");
		}

	}

}
