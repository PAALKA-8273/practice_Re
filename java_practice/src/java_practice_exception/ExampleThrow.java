package java_practice_exception;

public class ExampleThrow {
	public static void validate(int age) {
	
		if(age<18) {
			throw new ArithmeticException("Not Validate for Vote");
		}else {
			System.out.println("Validate for Vote");
		}
	}

	public static void main(String[] args) {
		
		validate(14);
		System.out.println("Write rest of code");

	}

}
