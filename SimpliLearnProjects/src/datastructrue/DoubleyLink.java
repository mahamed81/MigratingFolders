package datastructrue;

import datastructrue.LinkedListDemo.Node;

public class DoubleyLink {
	Node head = null;
	Node tail = null ;


	static class Node{
		int data;
		Node next;
		Node prev;


		Node(int data){
			this.data= data;
			next=null;
		}

	}

	public void add( int data) {

		Node newNode = new Node(data);

		if(head==null) {

			head=tail= newNode;

			head.prev=null;
			tail.next= null;		

		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail= newNode;
			tail.next = null;
		}
	}


	public void display() {
		Node curr = head;
		
		
		
		if(head==null) {
			System.out.println(" list is empty");
		}

		while(curr!=null) {

			System.out.println(curr.data);
			curr= curr.next;

		}
	}


	public static void main(String[] args) {

		DoubleyLink  list = new DoubleyLink();
		
		list.add(30);
		list.add(30);
		list.add(30);
		
		
		list.display();


	}	


}