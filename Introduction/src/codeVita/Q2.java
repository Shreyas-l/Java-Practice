package codeVita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Q2 {

	public static void main (String[] args) throws IOException{
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine().trim());
		while(N-->0){
			 int n = Integer.parseInt(br.readLine().trim());
			   
			 ArrayList<Integer> nums = new ArrayList<>();
			 String dict[] = br.readLine().trim().split(" ");
			 
			 //int j=0;
			 for(String ele:dict) {
				 nums.add(Integer.parseInt(ele));
			 }
			 
			 //System.out.println(nums);
			 
			 int remZero=0, remOne=0, remTwo=0;
			 
			 boolean notPossible = true;
			 
			 for (int i = 0; i < nums.size(); i++) { 
			 
				 if (nums.get(i) % 3 == 0) { 
					 remZero++; 
			        } 
			        else if (nums.get(i) % 3 == 1) { 
			        	remOne++; 
			        	notPossible = false;
			        } 
			        else { 
			        	remTwo++; 
			        	notPossible = false;
			        } 
			 }
			 
			 if (remZero == 0 && remOne != 0 && remTwo != 0){ 
				  System.out.println("No");
				 
				    } 
			 else if(remZero > remOne + remTwo + 1) {
				 System.out.println("No");
			 }
			 else {
				 System.out.println("Yes");
			 }
			 
		}
	}

}
