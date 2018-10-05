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
	 * @param      val   The value
	 */
	Node(String val) {
		data = val;
	}
}
/**
 * List of linkeds.
 */
class LinkedList {
	Node start;
	int size;
	/**
	 * Constructs the object.
	 */
	LinkedList() {
		start = null;
		size = 0;
	}
	/**
	 * { function_description }
	 *
	 * @param      i     { parameter_description }
	 */
	void insert(Node i) {
		if(size == 0){
			start = i;
			return;
		}
	}
	/**
	 * { function_description }
	 *
	 * @param      index      The index
	 * @param      n          { parameter_description }
	 *
	 * @throws     Exception  { exception_description }
	 */
	void insertAt(int index,Node n) throws Exception {
		if(index < 0 || index > size) {
			throw new Exception("");

					}

		if(index == 0) {
			n.next = start;
			start = n;
			size++;
			return;
		}
		start =insertAt(index, start,n,0);

	}
	/**
	 * { function_description }
	 *
	 * @param      index    The index
	 * @param      first    The first
	 * @param      element  The element
	 * @param      count    The count
	 *
	 * @return     { description_of_the_return_value }
	 */
	Node insertAt(int index,Node first, Node element,int count ) {
		if(count == index){
			element.next = first;
			return element;
		}
		first.next = insertAt(index,first.next,element,count+1);
		size++;
		return first;
	}
	/**
	 * { function_description }
	 *
	 * @throws     Exception  { exception_description }
	 */
	void reverse() throws Exception {
		if(start == null) {
			throw new Exception();
		}
		reverse(null,start);
	}
	/**
	 * { function_description }
	 *
	 * @param      prev     The previous
	 * @param      current  The current
	 */
	void reverse( Node prev, Node current) {
	   if(current!=null){
	      reverse(current,current.next);
	      current.next = prev;
	    }else{
	    	start = prev;
	    }
	}
	/**
	 * { function_description }
	 */
	void display() {
		Node temp = start;
		String str="";
		while(temp !=null){
			str += temp.data+", ";
			temp = temp.next;
		}
		System.out.println(str.substring(0,str.length()-2));
	}
}
/**
 * Class for solution.
 */
class Solution {
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		while(sc.hasNextLine()) {
			String[] values = sc.nextLine().split(" ");
			switch (values[0]) {
				case "insertAt":
				try {
					ll.insertAt(Integer.parseInt(values[1]), new Node(values[2]));
				ll.display();
				}

				catch (Exception e) {
					System.out.println("Can't insert at this position.");

				}
				break;
				case "reverse":
				try {
					ll.reverse();
				ll.display();
				}

				catch(Exception e) {
					System.out.println("No elements to reverse.");
				}
				break;

			}
		}
	}
}
