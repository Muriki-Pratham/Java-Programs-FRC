package Homework;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile 
{
  public static void main(String[] args) 
  {
    try 
    {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!\n");
      myWriter.write("This is the second line of the file.\n");
      myWriter.write("This is the third line of the file.");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } 
    catch (IOException e) 
    {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
  }

