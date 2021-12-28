package com.xworkz.collection.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class TestEmployee {

	public static void main(String[] args) {
		HashMap<Integer, Object> hashmap = new HashMap();

		hashmap.put(101, new Employee("Tejaswini", "Gadag"));
		hashmap.put(102, new Employee("Karishma", "Hubli"));
		hashmap.put(103, new Employee("Mithya", "Belagavi"));
		hashmap.put(104, new Employee("Rachana", "Bangalore"));

		Set<Entry<Integer, Object>> entryset = hashmap.entrySet();
		Iterator<Entry<Integer, Object>> iterator = entryset.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, Object> next = iterator.next();
			System.out.println("EmployeeId: " + next.getKey());
			System.out.println("Employee Object: " + next.toString());
		}
	}

}
