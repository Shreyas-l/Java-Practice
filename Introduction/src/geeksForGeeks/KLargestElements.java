package geeksForGeeks;


import java.util.*;
import java.lang.*;
import java.io.*;

class KLargestElements {
	public static void main (String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine().trim());
		while(N-->0){
		    String arr[] = new String[2];
		    arr = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(arr[0]);
		    int k = Integer.parseInt(arr[1]);

		    ArrayList<Integer> nums = new ArrayList<>();
		    int i=0;
		    for(String ele:br.readLine().trim().split(" ")){
		        nums.add(Integer.parseInt(ele));
		        
		    }
		    
		    Collections.sort(nums,Collections.reverseOrder());
		    
		    int j=0;
		    for(int ele:nums){
		        if(j==k)break;
		        System.out.print(ele + " ");
		        j++;
		    }
		    System.out.println();
		    
		}
	}
}