package collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		

		List fruits = new ArrayList();
		
		fruits.add("Apple");
		fruits.add(13);
		
		System.out.println(fruits);
		
		List<String> fruitsString = new ArrayList();
		fruitsString.add("Apple");
		fruitsString.add("Banana");
		
		System.out.println(fruitsString);
		
		Pair<String,Integer> p1 = new Pair("Anuj",13);
		Pair<Boolean,Double> p2 = new Pair(true,13.123);
		
		p1.getDescription();
		p2.getDescription();
		
		
		List<String> vegetables = new LinkedList();
		
		vegetables.add("Potato");
		vegetables.add("Tomato");
		
		
		fruitsString.addAll(vegetables);
		
		System.out.println(fruitsString);
		
		System.out.println(fruitsString.get(1));
		System.out.println(fruitsString.set(1,"Litchy"));
		
		System.out.println(fruitsString);
		System.out.println(fruitsString.size());
		
		String[] temp = new String[fruitsString.size()];
		
		fruitsString.toArray(temp);
		
		for(String e:temp)System.out.println(e);

	}

}
