package java_practice_oops;

class Over {
	int add(int a, int b) {
		return a + b;

	}

	int add(int a, int b, int c) {
		return a + b + c;

	}

	int add(int a, int b, int c, int d) {
		return a + b + c + d;

	}
}

public class ExampleOverloading extends Over {

	int add(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;

	}

	public static void main(String[] args) {
		ExampleOverloading eo = new ExampleOverloading();
		System.out.println(eo.add(2, 3, 4, 5));
		
		System.out.println(eo.hashCode());

	}

}
