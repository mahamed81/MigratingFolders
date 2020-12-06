package collectionsdemo;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
	TreeMap<Integer, Employee> h1  = new TreeMap<Integer, Employee>();
		
		h1.put(101, new Employee("Hibo", 434, "st paul" ));
		h1.put(104, new Employee("Hibo", 434, "st paul" ));
		h1.put(101, new Employee("Joij", 334, "st lous" ));
		h1.put(101, new Employee("Hibo", 434, "st paul" ));
		
		System.out.println(h1);


	}

}
