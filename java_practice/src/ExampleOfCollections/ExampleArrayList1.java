package ExampleOfCollections;

import java.util.ArrayList;
import java.util.List;

public class ExampleArrayList1 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Alka");
		list1.add("Pal");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Abhi");
		list2.add("Book");

        list2.remove("Book");

		list1.addAll(list2);

		for (String list : list1) {
			System.out.println(list);

		}

	}

}
