package Homework;

import java.util.Scanner;

public class Boolean_Practice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" x > y");
		
		System.out.println("Enter value for x:");
		String first = scan.nextLine(); 
		
		System.out.println("Enter value for y:");
		String second = scan.nextLine(); 
		
		int Num1 = Integer.parseInt(first);
		int Num2 = Integer.parseInt(second);
		
		System.out.print( first + " > " + second + " is " );
		System.out.print( Num1 > Num2);


	}

}
