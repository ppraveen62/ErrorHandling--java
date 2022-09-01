package errorhandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int[] a=new int[5];
			//a[5]=30/0;
			//System.out.println(a[10]);
			String s=null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Occurred");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of the bounds");
		}
		catch(Exception e) {
			System.out.println("Base Exception class");
		}
	}

}