package assignment;

import java.util.*;
import java.util.Map.Entry;

public class Assign15 {

	public static void main(String[] args) {

		// Write a program to sort a map by value.
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"c");
		map.put(5, "z");
		map.put(2, "a");
		map.put(3, "d");
		map.put(10, "b");
		System.out.println("Unsorted map is \n "+map);
		
		List<Entry<Integer, String>> list = new ArrayList<Entry<Integer, String>>(map.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<Integer, String>>() {
			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
				String value = o1.getValue();
				String value2 = o2.getValue();
				return (value.compareTo(value2));
			}
		});
		
		System.out.println(list);
		
		Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();
		for (Entry<Integer, String> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println("Sorted map is \n "+sortedMap);
	}
}
