package linkedlist;

public class PrintLinkedList {
	
	public void printLinkedList(LinkedList head) {
		var current = head;
		while(current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
	
	public void printLinkedListUsingRecursion(LinkedList head) {
		if(head == null) return;
		System.out.println(head.value);
		printLinkedListUsingRecursion(head.next);
	}
}
