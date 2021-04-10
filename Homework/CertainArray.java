package Homework;

public class CertainArray 
{

	public static void main(String[] args) 
	{
		
		int[] num = new int[] {23,87,5,0,234,6845,-2};
		
		int pos = 0;
		int neg = 0;
		int even = 0;
		int odd = 0;
		int zero = 0;
		
		
		
		for (int i = 0; i < num.length; i++ ) 
		{
			if (num[i] > 0) 
			{
				pos = pos + 1;
			}
			if (num[i] < 0) 
			{
				neg = neg + 1;
			}
			if (num[i]%2 == 0) 
			{
				even = even + 1;
			}
			if (num[i]%2 == 1) 
			{
				odd = odd + 1;
			}
			if (num[i] == 0) 
			{
				zero = zero + 1;
			}
				
			
		}
		System.out.println("The number of positive numbers: " + pos);
		System.out.println("The number of negative numbers: " + neg);
		System.out.println("The number of even numbers: " + even);
		System.out.println("The number of odd numbers: " + odd);
		System.out.println("The number of numbers that equal zero: " + zero);
		
	}

}
