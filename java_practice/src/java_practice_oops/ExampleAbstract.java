package java_practice_oops;


abstract class Test1{
	
	abstract void add(int a, int b, int c);
	abstract void sub(int a, int b, int c, int d);
	void multi(int a, int b) {
		System.out.println("A");
		}
	}
public class ExampleAbstract extends Test1 {
	void add(int a, int b, int c) {
		System.out.println("Addition");
	}
	void sub(int a, int b, int c, int d) {
		System.out.println("Sub");

	}

	public static void main(String[] args) {
		ExampleAbstract ea = new ExampleAbstract();
		ea.add(2, 3, 0);
		ea.sub(0, 0, 0, 0);
		ea.multi(0, 0);

	}

}
