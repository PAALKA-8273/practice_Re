package example_constructor;

class Animal2 {
	Animal2() {
		this(2, 4);
		System.out.println("Animal constructor");
	}

	Animal2(int x, int y) {

		System.out.println("Parameterized Dog constructor");
	}
}

public class ExampleThisAndSupper extends Animal2 {

	ExampleThisAndSupper() {
		this(10); // calls another constructor

		System.out.println("Default Dog constructor");

	}

	ExampleThisAndSupper(int x) {
		super(); // calls Animal constructor
		System.out.println("Parameterized Dog constructor");
	}

	public static void main(String[] args) {
		ExampleThisAndSupper d = new ExampleThisAndSupper();
	}

}
