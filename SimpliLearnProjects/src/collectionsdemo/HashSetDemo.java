package collectionsdemo;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class HashSetDemo {
	public static void main(String[] args) {
			
			HashSet<Employee> a1 = new HashSet<Employee>();
				
			a1.add(new Employee("H", 202, "St Paul"));
			a1.add(new Employee("H", 31, "St Paul"));
			a1.add(new Employee("H", 310, "St Paul"));

			
		
			
			for(Employee ob: a1) {
				System.out.println(ob);
	
			}
			
			
			
			
			
		}
}
