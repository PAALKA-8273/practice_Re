package ExampleOfCollections;

import java.util.HashMap;
import java.util.Map;

public class ExampleOfMap {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(01, "Alka");
		m.put(02, "Pal");
		m.put(03, "Abhi");
		m.put(01, "Anant");
		for (Map.Entry<Integer, String> entry : m.entrySet()) {
			int key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " " + val);

		}

	}

}
