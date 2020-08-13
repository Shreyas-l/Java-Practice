package geeksForGeeks;

import java.util.*;
import java.lang.*;
import java.io.*;


class OneBTwoC {
	public static void main (String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine().trim());
		
		while(N-->0){
		    int k = Integer.parseInt(br.readLine().trim());
		    
		    int ans = ((int)Math.pow(k,3) + 3*k + 2)/2;
		    System.out.println(ans);
		    
		}
	}
	
	
}