package linkedlist;

public class SumOfLinkedList {

	public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
		LinkedList nextHeadPointer = new LinkedList(0);
		LinkedList currentNode = nextHeadPointer;
		int carry = 0;
		
		LinkedList nodeOne = linkedListOne;
		LinkedList nodeTwo = linkedListTwo;
		
		while (nodeOne != null || nodeTwo != null || carry != 0) {
			int valueOne = (nodeOne != null) ? nodeOne.value : 0;
			int valueTwo = (nodeTwo != null) ? nodeTwo.value : 0;
			int sumOfValues = valueOne + valueTwo + carry;
			
			int newValue = sumOfValues % 10;
			LinkedList newNode = new LinkedList(newValue);
			currentNode.next = newNode;
			currentNode = newNode;
			
			carry = sumOfValues / 10;
			nodeOne = (nodeOne != null) ? nodeOne.next : null;
			nodeTwo = (nodeTwo != null) ? nodeTwo.next : null;
		}
		return nextHeadPointer.next;
	}
}
