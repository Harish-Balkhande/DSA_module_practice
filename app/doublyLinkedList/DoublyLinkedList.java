package com.app.doublyLinkedList;

public class DoublyLinkedList {
	Node head;
	Node tail;

	public DoublyLinkedList() {
		this.head = null;
	}
	
	//add at begining
	public void addAtBeg(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;			
		}else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}		
	}
	
	//add at last
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}		
	}
	
	//insert by position
	public void insertByPos(int pos, int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		Node trav = head;
		int travpos = 0;
		while(trav!=null && travpos < pos-1) {
			trav = trav.next;
			travpos++;
		}
		newNode.next = trav.next;		
		trav.next = newNode;
		newNode.prev = trav;
	}
	
	//delete by pos
	public void delByPos(int pos) {
		Node trav = head;
		int travpos = 0;
		if(head == null)
			System.out.println("List is empty");
		else if(pos == 0) {
			head = head.next;
		}
		else {
			while(trav != null && travpos < pos-1) {
				trav = trav.next;
				travpos++;
			}
//			System.out.println("trav : "+trav.data);
			trav.next = trav.next.next;
		}
	}
	
	//print list
	public void printList() {
		if(head == null)
			System.out.println("List is empty");
		Node node = head;
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println();
	}
}
