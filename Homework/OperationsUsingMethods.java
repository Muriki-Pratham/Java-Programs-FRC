package Homework;

public class OperationsUsingMethods 
{
	static int addition(int x, int y) 
	{
		return x + y;
	}
	static int subtraction(int x, int y) 
	{
		return x - y;
	}
	static int multiplication(int x, int y) 
	{
		return x * y;
	}
	static int division(int x, int y) 
	{
		return x / y;
	}


	public static void main(String[] args) 
	{
		int sum = addition(4, 2);
		int difference = subtraction(4, 2);
		int product = multiplication(4, 2);
		int quotient = division(4, 2);
		
		System.out.println("4 + 2 = "+sum);
		System.out.println("4 - 2 = "+difference);
		System.out.println("4 * 2 = "+product);
		System.out.println("4 / 2 = "+quotient);

	}

}