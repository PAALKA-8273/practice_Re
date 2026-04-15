package java_practice_oops;

class A {

	void text() {
		System.out.println("Hello");
	}
}

class B extends A {

	void text1() {
		System.out.println("Hi");
	}
}

public class ExampleInheritance01 extends B {

	public static void main(String[] args) {
		ExampleInheritance01 ex = new ExampleInheritance01();
		ex.text();
		ex.text1();
	}

}
