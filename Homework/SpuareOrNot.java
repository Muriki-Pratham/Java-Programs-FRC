package Homework;

import java.util.Scanner;
public class SpuareOrNot {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the length of the object?");
		int length = scan.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("What is the width of the object?");
		int width = scan2.nextInt();
		
		int area = length * width;
		
		if (length == width) {
			System.out.println("The object is a square.");
			System.out.print("Area is " + area + ".");
		}
		else
		{
			System.out.println("The object is not a square.");
		}

	}

}
