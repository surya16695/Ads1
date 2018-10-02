import java.util.*;
/**
 * Class for node.
 */
class Node {
	String data;
	Node next;
	/**
	 * Constructs the object.
	 *
	 * @param      item  The item
	 */
	Node(String item) {
		this.data = item;
	}
}
/**
 * Class for steque.
 */
class Steque {
	Node start, end;
	int size;
	/**
	 * Constructs the object.
	 */
	protected Steque() {
		start = null;
		end = null;
		size = 0;
	}
	/**
	 * { function_description }
	 *
	 * @param      item  The item
	 */
	void push (final String item) {
		Node obj = new Node(item);
		if (size == 0) {
			start = obj;
			end = start;
			size++;	
			return;
		}
		obj.next = start;
		start = obj;
		size++;
	}
	/**
	 * { function_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
	String pop() throws Exception {
		if (isEmpty()) {
			throw new Exception ("Steque is empty.");
		}
		String data = start.data;
		start = start.next;
		size--;
		return data;
	}
	/**
	 * Determines if empty.
	 *
	 * @return     True if empty, False otherwise.
	 */
	boolean isEmpty() {
		return size == 0;
	}
	/**
	 * { function_description }
	 *
	 * @param      item  The item
	 */
	void enqueue(String item) {
		Node obj = new Node(item);
		if (size == 0) {
			start = obj;
			end = start;
			size++;
			return;	
		}
		end.next = obj;
		end = obj;
		size++;
	}
	public String toString() {
		if (size != 0) {
			Node temp = start;
			String s = "";
			while(temp != null) {
				s += temp.data+", ";
				temp = temp.next;
			}
		return s.substring(0, s.length() - 2);
			
		}
		return "";
	}
}