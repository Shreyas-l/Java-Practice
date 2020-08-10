package strings;

public class StringIntro {

	public static void main(String[] args) {
		

		String myName = "Shreyas Labhsetwar";     // Creating string using Literal : StringPoolArea
		String myName2 = "Shreyas Labhsetwar";
		
		String anotherName = new String("Shreyas Labhsetwar");  //FORCEFULLY CREATING A NEW STRING OBJECT : HeapArea
		
		System.out.println(myName);
		System.out.println(anotherName);
		
		System.out.println(myName == anotherName);  //DIFFERENT OBJECTS
		System.out.println(myName == myName2);      //SAME OBJECTS
		
		//STRING FUNCTIONS
		
		System.out.println(myName.charAt(5));
		System.out.println(myName.indexOf('a'));
		System.out.println(myName.length());
		System.out.println(myName.substring(5));
		System.out.println(myName.substring(5,10));
		System.out.println(myName.contains("ABC"));
		System.out.println(myName.equals(anotherName));
		System.out.println(myName.isEmpty());
		System.out.println(myName.concat("HAHAHAHH"));
		System.out.println(myName.replace("S","s"));
		
		String[] fname = myName.split(" ");
		for(String item:fname) {
			System.out.println(item);
		}
		
		
		System.out.println(myName.toLowerCase());
		System.out.println(myName.toUpperCase());
		System.out.println(myName.trim());
		

	}

}
