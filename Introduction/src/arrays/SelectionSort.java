package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		

		int a[] = {7,6,5,3,4,2,1};
		int n = a.length;
		
		
		for(int i=0;i<n-1;i++) {
			
			int minIndex = i;
			boolean sorted = true;  //OPTIMIZATION
			for(int j=i;j<n;j++) {
				
				if(a[j]<a[minIndex]) {
					minIndex = j;
					sorted = false;
				}
			}
			
			if(sorted) {
				break;
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		
		for(int item:a) {
			System.out.print(item+" ");
		}
	}

}
