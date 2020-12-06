package collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, ArrayList<Employee>> h1  = new HashMap<Integer, ArrayList<Employee>>();
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("Fardosa", 2323, "St Paul"));
		list.add(new Employee("Abowe", 2313, "St Paul"));
		list.add(new Employee("Cade", 1114, "St Paul"));
		
		h1.put(232, new ArrayList<Employee>(Arrays.asList(new Employee("Fardosa", 2323, "St Paul"))));

		
	}

}
