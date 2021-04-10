package Homework;

public class Main extends Thread 
{
	  public static void main(String[] args) 
	  {
	    Main Code = new Main();
	    Code.start();
	    System.out.println("This line is in the static void class.");
	  }
	  public void run() 
	  {
		for (int i=1; i <= 5;i++) 
		{
			System.out.println("This line is in the void run class and inside a thread. " + i);
		}
	    
	  }
	}