package example_constructor;

public class Example1 {
	
	void add() {
		System.out.println("2+3");
	}
	
	 Example1(){
		 System.out.println("Inside the const");
	 }

	public static void main(String[] args) {
		Example1 e=new Example1();
		

	}

}
