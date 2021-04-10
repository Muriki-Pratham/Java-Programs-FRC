package Homework;

import java.util.Scanner;
public class Vowels 
{

	public static void main(String[] args) 
	{
		int i = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the letter you want to check?");
		char letter = scan.next().charAt(0);
		
		
		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') 
		{
			System.out.println("The letter you typed is a vowel: " + letter);
			
		} 
		else 
		{
			System.out.println("The letter is a consonant: " + letter);
		}
			

	}

}
