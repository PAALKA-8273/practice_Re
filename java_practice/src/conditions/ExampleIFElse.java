package conditions;

public class ExampleIFElse {

	public static void main(String[] args) {

		int deepak = 20;
		int shayam = 18;

		if (deepak > shayam) {

			System.out.println("Deepak is elder than shayam");
			if(deepak>15 && deepak<25) {
				System.out.println("Deepak ki age 15-25");
			}else {
				System.out.println("Deepak ki age 25 se jada");
			}
		} else {
			System.out.println("Deepak is younger than shayam");
		}
		

	}

}
