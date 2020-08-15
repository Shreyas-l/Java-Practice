package codeVita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q6 {

	public static void main (String[] args) throws IOException{
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String pt = br.readLine().trim();
		
		HashMap<String, String> hm =  new HashMap<String, String>(); 
		
		int n = Integer.parseInt(br.readLine().trim());
		
		while(n-->0) {
			String temp[] = br.readLine().trim().split(" ");
			hm.put(temp[0], temp[1]);
		}
		
		for (Map.Entry mapElement : hm.entrySet()) { 
            String key = (String)mapElement.getKey(); 

            String value = (String)mapElement.getValue(); 
  
            System.out.println(value);
        } 
	}

}
