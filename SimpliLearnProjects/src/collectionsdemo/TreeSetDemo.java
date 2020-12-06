package collectionsdemo;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<Employee> a1 = new TreeSet<Employee>();
			
		a1.add(new Employee("Hddssan", 202, "St Paul"));
		a1.add(new Employee("Haaassan", 310, "St Paul"));
		a1.add(new Employee("Haaassan", 310, "St Paul"));


	
		
		for(Employee ob: a1) {
			System.out.println(ob);

		}
		
		
		
		
		
	}


}
