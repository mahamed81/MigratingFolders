package datastructrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.text.html.HTMLDocument.Iterator;

public class QueueDemo {

	public static void main(String[] args) {
		
		
		Queue<Student>  que= (Queue<Student>) new ArrayList<Student>();
		
		que.add(new Student("hassan", "st paul", 2323, "Math"));
		
		que.add(new Student("ali", "st paul", 2333, "Math"));

		que.add(new Student("abdi", "st paul", 4423, "science"));

		

		
		Collections.sort(que);
		
		
		for(Student st: que) {
			
			System.out.println(st);
			
		}



		
		
		

	}

}
