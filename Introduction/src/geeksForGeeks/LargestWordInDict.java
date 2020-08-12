package geeksForGeeks;

import java.util.*;
import java.lang.*;
import java.io.*;

class LargestWordInDict {
	public static void main (String[] args) throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int N = Integer.parseInt(br.readLine().trim());
	while(N-->0){
	    int n = Integer.parseInt(br.readLine().trim());
	    //String dict[] = new String[n];
	    String dict[] = br.readLine().trim().split(" ");
	    String toFind = br.readLine().trim();
	    
	    //System.out.println(toFind);
	    
	    String found = null;
	    int strS = Integer.MIN_VALUE;
	    for(String ele:dict){
	        
	        if(hassubstr(toFind,ele)){
	            if(ele.length()>strS){
	                
	                found = ele;
	                strS = ele.length();
	            }
	        }
	    }
	    System.out.println(found);
	    
	}
	}
	
	public static boolean hassubstr(String toFind, String ele){
	    int a1[] = new int[256];
	    
	    for(char c:toFind.toCharArray()){
	        int asci = (int)c;
	        a1[asci]++;
	    }
	    
	    for(char d:ele.toCharArray()){
	        int ascid = (int)d;
	        a1[ascid]--;
	    }
	    
	    boolean ans = true;
	    for(int i=0;i<256;i++){
	        if(a1[i]<0){
	            ans = false;
	        }
	    }
	    
	    return ans;
	}
}