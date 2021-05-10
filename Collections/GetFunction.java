package Collections;

import java.util.*;
public class GetFunction 
{

	public static void main(String[] args) 
	{
		List<String> Names = new ArrayList<String>();
		Names.add("Pratham");
		Names.add("Amit");
		Names.add("Purvi");
		Names.add("Brayden");
		
		System.out.println(Names.get(2));
		//Collections.reverse is a predefined function that comes with the java.util package
		Collections.reverse(Names);
		System.out.println(Names);
		
		Collections.shuffle(Names);
		System.out.println(Names);		
				
	}

}
