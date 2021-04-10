package Homework;

import java.util.Scanner;
public class ReverseString 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string");
		String original = scan.nextLine();
		
		for (int i = original.length(); i > 0; i--)
		{
			System.out.print(original.charAt(i-1));
		}
		
		
	}

}
