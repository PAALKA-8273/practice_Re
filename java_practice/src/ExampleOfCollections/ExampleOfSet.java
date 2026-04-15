package ExampleOfCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleOfSet {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(4);
		s.add(5);
		s.add(7);
		s.add(4);
		for (Integer integer : s) {
			System.out.println(integer);
		}

		Set<Integer> s2 = new LinkedHashSet<Integer>();
		s2.add(8);
		s2.add(9);
		s2.add(10);
		for (Integer integer : s2) {
			System.out.println(integer);
		}

	}

}
