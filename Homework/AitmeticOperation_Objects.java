package Homework;

public class AitmeticOperation_Objects {
	
	int d;
	int e;
	int a;
	public void addition(int x, int y) {
	int z = x + y;
	System.out.println (x + " + " + y + " = " + z);
	}
	public void setSub(int b, int c) {
		int d = b;
		System.out.println(d);
		int e = c;
		System.out.println(e);
		int a = b - c;
		System.out.println(a);
		System.out.println(d + " - " + e + " = " + a);
		}
	public int getSub() {
		
		System.out.println(d + " - " + e + " = " + a);
		return a;
	}
	
	

	public static void main(String[] args) {
		
		AitmeticOperation_Objects Math = new AitmeticOperation_Objects();
		Math.addition(5, 7);
		Math.setSub(3, 2);
		Math.getSub();
		

	}
}

