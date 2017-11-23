package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListDuplicatesRemoverWithhashTable implements LinkedListDuplicatesRemover {

	public LinkedListNode removeDuplicates(LinkedListNode elements) {
		Set<Integer> tracker = new HashSet<Integer>(0);
		LinkedListNode head = elements;
		LinkedListNode previous = head;
		LinkedListNode next = elements.getNext();
		
		while(next != null){
			if(tracker.contains(next.getValue())){
				if(next.getNext() != null){
					next = next.getNext();
				}else{
					previous.setNext(null);
				}
				
			}
			previous = next;
		}
		
		return elements;
		
	}


}
