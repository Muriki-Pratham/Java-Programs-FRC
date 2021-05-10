package Collections;

import java.util.HashMap;
public class KeyValueCount {

	public static void main(String[] args) {
		
		HashMap<Integer, String> Colors = new HashMap <Integer, String>();
		
		Colors.put(1, " Blue");
		Colors.put(2, " Green");
		Colors.put(3, " Yellow");
		Colors.put(4, " Purple");
		Colors.put(5, " Red");
		
		System.out.println(Colors.size());
		System.out.println(Colors);
		Colors.clear();
		System.out.println(Colors);

	}

}
