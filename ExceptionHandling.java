package errorhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("exception handling demo starts from here.");
		try {
		
		int num =33/0;
		//throws error  java.lang.ArithmeticException: / by zero
		
		int[] arr= {1,2,3,4};
		System.out.println(arr[10]);
		//throws error java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 4
		
		String str =null;
		System.out.println(str.length());
		//java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
		
		}
		
		catch(ArithmeticException e) {
			System.out.println("while dividing denominator should not be zero");
			System.out.println("error :"+e);	
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bounds for length ");
			System.out.println("error :"+e);
		}
		
		catch(NullPointerException e) {
			System.out.println("Cannot invoke \"String.length()\" because \"str\" is null");
			System.out.println("error :"+e);
		}
		finally {  //this block execute even there is error or no error
			System.out.println("this block finally always execute ");
		}
		System.out.println("Demo ends here  ");

	}

}
