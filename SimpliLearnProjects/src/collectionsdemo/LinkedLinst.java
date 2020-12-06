package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedLinst {
	
	
public static void main(String[] args) {
		
		LinkedList<Employee> a1 = new LinkedList<Employee>();
			
		a1.add(new Employee("Hddssan", 202, "St Paul"));
		a1.add(new Employee("Haaassan", 310, "St Paul"));
		a1.addFirst(new Employee("Hasssasawqean", 101, "St Paul"));
		a1.addLast(new Employee("Haaddasassan", 320, "St Paul"));
	
		
		Collections.sort(a1, new NameComp());
		for(Employee ob: a1) {
			System.out.println(ob);

		}
		
		
		
		
		
	}

}
