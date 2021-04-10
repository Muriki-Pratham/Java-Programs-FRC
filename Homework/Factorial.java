package Homework;

import java.util.Scanner;

class Factorial 
{

    public static void main(String[] args) 
    {
    	Scanner scan = new Scanner(System.in);
    	
		System.out.println("Enter the number");
		int number = scan.nextInt();

        long fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+ number +" is: "+ fact);
    }
}