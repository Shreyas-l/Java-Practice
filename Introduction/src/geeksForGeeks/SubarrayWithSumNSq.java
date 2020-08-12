package geeksForGeeks;

import java.util.*;
import java.lang.*;
import java.io.*;

class SubarrayWithSumNSq {
	public static void main (String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine().trim());
		
		while(N-->0){
		    
		    int arr[] = new int[2];
		    int i=0;
		    for(String ele:br.readLine().trim().split(" ")){
		        arr[i++] = Integer.parseInt(ele);
		    }
		    
		    int n = arr[0];
		    int sum = arr[1];
		    
		    //System.out.println(sum);
		    
		    int numArray[] = new int[n];
		    int j=0;
		    for(String elem:br.readLine().trim().split(" ")){
		        numArray[j++] = Integer.parseInt(elem);
		    }
		    
		    //for(int ele: numArray)System.out.println(ele);
		    
		  
		    //List<Integer> ind = new ArrayList<>();
		    boolean isFound = false;
		    for(int x=0;x<n;x++){
		        
		        if(isFound){
		            break;
		        }
		        
    		        int count=numArray[x];
    		        if(count==sum){
    		            isFound = true;
    		                int start = x+1;
    		                int end = x+1;
    		                System.out.println(start+" "+end);
    		                break;
    		        }
    		        for(int y=x+1;y<n;y++){
    		            
                        count+=numArray[y];
                        
    		            if(count==sum){
    		                isFound = true;
    		                int start = x+1;
    		                int end = y+1;
    		                System.out.println(start+" "+end);
    		                break;
    		            }
    		            else if(count>sum){
    		                break;
    		            }
    		            
    		        }
		       
		    }
		    
		    if(!isFound){
		        System.out.println("-1");

		    }
		    
		}
		
	}
}