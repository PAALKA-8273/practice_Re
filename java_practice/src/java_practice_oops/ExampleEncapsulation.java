package java_practice_oops;

class Student {

	private String name;
	private int rollNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

}

public class ExampleEncapsulation {

	public static void main(String[] args) {

		Student s = new Student();
		s.setName("Alka");
		s.setRollNumber(10);
		System.out.println(s.getName() + " : " + s.getRollNumber());
	}

}
