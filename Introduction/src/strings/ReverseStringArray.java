package strings;

public class ReverseStringArray {

	public static void main(String[] args) {
		

		String a = "I love Java, the Coffee";
		a = a.trim();
		String ulta = new String("");
		
		String arr[] = a.split(" ");
		
		
		for(int i = arr.length;i>0;i--) {
			
			//System.out.println(arr[i-1]);
			ulta+=arr[i-1] + " ";
		}

		ulta = ulta.trim();
		System.out.println(ulta);
		
	}

}
