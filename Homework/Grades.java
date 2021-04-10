package Homework;

import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your grade in your 1st class?");
		int num1 = scan.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("What is your grade in your 2nd class?");
		int num2 = scan2.nextInt();
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("What is your grade in your 3rd class?");
		int num3 = scan3.nextInt();
		
		int num4 = num1 + num2 + num3;
		int total = num4/3;
		
		System.out.println("This is your total average grade: " + total);
		

	}

}
