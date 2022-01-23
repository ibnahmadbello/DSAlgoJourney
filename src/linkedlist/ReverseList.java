package linkedlist;

public class ReverseList {
	
	public LinkedList reverseList(LinkedList head) {
		LinkedList prev = null;
		var current = head;
		while (current != null) {
			var next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	
}
