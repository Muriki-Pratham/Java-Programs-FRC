package Collections;

import java.util.*;
public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<String> Fruit1 = new ArrayList<String>();
		Fruit1.add("Banana");
		Fruit1.add("Apple");
		Fruit1.add("Cherry");
		Fruit1.add("Oranges");
		//Collectios.sort is a predefined library that is located in Java util package that sorts the values of an array list.
		Collections.sort(Fruit1);
		System.out.println(Fruit1);
		
		ArrayList<String> Fruit2 = new ArrayList<String>();
		Fruit2.add("Grapes");
		Fruit2.add("Strawberries");
		Fruit2.add("Mango");
		Fruit2.add("Watermelon");
		
		
		System.out.println(Fruit2);
		Collections.copy(Fruit2, Fruit1);
		System.out.println(Fruit1);
		System.out.println(Fruit2);
	}

}
