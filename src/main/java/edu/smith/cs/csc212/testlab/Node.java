package edu.smith.cs.csc212.testlab;

/**
 * This class represents a node in a linked list.
 *
 * @param <T>  the type of the items in the list.
 */
class Node<T> {
	/**
	 * This is the value of the node.
	 */
	T value;
	/**
	 * This is the next node.
	 */
	Node<T> next = null;
	/**
	 * Create a new Node form a value and a next pointer.
	 * @param value the value to insert into the list.
	 * @param next the next part of the list if any.
	 */
	public Node(T value, Node<T> next) {
		this.value = value;
		this.next = next;
	}
	
	/**
	 * When we create a node without a next, it's next should be null.
	 * @param value the value to insert into the list.
	 */
	public Node(T value) {
		// this is "magical" and calls the other constructor.
		this(value, null);
	}
	
	public String toString() {
		return "Node("+this.value+", "+this.next+")";
	}
}