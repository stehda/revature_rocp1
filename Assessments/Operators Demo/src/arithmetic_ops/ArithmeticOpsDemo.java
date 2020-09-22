package arithmetic_ops;

public class ArithmeticOpsDemo {

	static int a = 1234;
	static int b = 99;
	
	public static void main(String[] args) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int s = a + b;
		System.out.println("The sum of " + a + " and " + b + " is : " + s);
		int d = a - b;
		System.out.println("The difference of " + a + " and " + b + " is : " + d);
		int p = a * b;
		System.out.println("The product of " + a + " and " + b + " is : " + p);
		int q = a / b;
		System.out.println("The quotient of " + a + " and " + b + " is : " + q);
		int r = a % b;
		System.out.println("The quotient of " + a + " and " + b + " is : " + r);
		int incr = ++a;
		System.out.println("a + 1 = " + incr);
		int decr = --b;
		System.out.println("b - 1 = " + decr);
		System.out.println("The value of a is now : " + a);
		System.out.println("The value of b is now : " + b);
		a += b;
		System.out.println("a += b in Java equals " + a);
		System.out.println("The value of a is now " + a + " and the value of b is " + b + ".");
		a -= b;
		System.out.println("a -= b in Java equals " + a);
	}
}
