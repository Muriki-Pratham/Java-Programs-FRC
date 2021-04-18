package ArrayPractice;

import java.util.Scanner;

public class JavaProgram
{
   public static void main(String args[])
   {
       //declaring the row and column value of the array
	   int row, col, i, j;
	   //we are taking array of integer type. Two square brackets indicate that the array is 2 dimension
       int arr[][] = new int[10][10]; //random size of row and column I have taken
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Number of Row for Array (max 10) : ");
       row = scan.nextInt(); //accepting the number of rows from user
       System.out.print("Enter Number of Column for Array (max 10) : ");
       col = scan.nextInt(); //accepting the number of columns from user
	   //Reading the value from user
       System.out.print("Enter " +(row*col)+ " Array Elements : ");
       for(i=0; i<row; i++) //outer FOR loop is for the rows
       {
    	   //this FOR loop will run till condition becomes false to print all values
           for(j=0; j<col; j++) //inner FOR loop is for the columns
           {
        	   //this instruction is used to read input from user in the array
               arr[i][j] = scan.nextInt();
           }
       }
	   //printing the value of the array
       System.out.print("The Array is :\n");
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               System.out.print(arr[i][j]+ "  ");
           }
           System.out.println();
       }
   }
}