package Homework;

import java.util.Scanner;

public class AritmeticThread {
	 public static void main(String[] args) 
	  {
	    Main Code = new Main();
	    Code.start();
	    System.out.println("This line is in the static void class.");
	  }
	  public void run() 
	  {
		for (int i=1; i <= 5;i++) 
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter first number");
			int num1 = scan.nextInt();
			System.out.println("Enter second number");
			int num2 = scan.nextInt();
			int num3 = num1 + num2;
			System.out.print(num1 +" + "+ num2 + "= "+ num3);
		}
	    
	  }
	}

