package java_practice_oops;

class Animal {

	void run() {
		System.out.println("Run");
	}

	void eat() {
		System.out.println("Eat");
	}

}

class Dog extends Animal {

	void bark() {
		System.out.println("Bark");
	}
}

public class MainAnimal extends Dog {

	void colour() {
		System.out.println("Black");
	}

	public static void main(String[] args) {
		MainAnimal ma = new MainAnimal();
		ma.run();
		ma.eat();
		ma.bark();
		ma.colour();

	}

}
