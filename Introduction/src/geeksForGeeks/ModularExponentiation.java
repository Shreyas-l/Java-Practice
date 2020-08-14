package geeksForGeeks;

import java.util.*;
import java.lang.*;
import java.io.*;

class ModularExponentiation {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine().trim());
		
		while(N-->0){
		    String arr[] = new String[3];
		    
		    arr = br.readLine().trim().split(" ");
		    
		    int a = Integer.parseInt(arr[0]);
		    int b = Integer.parseInt(arr[1]);
		    int c = Integer.parseInt(arr[2]);
		    
		    
		    int ans = modulo(a,b,c);
		    
		    System.out.println(ans);
		}
	}
	public static int modulo(int a, int b, int c){
	    if(a==0){
	        return(0);
	    }
	    else if(a==1 || b==0){
	        return(1);
	    }
	    else{
	        return (a%c*modulo(a,b-1,c))%c;
	    }
	}
}