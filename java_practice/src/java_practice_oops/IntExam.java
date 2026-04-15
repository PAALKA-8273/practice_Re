package java_practice_oops;

interface AnimalInterface {
	void height();

	void colour();

	void category();

}

class Cow1 implements AnimalInterface {

	@Override
	public void height() {
		System.out.println("Cow is 3 feet");

	}

	@Override
	public void colour() {
		System.out.println("Cow is White");
	}

	@Override
	public void category() {
		System.out.println("Cow is veg");
	}

}

class Dog1 implements AnimalInterface {

	@Override
	public void height() {
		System.out.println("Dog is 2 feet");

	}

	@Override
	public void colour() {
		System.out.println("Dog is White");
	}

	@Override
	public void category() {
		System.out.println("Dog is veg");
	}
}

class Elephant implements AnimalInterface {

	@Override
	public void height() {
		System.out.println("elephant is 6 feet");

	}

	@Override
	public void colour() {
		System.out.println("elephant is White");
	}

	@Override
	public void category() {
		System.out.println("elephant is veg");
	}
}

public class IntExam {

	public static void main(String[] args) {
		Cow1 c = new Cow1();
		c.colour();
		c.category();
		c.height();
		Dog1 d = new Dog1();
		d.category();
		d.colour();
		d.height();
		Elephant e = new Elephant();
		e.category();
		e.colour();
		e.height();

	}

}
