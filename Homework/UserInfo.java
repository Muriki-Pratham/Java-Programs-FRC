package Homework;

import java.util.Scanner;
public class UserInfo 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.nextLine();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("What is your roll number?");
		int num = scan2.nextInt();
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("What is your field of interest?");
		String interest = scan3.nextLine();
		
		System.out.println("Hey, my name is " + name + " and my roll number is " + num + ". My field of interest is " + interest + ".");
	}

}
