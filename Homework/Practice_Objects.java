package Homework;

public class Practice_Objects 
{
	   int puppyAge;

	   public void Puppy(String name) 
	   {
	      // This constructor has one parameter, name.
	      System.out.println("Name chosen is : " + name );
	   }

	   public void setAge( int age ) 
	   {
	      puppyAge = age;
	   }

	   public int getAge( ) 
	   {
	      System.out.println("Puppy's age is : " + puppyAge );
	      return puppyAge;
	   }

	   public static void main(String []args) 
	   {
	      /* Object creation */
		   Practice_Objects mypuppy = new Practice_Objects();
		   mypuppy.Puppy("Bob");
		   mypuppy.setAge(1);
		   mypuppy.getAge();

	   }
}