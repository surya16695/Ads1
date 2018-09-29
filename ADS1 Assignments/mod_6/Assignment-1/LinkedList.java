import java.util.*;

class Node{

	String data;

	Node next;

	Node(){



	}

	Node(String data){

		this.data = data;

	}



}

//stacks

class LinkedList{

	Node start;

	int size;

	LinkedList(){

		start = new Node();

		size = 0;

	}



	void insert(String value){
		Node obj = new Node(value);
		if(size == 0){
			start = obj;
			size++;
			return ;
		}
		Node temp = start;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = obj;
		size++;
	}
	// public String toString() {
	// 	String s = "";
	// 	for (int i = 0; i < size; i++) {
	// 		s += delete();
	// 	}
	// 	return s;
	// }





	String delete(){
		if (size == 0) {
			return start.data;
		}

		String data = start.data;

		start = start.next;

		size--;

		return data;

	}



	boolean isEmpty(){

		if(size ==0){

			return true;

		}

		return false;

	}



	int size(){

		return size;

	}

}



class Stack{

	LinkedList ll ;

	Stack (){

		ll = new LinkedList();

	}



	void push(String item){

		ll.insert(item);

	}

	String pop(){

		return ll.delete();

	}

	boolean isEmpty(){

		return ll.isEmpty();

	}

	int size(){

		return ll.size();

	}

}

