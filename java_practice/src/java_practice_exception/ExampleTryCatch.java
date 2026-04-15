package java_practice_exception;

public class ExampleTryCatch {

	public static void main(String[] args) {
		try {
			System.out.println("befor exception");
			int x=10/0;
			System.out.println("after exception");
			
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		finally {
		System.out.println("Print Exception");
		}
		System.out.println("End of Exception");
	}

}
