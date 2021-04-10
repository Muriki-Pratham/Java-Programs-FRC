package Homework;

import java.util.Scanner; //Scanner is a function inside Java.util library to accept input from user

class IfLoops 
{

	public static void main(String[] args) //body of main function
	{
		
		//int n = 100;
		Scanner scan = new Scanner(System.in); //System.in is used to accept inputs in console from user to keyboard
		
		System.out.println("Enter your grade");
		String a = scan.nextLine();
		
		int b = Integer.parseInt(a);
		
		if (b >= 70) //body of IF condition
		{
			System.out.println("You Passed!!!");
		}
		else 
		{
			System.out.println("You didn't pass :(");
		}
	}

}
