import java.util.*;

class Sorting {
	BinarySearchST<String, Integer> biSearch1;
	BinarySearchST<String, Person> biSearch2;
	MinPQ<Person> minPq;

	Sorting() {
		biSearch1= new BinarySearchST<>();
		biSearch2 = new BinarySearchST<>();
		minPq = new MinPQ<>();
	}
	void sort(String i, Person p) {	
				if(biSearch1.isEmpty()) {
					biSearch1.put(i,1);
					p.num = 1;
					biSearch2.put(i,p);
					minPq.insert(p);
				}
				else {
					int flag = 0;
					Iterable<String> str = biSearch1.keys();
					for(String cat : str) {
						if(cat.equals(i)) {
							Integer v = biSearch1.get(i);
							biSearch1.put(i,biSearch1.get(i)+1);
							p.num = biSearch1.get(i)+1;
							minPq.insert(p);minPq = new MinPQ<>();
							flag = 1;
						}
					}
					if(flag == 0) {
						biSearch1.put(i,1);
						p.num = 1;
						biSearch2.put(i,p);
						minPq.insert(p);
					}
				}
		}
	Person min() {
		return minPq.delMin();
	}
}