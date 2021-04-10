package Homework;

public class LargestAndSmallestNumInArray {

	public static void main(String[] args) {
		
		int[] num = new int[] {5,8,2,10,1,12};
		
		/*for(int i = 0; i<numArray.length; i++) 
		{
			//System.out.print("Original Array Number Order:");
			//System.out.println(numArray[i]);
		}*/
		
		int temp;
		for (int i=0; i<num.length;i++) 
		{
			for (int y=i; y<num.length;y++) 
			{
				if (num[i] > num[y]) 
				{
					temp = num[i];
					num[i] = num[y];
					num[y] = temp;
				}
			}
		}
		
		System.out.println("The smallest number in the array is: " + num[0]);
		System.out.println("The largest number in the array is: " + num[5]);
	}

}
