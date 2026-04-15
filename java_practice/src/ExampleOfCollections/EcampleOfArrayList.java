package ExampleOfCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EcampleOfArrayList {
	
	

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Alka");
		arrayList.add("Pal");
		for (String fullName : arrayList) {
			System.out.println(fullName);
			
		}
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		
	}

}
