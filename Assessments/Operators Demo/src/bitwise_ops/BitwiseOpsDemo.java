package bitwise_ops;

public class BitwiseOpsDemo {

	public static void main(String[] args) {
		System.out.println("Examples of Bitwise Operations:");
		int a = 5;
		int b = 1;
		int c = a&b;
		System.out.println(a + " & " + b + " = " + c);
		int d = a|b;
		System.out.println(a + " | " + b + " = " + d);
		int e = ~ a;
		System.out.println(" ~ " + a + " = " + e);
		int f = a ^ b;
		System.out.println(a + " ^ " + b + " = " + f);
		int g = a << b;
		System.out.println(a + " << " + b + " = " + g);
		int h = a >> b;
		System.out.println(a + " >> " + b + " = " + h);
		int i = a >>> b;
		System.out.println(a + " >>> " + b + " = " + i);
	}
}
