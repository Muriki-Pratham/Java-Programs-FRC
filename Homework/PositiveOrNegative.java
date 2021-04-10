package Homework;

import java.util.Scanner;
public class PositiveOrNegative 
{

	public static void main(String[] args) 
	
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the number?");
		int num = scan.nextInt();
		
		if (num > 0) 
		{
			System.out.println(num + " is positive.");
		} 
		else 
		{
			System.out.println(num + " is negative");
		}
	}

}
