package edu.smith.cs.csc212.testlab;

import java.util.AbstractList;

public class SList<T> extends AbstractList<T> {
	private Node<T> start = null;
	
	/**
	 * Add to the front of this list.
	 * @param value the value to add.
	 */
	public void addToFront(T value) {
		start = new Node<T>(value, start);
	}
	/**
	 * Remove from the front of this list.
	 * @return the value removed.
	 */
	public T removeFront() {
		T found = start.value;
		start = start.next;
		return found;
	}
	
	/**
	 * Remove the last item in the list.
	 * @return the last item in the list.
	 */
	public T removeBack() {
		// This is my fancy version of "TODO".
		throw new UnsupportedOperationException("This is a challenge for you to implement.");
	}
	
	/**
	 * Print this list.
	 */
	public void print() {
		for (Node<T> current = start; current != null; current = current.next) {
			System.out.println(current.value);
		}
	}
	
	/**
	 * Convert structure into a string.:
	 */
	public String toString() {
		return "SList[start="+this.start+"]";
	}
	
	/**
	 * Convert contents to a String.
	 * @return
	 */
	public String join() {
		// A stringbuilder is an efficient way to create a new string in Java, since += makes copies.
		StringBuilder sb = new StringBuilder();
		for (Node<T> current = start; current != null; current = current.next) {
			if (current != start) {
				sb.append(' ');
			}
			sb.append(current.value);
		}
		return sb.toString();
	}
	
	/**
	 * Add a value to the back of this list.
	 * @param value the value to add.
	 * @return true if the list was modified.
	 */
	public boolean add(T value) {
		Node<T> last = null;
		for (Node<T> current = start; current != null; current = current.next) {
			last = current;
		}
		if (last != null) {
			last.next = new Node<>(value);
		} else {
			start = new Node<>(value);
		}
		return true;
	}
	
	/**
	 * Get the element at index.
	 * @param index the index of the list.
	 * @return the element.
	 */
	public T get(int index) {
		int at = 1;
		for (Node<T> current = start; current != null; current = current.next) {
			if (at == index) {
				return current.value;
			}
			at++;
		}
		// We couldn't find it, throw an exception!
		throw new IndexOutOfBoundsException();
	}
	
	/**
	 * Count the size of the linked list.
	 */
	public int size() {
		int count = 0;
		for (Node<T> current = start; current == null; current = current.next) {
			count++;
		}
		return count;
	}
}


