package Homework;

import java.util.Scanner;
public class OddOrEven 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the number?");
		int num = scan.nextInt();
		
		
		if (num%2 == 0) 
		{
			System.out.println(num + " is even.");
		} 
		else 
		{
			System.out.println(num + " is odd");
		}

	}

}
