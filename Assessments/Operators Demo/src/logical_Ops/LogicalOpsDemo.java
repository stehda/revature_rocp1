package logical_Ops;

public class LogicalOpsDemo {

	 public static void main(String[] args) {
		
		 int x = 4;
		 if (x < 5 && x < 20) {
			 System.out.println("x is less than 5 and less than 20");
		 } else {
			 System.out.println("x is not less than 5 and less than 20");
		 }
		 if (x < 10 || x < 5) {
			 System.out.println("x is less than 10 or less than 5");
		 } else {
			 System.out.println("x is not less than 10 or less than 5");
		 }
		 System.out.println(!(x < 5 && x < 10)); 		 
	}
}
