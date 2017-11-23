package LinkedList;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class DeleteDuplicatesTest {

	@Test
	public void shouldRemoveDuplicateNodesWhenTheDuplicatedElementIsOnTail() {
		LinkedListNode head = new LinkedListNode(5);
		head.addNode(6).addNode(7).addNode(8).addNode(9).addNode(10).addNode(5);
		
		LinkedListDuplicatesRemover remover = new LinkedListDuplicatesRemoverWithhashTable();
		LinkedListNode result = remover.removeDuplicates(head);
		
		
	}

}
