package Homework;

import java.util.Scanner;
public class IfLoopsString 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in a word");
		String word = scan.nextLine();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("type in another word");
		String word2 = scan2.nextLine();
		
		//word = "JAVA";
		
		boolean areTwoStringsEqual = word.equals(word2);
		
		System.out.print("We are comparing 2 strings. " + areTwoStringsEqual);
		
	
	
	}
}