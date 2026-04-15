package java_practice_oops;

class Test {

	int add(int a, int b) {
		int c = a + b;
		return c;

	}

}

public class ExampleOverriding extends Test {

	int add(int a, int b) {
		int c = a * b;
		return c;

	}

	public static void main(String[] args) {
		ExampleOverriding eor = new ExampleOverriding();
		System.out.println(eor.add(2, 3)); // jvm

	}

}
