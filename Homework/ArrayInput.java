package Homework;

import java.util.Scanner;
public class ArrayInput 
{
	public static void main(String[] args) 
	{
		//15 is the size of the array. It starts from index 0 to index 14
		int num[] = new int[15];
		
		Scanner scan = new Scanner(System.in);
		//This for loop is used to reading the input from the user
		for (int i=0; i<num.length;i++) 
		{
			System.out.println("Enter a number");
			num[i] = scan.nextInt();
		}
		//This for loop is used to print out the inputs
		for(int i=0; i<num.length;i++) 
		{
			System.out.println(num[i]);
		}
	}

}
