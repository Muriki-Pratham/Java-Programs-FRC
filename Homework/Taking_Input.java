package Homework;

import java.util.Scanner;
public class Taking_Input {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a boolean");
		boolean one = scan.nextBoolean();
		
		System.out.println(one);
		
		System.out.println("Enter a Double");
		double two = scan.nextDouble();
		
		System.out.println(two);
		
		System.out.println("Enter a Float");
		float three = scan.nextFloat();
		
		System.out.println(three);
		
		System.out.println("Enter a Integer");
		int four = scan.nextInt();
		
		System.out.println(four);
		
		System.out.println("Enter a String");
		String five = scan.nextLine();
		
		System.out.println(five);
		
		System.out.println("Enter a Long");
		long six = scan.nextLong();
		
		System.out.println(six);
	}

}
