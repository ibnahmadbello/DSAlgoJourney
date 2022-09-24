package linkedlist;

import java.util.HashSet;

public class CondensedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(removeDuplicate(new LinkedList(4, 2, 1, 6, 8, 6)));
	}
	
	public static LinkedList removeDuplicate(LinkedList head) {
		LinkedList current = head;
		LinkedList prev = null;
		HashSet<Integer> hashSet = new HashSet<>();
		while(current != null) {
			var currentValue = current.value;
			if(hashSet.contains(currentValue)) {
				prev.next = current.next;
			} else {
				hashSet.add(currentValue);
				prev = current;
			}
			current = current.next;
		}
		return null;
	}

	public static LinkedList removeDuplicateAnotherWay(LinkedList head) {
		LinkedList root = head;
		while(head.next != null) {
			if(head.value != head.next.value) {
				head = head.next;
			} else {
				head.next = head.next.next;
			}
		}
		return root;
	}

	
}
