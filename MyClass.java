package errorhandling;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[10];
		try {
			array[7]=100;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of the bounds");
		}
		finally {
			System.out.println("The size of the array:"+array.length);
		}
	}

}