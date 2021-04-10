package Homework;

public class AscendingOrderString 
{

	public static void main(String[] args) 
	{
		int[] numArray = new int[] {4,85,2,7,9,20};
		for(int i = 0; i<numArray.length; i++) 
		{
			//System.out.print("Original Array Number Order:");
			//System.out.println(numArray[i]);
		}
		int temp;
		for (int i=0; i<numArray.length;i++) 
		{
			for (int j=i; j<numArray.length;j++) 
			{
				if (numArray[i] > numArray[j]) 
				{
					temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;
				}
			}
		}
		//variable a is a temporary variable which will iterate based on the number of elements assigned to numArray
		for (int a : numArray) 
		{
			//System.out.print("Array After Numbers Are Ordered Ascending:");
			System.out.println(a);
		}
	}

}
