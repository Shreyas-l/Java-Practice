package leetCode;

public class ReverseArrayWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
    public String reverseWords(String s) {
        
       int i = s.length()-1;
        String ans = new String("");
        
        while(i>=0){
            
            while(i>=0 && s.charAt(i) == ' ')i--;
            
            int j=i;
            
            while(i>=0 && s.charAt(i) != ' ')i--;
            ans+=s.substring(i+1,j+1) + " ";
        }
        
        return(ans.trim());
    }
}