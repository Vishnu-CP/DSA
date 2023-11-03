package com.vishnu.interview;

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DoublyLinkedList<String> dll = new DoublyLinkedList();
			dll.insertAtEnd("A");
			dll.insertAtEnd("B");
			dll.insertAtEnd("C");
			//dll.printBackwards();
			dll.printForward();
			
			dll.deleteFirst();
			dll.printForward();
			dll.deleteFirst();
			dll.printForward();
			System.out.println(dll.isEmpty());
			dll.deleteFirst();
			System.out.println(dll.isEmpty());
			dll.printForward();
			dll.deleteFirst();
			dll.printForward();
			dll.deleteFirst();
			dll.printForward();
			System.out.println(dll.isEmpty());
			
	}

}

class DoublyLinkedList<T>{
	
	Node tail ;
	Node head;
	int length;
	
	
	private class Node<T> {
		
		Node next;
		Node prev;
		T data;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	void insertAtBeg(T data) {
		
		Node newNode = new Node(data);
		
		if(tail == null) {
			tail = newNode;
		}else {
			head.prev = newNode;
		}
		
		newNode.next= head;
		head= newNode;
		length++;
	}
	
	void insertAtEnd(T data) {
		
		Node newNode = new Node(data);
		
		if( isEmpty()) {
			head = newNode;
		}else {
			tail.next = newNode;
		}
		
		newNode.prev= tail;
		tail= newNode;
		length++;
	}
	
	
	void deleteFirst() {
		
		if(isEmpty()) {
			return;
		}else if (head == tail) {
			head = null;
			tail = null;
			
		}else {
			
			head = head.next;
			head.prev =null;
		}
		length --;
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return length == 0;
	}

	void printBackwards() {
		
		if(tail == null) {
			return;
		}else {
			Node temp = tail;
			while(temp!= null) {
				System.out.print(temp.data +" --> ");
				temp= temp.prev;
			}
			System.out.println();
		}
	}
	
	void printForward() {
		
		if(head == null) {
			return;
		}else {
			Node temp = head;
			while(temp!= null) {
				System.out.print(temp.data +" --> ");
				temp= temp.next;
			}
			System.out.println();
		}
	}
}
