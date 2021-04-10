package Homework;

import java.util.Scanner;

public class ArrayReverse 
{

	public static void main(String[] args) 
	{
		
		int num[] = new int[5];
		
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<num.length;i++) 
		{
			System.out.println("Enter a number");
			num[i] = scan.nextInt();
		}
		for(int i=0; i<num.length;i++) 
		{
			//System.out.println(num[i]);
		}
		
		for (int i = num.length-1; i >= 0; i--)
		{
			System.out.println(num[i]);
		}

	}

}
