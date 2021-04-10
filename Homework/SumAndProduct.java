package Homework;

import java.util.Scanner;
public class SumAndProduct 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("What is the 1st number?");
		int num1 = scan.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.print("What is the 2nd number?");
		int num2 = scan2.nextInt();
		
		int sum = num1 + num2;
		int product = num1 * num2;
		
		System.out.println("The sum of the 2 numbers are: " + sum);
		System.out.println("The product of the 2 numbers are: " + product);

	}

}
