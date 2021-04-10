package Homework;

public class Arithmetic_Operators {

	public static void main(String[] args) {
		
		int a = 101;
		int b = 100;
		
		System.out.println("The sum is: " + (a+=b));
		System.out.println("The difference is: " + (a-=b));
		System.out.println("The product is " + (a*=b));
		System.out.println("The quotient is " + (a/=b));
		System.out.println("The reminder is " + (a%=b));
		System.out.println("comparision = " + (a == b));
		System.out.println("comparision = " + (a != b));

	}

}
