package conditional_ops;

public class ConditionalOpsDemo {

	public static void main(String[] args) {
		System.out.println("Conditional Operators Demo");
		int a = 5;
		int b = 7;
		
		//System.out.println("a = "+a);
		//System.out.println("b = "+b);
				
		System.out.println("\nEquality Operator (==):");
		System.out.println(a+" is equal to "+b+"? " + (a==b));
		
		System.out.println("\nNot Equal To Operator (!=):");
		System.out.println(a+" is not equal to "+b+"? " + (a!=b));
		
		System.out.println("\nGreater Than Operator (>):");
		System.out.println(a+" is greater than "+b+"? " + (a>b));
		
		System.out.println("\nLess Than Operator (<):");
		System.out.println(a+" is less than "+b+"? " + (a<b));
		
		System.out.println("\nGreater Than or Equal To Operator (>=):");
		System.out.println(a+" is greater than or equal to "+b+"? " + (a>=b));
		
		System.out.println("\nLess Than or Equal To Operator (<=):");
		System.out.println(a+" is less than or equal to "+b+"? " + (a<=b));
		
	}
}
