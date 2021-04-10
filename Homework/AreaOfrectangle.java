package Homework;

import java.util.Scanner;
public class AreaOfrectangle 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the length of the rectangle?");
		double length = scan.nextDouble();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("What is the width of the rectangle?");
		double width = scan2.nextDouble();
		
		
		double area = length * width;
		
		
		System.out.println("The area of the rectangle is " + area);

	}

}
