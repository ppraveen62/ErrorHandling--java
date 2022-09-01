package errorhandling;

public class ThrowsDemo {

	void Division() throws ArithmeticException {
		System.out.println("Base Exception class");
	
		int a=25,b=0,rs;
		rs=a/b;
		System.out.println("\n\tResult:"+rs);
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsDemo t=new ThrowsDemo();

		try {
		t.Division();
		}
		catch(ArithmeticException e) {
			System.out.println("\n\tError:"+e.getMessage());
		}
		System.out.println("\n\tEnd of Program");
	}

}