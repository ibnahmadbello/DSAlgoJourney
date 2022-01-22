package linkedlist;

public class LinkedListFind {
	
	public boolean findInLinkedList(LinkedList head, int target) {
		var current = head;
		while(current != null) {
			if(current.value == target) return true;
			current = current.next;
		}
		return false;
	}
	
	public boolean findInLinkedListWithRecursion(LinkedList head, int target) {
		if (head == null) return false;
		if (head.value == target) return true;
		return findInLinkedListWithRecursion(head.next, target);
	}
}
