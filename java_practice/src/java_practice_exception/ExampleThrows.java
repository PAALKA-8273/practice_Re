package java_practice_exception;

public class ExampleThrows {
	
	 void div(int a, int b) throws ArithmeticException {
		 int c= a/b;
		System.out.println("Result: " + c);
	}

	public static void main(String[] args) {
		ExampleThrows eth= new ExampleThrows();
		try {
			eth.div(10, 0); // calling method
        } catch (ArithmeticException e) {
            System.out.println("Exception handled: Cannot divide by zero");
        }
	}

}
