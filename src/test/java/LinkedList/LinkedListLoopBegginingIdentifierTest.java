package LinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListLoopBegginingIdentifierTest {

	@Test
	public void test() {
		LinkedListNode head = new LinkedListNode(5);
		head.addNode(4).addNode(3).addNode(2).addNode(1).setNext(head);		
		LinkedListLoopBegginingIdentifier identifier = new LinkedListLoopBegginingIdentifierImplementation();
		LinkedListNode result = identifier.searchLoop(head);
		
	}

}
