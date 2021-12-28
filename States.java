package com.xworkz.collection.Steamer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class States {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap();
		hashmap.put(1, "Karnataka");
		hashmap.put(2, "Andra-Pradesh");
		hashmap.put(3, "Tamil nadu");
		hashmap.put(4, "Madhya pradesh");
		hashmap.put(5, "Bihar");
		hashmap.put(6, "Gujarath");
		Set<Entry<Integer, String>> entryset = hashmap.entrySet();
		Iterator<Entry<Integer, String>> iterator = entryset.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			System.out.println("Key: " + next.getKey());
			System.out.println("Value: " + next.getValue());
		}
	}
}
