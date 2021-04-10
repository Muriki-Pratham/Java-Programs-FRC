package Homework;

import java.util.Scanner;
public class BiggestNumber 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the 1st number?");
		int num1 = scan.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("What is the 2nd number?");
		int num2 = scan2.nextInt();
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("What is the 3rd number?");
		int num3 = scan3.nextInt();
		
		if (num1 > num2) 
		{
			if (num1 > num3) 
			{
				System.out.print(num1 + " is the biggest of the 3 numbers.");
			} 
			else 
			{
				System.out.print(num3 + " is the biggest of the 3 numbers.");
			}
		} 
		else 
		{
			if (num2 > num3) 
			{
				System.out.print(num2 + " is the biggest of the 3 numbers.");
			} 
			else 
			{
				System.out.print(num3 + " is the biggest of the 3 numbers.");
			}
		}

	}

}
