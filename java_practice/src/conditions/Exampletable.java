package conditions;

public class Exampletable {

	public static void main(String[] args) {
		/*
		 * int num = 5; for (int i = 1; i <= 10 ; i++) { int mult =num*i;
		 * System.out.println(mult); }
		 */
		/*
		 * int j = 1; int num =5; while( j <= 10) { int mult =num*j;
		 * System.out.println(mult); j++; }
		 */
		int j = 1;
		int num = 5;
		do {
			int mult = num * j;
			System.out.println(mult);
			j++;
		} while (j <= 10);
	}

}
