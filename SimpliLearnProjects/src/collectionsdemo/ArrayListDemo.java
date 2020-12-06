package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> a1 = new ArrayList<Employee>();
			
		a1.add(new Employee("Hddssan", 202, "St Paul"));
		a1.add(new Employee("Haaassan", 310, "St Paul"));
		a1.add(new Employee("Hasssasawqean", 101, "St Paul"));
		a1.add(new Employee("Haaddasassan", 320, "St Paul"));
	
		
		Collections.sort(a1, new NameComp());
		for(Employee ob: a1) {
			System.out.println(ob);

		}
		
		
		
		
		
	}

}
