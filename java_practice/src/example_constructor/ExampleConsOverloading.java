package example_constructor;

public class ExampleConsOverloading {

	String name; // declare
	int age;

	// Constructor 1 (no parameter)
	ExampleConsOverloading() {
		name = "Unknown";
		age = 0;
	}

	// Constructor 2 (one parameter)
	ExampleConsOverloading(String n) {
		name = n;
		age = 18;
	}

	// Constructor 3 (two parameters)
	ExampleConsOverloading(String n, int a) {
		name = n;
		age = a;
	}

	void display() {
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
		ExampleConsOverloading s1 = new ExampleConsOverloading();
		ExampleConsOverloading s2 = new ExampleConsOverloading("Anant");
		ExampleConsOverloading s3 = new ExampleConsOverloading("Rahul", 22);

		s1.display();
		s2.display();
		s3.display();
	}
}
