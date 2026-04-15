package java_practice_oops;

abstract class Abst {

	abstract void text();

	abstract void msg();

}

public class EampleAbs extends Abst {

	void text() {
		System.out.println("Hello text");
	}

	void msg() {
		System.out.println("Hello msg");
	}

	public static void main(String[] args) {
		EampleAbs ea2 = new EampleAbs();
		ea2.text();
		ea2.msg();

	}

}
