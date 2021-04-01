package NQT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UniqueInt{

	public static void main (String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine().trim());
		
		int nums[] = new int[N];
				
		int i=0;
		for(String ele:br.readLine().trim().split(" ")) {
				nums[i++] = Integer.parseInt(ele);
				
		}
		
		for(i=0;i<N;i++) {
			
			int count=0;
			for(int j=0;j<N;j++) {
				
				if(nums[i] == nums[j]) {
					count++;
				}
				
			}
			if(count==1) {
				System.out.println(nums[i]);
				break;
			}
		}

	}

}
