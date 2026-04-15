package conditions;

import java.util.Iterator;

public class ExampleLoop {

	public static void main(String[] args) {
		int shayam=100000;
		
		for(int ram=10000; ram<=shayam; ram=ram+10000) {
			System.out.println("For Loop: "+ram);
		}
		int ram=10000;
		while( ram<=shayam) {
			System.out.println("While Loop: "+ram);
			ram=ram+10000;
		}
		int ram1=10000;
		do {
			System.out.println("Do-While Loop: "+ram1);
			ram1=ram1+10000;
		}while(ram1<=shayam);

	}

}
