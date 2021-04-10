package Homework;

import java.util.Scanner;
public class Grades2 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your grade?");
		int grade = scan.nextInt();
		
		if (grade > 80) 
		{
			System.out.print("good job on getting A in your class.");
		} else if (grade > 60) {
			System.out.print("good job on getting B in your class.");
		} else if (grade > 50) {
			System.out.print("good job on getting C in your class.");
		} else if (grade > 45) {
			System.out.print("good job on getting D in your class.");
		} else if (grade > 25) {
			System.out.print("good job on getting E in your class.");
		} else if (grade > 0) {
			System.out.print("good job on getting F in your class.");
		}

	}

}
