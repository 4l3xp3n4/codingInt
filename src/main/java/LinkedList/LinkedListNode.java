package LinkedList;

public class LinkedListNode {
	
	private Integer value;
	private LinkedListNode next;

	public LinkedListNode(Integer value) {
		this.setValue(value);
	}
	
	public LinkedListNode(Integer value, LinkedListNode next) {
		this.setValue(value);
		this.setNext(next);
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}
	
	public LinkedListNode addNode(Integer value){
		LinkedListNode newNode = new LinkedListNode(value);
		this.setNext(newNode);
		return newNode;
	}
	
	@Override
	public String toString(){
		return this.value.toString();
	}

}
