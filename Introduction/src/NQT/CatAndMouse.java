package NQT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class CatAndMouse {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Q = Integer.parseInt(br.readLine().trim());
		
		while(Q-->0) {
			
			String arr[] = br.readLine().trim().split(" ");
		    
		    int x = Integer.parseInt(arr[0]);
		    int y = Integer.parseInt(arr[1]);
		    int z = Integer.parseInt(arr[2]);
		    
		    int a = Math.abs(x-z);
		    int b = Math.abs(y-z);
		    
		    if(a>b) {
		    	System.out.println("Cat B");
		    }else if(b>a) {
		    	System.out.println("Cat A");
		    }else {
		    	System.out.println("Mouse Wins");
		    }
		    
		}

	}

}
