package linkedlist;

public class GetNodeValue {
	
	public Integer getNodeValue(LinkedList head, int index) {
		if(head == null) return null;
		if(index == 0) return head.value;
		return getNodeValue(head.next, index-1);
	}
}
