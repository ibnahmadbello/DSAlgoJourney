package linkedlist;

public class ZipperList {
	
	public LinkedList zipperLists(LinkedList head1, LinkedList head2) {
		var tail = head1;
		var current1 = head1.next;
		var current2 = head2;
		var count = 0;
		
		while(current1 != null && current2 != null) {
			if(count % 2 == 0) {
				tail.next = current2;
				current2 = current2.next;
			} else {
				tail.next = current1;
				current1 = current1.next;
			}
			tail = tail.next;
			count += 1;
		}
		if (current1 != null) tail.next = current1;
		if (current2 != null) tail.next = current2;
		
		return head1;
	}
}
