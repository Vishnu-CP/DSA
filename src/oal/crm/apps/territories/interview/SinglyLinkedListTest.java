package oal.crm.apps.territories.interview;

import java.util.concurrent.Delayed;

class Node<N>  implements Comparable<N>{

	N data;
	Node<N> next;

	Node(N data, Node<N> next) {
		this.data = data;
		this.next = next;

	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

	@Override
	public int compareTo(N o) {
		// TODO Auto-generated method stub
		
		if(o instanceof Integer)
				
			return  ((Integer)this.data).compareTo((Integer)o) ;
		else 
			return 0;
		
	}

}

class LinkedList<N> {

	Node<N> head;

	public void add(N data) {

		if (head == null) {
			head = new Node(data, null);
		} else {
			Node<N> temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(data, null);
			;

		}
	}

	public void addAtIndex(int index, N data) {

		int count = 0;

		Node temp = head;

		if (index == 0) {

			Node n = new Node(data, temp);
			head = n;

		} else {

			while (count + 1 < index && temp.next != null) {
				count++;
				temp = temp.next;

			}
			Node n = new Node(data, temp.next);
			temp.next = n;

		}

		System.out.println("data" + temp.data);
		System.out.println("Count " + count);

	}

	public void print() {
		Node<N> temp = head;

		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

	public Node<N> deleteFirst() {

		if (head == null)
			return null;
		Node temp = head;
		head = head.next;
		temp.next = null;
		return temp;

	}

	public Node<N> deleteLast() {

		if (head == null)
			return null;
		else if (head.next == null) {
			Node temp = head;
			head = null;
			return temp;
		}

		Node cur = head;
		Node prev = null;

		while (cur.next != null) {

			prev = cur;
			cur = cur.next;
		}

		prev.next = null;
		return cur;

	}

	public Node deleteAtIndex(int index) {

		if (index == 0) {
			Node temp = head;
			head = head.next;
			temp.next = null;
			return temp;
		} else {
			int count = 0;
			Node temp = head;
			while (count + 1 < index) {
				temp = temp.next;
				count++;

			}

			Node current = temp.next;
//			if(temp.next != null) {
			temp.next = current.next;
//			}else {
//				temp.next = null;
//			}

			return current;
		}
	}

	public void reverseLinkedList() {

		Node cur = head;
		Node prev = null;
		Node next = null;

		while (cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		head = prev;
	}
	
	public Node<N> findMidOfLinkedList(){
		
		if(head == null)
			return null;
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
		
	}
	
	public Node findNthFromEndofLinkedList(int n) {
		
		Node slow= head;
		Node cur= head;
		int count= 1;
		
		while(cur != null) {
			
			if(count++ <= n)
				cur= cur.next;
			else 
			{
				cur= cur.next;
				slow= slow.next;
				
			}
		}
		
		return slow;
		
	}
	
	public  void   removeDuplicatesInLL() {
		
		Node cur = head;
		Node next = null;
		
		while(cur.next != null) {
			next =  cur.next;
			if(cur.data == next.data) {
				cur.next= next.next;
			}else {
				cur= cur.next;
			}
		}
		
	}
	
	public void insertInsorted(int data) {
		
		if(head == null) return ;
		
		
			Node<N> cur=head;
			Node prev = null;
			
			Node newNode = new Node(data, null); 
			System.out.println(  data < (int)cur.data) ;
		
		while(cur != null &&  (int)cur.data < data ){
			prev= cur;
			cur= cur.next;
		}
		
		if(prev == null) {
			newNode.next= head;
			head = newNode;
		}else {
			newNode.next = cur;
			prev.next=newNode;
		}
		
		
		
		
		
		
		
		
	}

}

public class SinglyLinkedListTest {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(40);
		ll.add(50);
		ll.add(50);
		

		ll.print();
//		System.out.println("======");
//		System.out.println(ll.deleteFirst());
//		System.out.println(ll.deleteFirst());	
//		System.out.println(ll.deleteFirst());
//		System.out.println("======");
//		ll.print();
//		System.out.println("======");
//		System.out.println(ll.deleteLast());
//		System.out.println(ll.deleteLast());
//		System.out.println(ll.deleteLast());
//		System.out.println(ll.deleteLast());
//		System.out.println(ll.deleteLast());
		System.out.println("======");
	//	ll.reverseLinkedList();
		
//		System.out.println(ll.deleteAtIndex(5));
//		ll.removeDuplicatesInLL();
		ll.insertInsorted(55);
		ll.insertInsorted(100);
		ll.insertInsorted(5);
		ll.insertInsorted(30);
		ll.print();

	}

}
