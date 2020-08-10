package strings;

public class AnagramNextLevel {

	public static void main(String[] args) {
		

		String a = "^aa$%#1 2 3";
		String b = "$a%a#^3 2 1";
		boolean isAnagram = true;
		
		int[] al = new int[256];
		
		for(char element : a.toCharArray()) {
			int ascii_val = (int)element;
			al[ascii_val]++;
		}
		
		for(char element : b.toCharArray()) {
			int ascii_val = (int)element;
			al[ascii_val]--;
		}
		
		for(int i=0;i<256;i++) {
			if(al[i] != 0) {
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
