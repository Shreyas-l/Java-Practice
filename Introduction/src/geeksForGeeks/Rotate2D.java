package geeksForGeeks;

import java.util.*;
import java.lang.*;
import java.io.*;

class Rotate2D {
	public static void main (String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine().trim());
		
		while(N-->0){
		    
		    int n = Integer.parseInt(br.readLine().trim());
		    
		    ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
		    
		    ArrayList<Integer> pmat = new ArrayList<>();
		    
		    for(String ele: br.readLine().trim().split(" ")){
		 
		            pmat.add(Integer.parseInt(ele));
		            //System.out.println(pmat);
		            
		            if(pmat.size() == n){
		            mat.add(pmat);
		            pmat = new ArrayList<>();
		        }
		        
		    }
		    
		    for(int i=0;i<n;i++){
		        for(int j=n-1;j>=0;j--){
		            System.out.print(mat.get(j).get(i) +" ");
		        }
		    }
		    System.out.println();
		}
	}
}