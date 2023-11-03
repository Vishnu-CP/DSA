package oal.crm.apps.territories.interview;

public class StackUsingLL {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack();
		stack.push("AAA");
		stack.push("SUSo");
		stack.push("Mooo");
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
	}

}

class Stack<T>{
	
	private Node<T> top ;
	private int length;
	
	private class Node<T> {
		private Node<T> next;
		private T data;
		 public Node(T data) {
			// TODO Auto-generated constructor stub
			 this.data = data;
		}
		
	}
	
	T push(T data) {
		
		Node<T> newNode = new Node(data);
		
		if(top == null) {
			top = newNode;
		}else {
			newNode.next = top;
			top = newNode;
		}
		length++;
		return newNode.data;
	}
	
	int size() {
		return length;
	}
	
	T pop() {
		if(this.size() == 0) {
			throw new RuntimeException("Empty Stack");
		}else {
			Node<T> temp = top;
			top = top.next;
			temp.next = null;
			length--;
			return temp.data;
					
		}
		
	}
	
	T peek() {
		if(this.size() == 0) {
			throw new RuntimeException("Empty Stack");
		}else {
			
			return top.data;
					
		}
		
	}
}
