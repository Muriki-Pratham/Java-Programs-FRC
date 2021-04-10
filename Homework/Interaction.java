package Homework;

import java.util.Scanner;

public class Interaction {
	
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		String num1 = scan.nextLine();
		System.out.println("Enter the second number:");
		String num2 = scan.nextLine();
		
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		
		
		int addition = a + b;
		int substraction = a - b;
		int multiplication = a * b;
		int division = a / b;
		
		System.out.println("Enter the type of operation(addition, substraction, multiplication, division):");
		String operation = scan.nextLine();
		
		System.out.println(operation);
		
		if (operation == "addition") { 
			System.out.println(addition);
		} 
		else {
			System.out.println("Nope");
		}