package LinkedList;

public class LinkedListLoopBegginingIdentifierImplementation implements LinkedListLoopBegginingIdentifier {

	public LinkedListNode searchLoop(LinkedListNode head) {
		LinkedListNode n1 = head;
		LinkedListNode n2 = head;
		boolean cycleFound = false;
		
		while(n2.getNext() != null){
			n1 = n1.getNext().getNext();
			n2 = n2.getNext();
			
			if(n1 == n2){
				cycleFound = true;
				break;
			}
		}
		
		if(!cycleFound){
			return null;
		}
		
		n1 = head;
		
		while (n1 != n2) {
		 n1 = n1.getNext();
		 n2 = n2.getNext();
		}
		
		return n2;
		
	}
	


}
