package ArrayPractice;

public class AddTwoMatrix 
{
	public static void main(String[] args) 
	{
		int[][] x = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] y = {{ 5, 6, 7}, {8, 9,10}, {2,3, 4}};
		
		int[][] multi = new int[3][3];
		int i, j;
		//This for loop is used for reading value of array [x] and [y].
		for(i = 0; i < x.length; i++)
		{
			for(j = 0; j < x[0].length; j++)
			{
				multi[i][j] = x[i][j] + y[i][j];
				//We are adding [x] and [y] array and assign the value to array multi.
			}
		}
		System.out.println("------ The Additionw of two Matrix ------");
		//We are printing the value of the array named multi.
		for(i = 0; i < x.length; i++)
		{
			for(j = 0; j < x[0].length; j++)
			{
				System.out.format("%d \t", multi[i][j]);
			}
			System.out.println("");
		}
	}

}
