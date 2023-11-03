package com.vishnu.interview;

public class CircularLinkedListTest {
	
	public static void main(String[] args) {
		
		CircularLinkedList<Integer> cl = new CircularLinkedList();
		cl.insertAtBeg(100);
		cl.insertAtBeg(200);
		cl.printCLL();
	}

}

class CircularLinkedList<T>{
	
	Node<T> last;
	
	
	private class Node<T>{
		
		T data;
		Node<T> next;
		
		Node(T data){
			this.data = data;
		}
	}
	
	void printCLL(){
		
		if(last == null)
			return;
		Node temp = last.next;
		while(temp != last) {
			System.out.print(temp.data +" --> ");
			temp = temp.next;
		}
		System.out.print(temp.data +" --> ");
		System.out.println();
	}
	
	void insertAtBeg(T data) {
		
		if(last == null) {
			last = new Node(data);
			last.next = last;
		}else {
			Node newNode = new Node(data);
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
	}
}
