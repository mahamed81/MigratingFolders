package datastructrue;

import datastructrue.LinkedListDemo.Node;

public class Circular {

	Node head;
	Node tail;



	static class Node{
		int data;
		Node next;


		Node(int data){
			this.data= data;
			next=null;
		}


	}
	
	
	
	public void add( int data) {

		Node newNode = new Node(data);
		
			if(head==null) {
				head= tail= newNode;
				newNode.next= head; 
			}
			
			
			
		}
	



	public void display() {
		Node n = head;

		while(n!=null) {

			System.out.println(n.data);
			n=n.next;

		}
	}




	public static void main(String[] args) {

		LinkedListDemo  list = new LinkedListDemo();

		list.head = new Node(20);
		Node sec = new Node(30);
		Node thir = new Node(30);

		list.head.next = sec;
		sec.next = thir;
		thir.next= null;













	}

}
