import java.util.Scanner;
class Book {
	String author;
	String name;
	Float price;
	// int value;

	Book() {

	}
	Book (String na, String auth, Float cost) {
		this.author = auth;
		this.name = na;
		this.price = cost;
		// this.value = val;
	}
	String getAuthor() {
		return this.author;
	}
	String getName() {
		return this.name;
	}
	Float getCost() {
		return this.price;
	}
	// int getValue() {
	// 	return this.value;
	// }
}
class Node {
	Book data;
	int val;
	Node n1;
	Node n2;
	Node(Book k, int v) {
		this.data = (k);
		this.val = v;
		// n = new Node();
	}
	// Node(Book b) {
	// 	this.data = b;
	// }
}

class BinarySt<Key extends Comparable<Key>, Value> {
	Node root;
	Book book;
	int value;
	BinarySt() {

	}
	// BinarySt(String na, String auth, Float cost, int val) {
	// 	book = new Book(auth, na, cost);
	// 	value = val;
	// }
	void put(Book key, int val) {
		root = put(root, key, val);
	}
	Node put(Node x, Book key, int val) {
		if (x == null) {
			return new Node(key, val);
		}
		int temp = key.getName().compareTo(x.data.getName());
		if (temp < 0) {
			x.n1 = put(x.n1, key, val);
		}
		if (temp > 0) {
			x.n2 = put(x.n2, key, val);
		}
		else {
			x.val = val;
		}
		return x;
	}
	Integer get(Book key) {
		// System.out.println(key.getName());
		Node x = root;
		while (x != null) {
			int cmp = key.getName().compareTo(x.data.getName());
			if (cmp < 0) x = x.n1;
	        if (cmp > 0) x = x.n2;
	        if (cmp == 0) {
	        	return x.val;
	        } 	
		}
		return null;
	}
}

class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySt bt = new BinarySt();
		while (sc.hasNext()) {
			String[] line = sc.nextLine().split(",");
			switch (line[0]) {
				// Node ne = new Node(old);
				case "put":
				Book old = new Book(line[1], line[2], Float.parseFloat(line[3]));
				bt.put(old, Integer.parseInt(line[4]));
				break;
				case "get":
				Book old1 = new Book(line[1], line[2], Float.parseFloat(line[3]));
				int c = bt.get(old1);
				System.out.println(c);
				break;
			}
		}
	}
}