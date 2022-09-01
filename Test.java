package errorhandling;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=5;
			int b=0;
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
	}

}