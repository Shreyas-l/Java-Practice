package geeksForGeeks;

import java.util.*;



// } Driver Code Ends


//User function Template for Java

//Helper class to find largest number with minimum frequency
class Geeks
{
 // Function to find largest number with minimum frequency
 public static int LargButMinFreq(int arr[], int n)
 {
     
 HashMap<Integer, Integer> hm = new HashMap<>();
     for(int i = 0 ; i < n; i++)
      {
          int key = arr[i];
          if(hm.containsKey(key))
          {
              int freq = hm.get(key);
              freq++;
              hm.put(key, freq);
          }
          else
          {
            hm.put(key, 1);
          }
      }
      
      int minfreq = Integer.MAX_VALUE, res = -1;
      for(Map.Entry<Integer, Integer> ent: hm.entrySet())
      {
          if (minfreq >= ent.getValue() && res < ent.getKey()) 
         { 
             res = ent.getKey(); 
             minfreq = ent.getValue(); 
         } 
      }
      return res;
 }
   
 
}

//{ Driver Code Starts.

//Driver class with main function
class FrequencyGame 
{
 // Main function
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		// Iterating over testcases
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    
		    for(int i = 0; i < n; i++)
		     arr[i] = sc.nextInt();
		     
		    Geeks obj = new Geeks();
		    System.out.println(obj.LargButMinFreq(arr, n));
		}
	}
}  // } Driver Code Ends