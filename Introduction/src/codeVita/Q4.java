package codeVita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {

      static String[] ones = {
		    "","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"
		  };
      
      static String[] tens = {
  		    "","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"
  		  };
		  
	public static void main (String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine().trim());
		
		if(n<1 || n >100) {
			System.out.println("greater 100");
			System.exit(1);
		}
		
		int nums[] = new int[n];
		
		int j=0;
		
		//int vowels[] = new int[n];
		int no_vowels = 0;
		
		for(String ele:br.readLine().trim().split(" ")) {
			
			int number = Integer.parseInt(ele); 
			
			if(number<1 || number >100) {
				System.out.println("greater 100");
				System.exit(1);
			}
			nums[j] = number;
			 
			String num_str;

			if(number == 0) {
				num_str = "zero";
			}
			else if(number == 100) {
				num_str = "hundred";
			}
			else if (number % 100 < 20){
			      num_str = ones[number % 100];
			      number /= 100;
			    }
			else {
			      num_str = ones[number % 10];
			      number /= 10;

			      num_str = tens[number % 10] + num_str;
			      number /= 10;
			    }
			 
			//System.out.println(num_str);
			
			for(char c : num_str.toCharArray()) {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					//vowels[j]++;
					no_vowels++;
				}
			}
			
		j++; 
		}

//		for(int val:nums) {
//			System.out.println(val);
//			
//		}
		//System.out.println(no_vowels);
		
		int count = getUP(nums, no_vowels);
		//System.out.println(count);
		
		String coun;

		if(count > 100) {
			coun = "greater 100";
		}
		else if(count == 100) {
			coun = "hundred";
		}
		else if(count == 0) {
			coun = "zero";
		}
		else if (count % 100 < 20){
			coun = ones[count % 100];
			count /= 100;
		    }
		else {
			coun = ones[count % 10];
			count /= 10;

		      coun = tens[count % 10] + coun;
		      count /= 10;
		    }
		System.out.println(coun);
	}
	
	public static int getUP(int[] arr, int sum) 
    { 
  
        int count = 0;
  

        for (int i = 0; i < arr.length; i++) { 
            
        	for (int j = i + 1; j < arr.length; j++) {
                
        		if ((arr[i] + arr[j]) == sum) 
                    count++; 
            }
        }
        return(count); 
    } 
}