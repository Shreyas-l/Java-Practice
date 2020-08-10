package strings;

public class AnagramOrderN {

	public static void main(String[] args) {
		

		String a = "aa$%#";
		String b = "$a%a#";
		boolean isAnagram = true;
		
		int[] al = new int[256];
		int[] bl = new int[256];
		
		for(char element : a.toCharArray()) {
			int ascii_val = (int)element;
			al[ascii_val]++;
		}
		
		for(char element : b.toCharArray()) {
			int ascii_val = (int)element;
			bl[ascii_val]++;
		}
		
		for(int i=0;i<256;i++) {
			if(al[i] != bl[i]) {
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram) {
			System.out.println("Anagram!");
		}else {
			System.out.println("Not an Anagram!");
		}
	}

}
