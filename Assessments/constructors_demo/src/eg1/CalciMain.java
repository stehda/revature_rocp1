package eg1;

public class CalciMain {

	public static void main(String[] args) {
		
		Calci c=new Calci("JAVA"); //Constructor call
		System.out.println("Result with c is "+c.add());
		
		
		Calci c1=new Calci(10, 999);
		System.out.println("Result with c1 is "+c1.add());
		
	}
}


// shortcut for comment: Ctrl + /