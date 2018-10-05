import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for node.
 */
class Node {
    /**
     * { var_description }.
     */
    String data;
    /**
     * { var_description }.
     */
    Node next;
    /**
     * Constructs the object.
     *
     * @param      val   The value
     */
    protected Node(final String val) {
        data = val;
    }
}
/**
 * List of linkeds.
 */
class LinkedList {
    /**
     * { var_description }.
     */
    private Node start;
    /**
     * { var_description }.
     */
    private int size;
    /**
     * Constructs the object.
     */
    protected LinkedList() {
        start = null;
        size = 0;
    }
    /**
     * { function_description }.
     *
     * @param      i     { parameter_description }
     */
    void insert(final Node i) {
        if (size == 0) {
            start = i;
            return;
        }
    }
    /**
     * { function_description }.
     *
     * @param      index      The index
     * @param      n          { parameter_description }
     *
     * @throws     Exception  { exception_description }
     */
    void insertAt(final int index, final Node n) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("");

                    }

        if (index == 0) {
            n.next = start;
            start = n;
            size++;
            return;
        }
        start = insertAt(index, start, n, 0);
    }
    /**
     * { function_description }.
     *
     * @param      index    The index
     * @param      first    The first
     * @param      element  The element
     * @param      count    The count
     *
     * @return     { description_of_the_return_value }
     */
    Node insertAt(final int index, final Node first,
     final Node element, final int count) {
        if (count == index) {
            element.next = first;
            return element;
        }
        first.next = insertAt(index, first.next, element, count + 1);
        size++;
        return first;
    }
    /**
     * { function_description }.
     *
     * @throws     Exception  { exception_description }.
     */
    void reverse() throws Exception {
        if (start == null) {
            throw new Exception();
        }
        reverse(null, start);
    }
    /**
     * { function_description }.
     *
     * @param      prev     The previous
     * @param      current  The current
     */
    void reverse(final Node prev, final Node current) {
       if (current != null) {
          reverse(current, current.next);
          current.next = prev;
        } else {
            start = prev;
        }
    }
    /**
     * { function_description }.
     */
    void display() {
        Node temp = start;
        String str = "";
        while (temp != null) {
            str += temp.data + ", ";
            temp = temp.next;
        }
        System.out.println(str.substring(0, str.length() - 2));
    }
}