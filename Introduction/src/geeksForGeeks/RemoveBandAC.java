package geeksForGeeks;

import java.util.*;
import java.lang.*;
import java.io.*;

class RemoveBandAC {
	public static void main (String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine().trim());
		while(N-->0){
		    
		    String str = br.readLine().trim();
		    //System.out.println(str);
		    ArrayList<Character> l = new ArrayList<>();
		    for(char c:str.toCharArray()){
		        l.add(c);
		    }
		    //System.out.println(l);
		    
		    for(int i=0;i<l.size();i++){
		        if(l.get(i) == 'b'){
		            l.remove(i);
		            i--;
		        }
		        else if(i < l.size()-1 && l.get(i) == 'a' && l.get(i+1) == 'c'){
		            l.remove(i);
		            l.remove(i);
		            i--;
		        }
		    }
		    
		    
		    if(l.size() == 0){
		        System.out.println();
		    }else{
		    String ans = new String("");
		    for(char ele:l){
		        ans+=ele;
		    }
		    System.out.println(ans);
		    }
		    //System.out.println(l);
		}
	}
}