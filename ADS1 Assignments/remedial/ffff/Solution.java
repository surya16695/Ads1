import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinarySearchST<String, Integer> bst= new BinarySearchST<>();
		BinarySearchST<String, Person> bs = new BinarySearchST<>();
		MinPQ<Person> min = new MinPQ<>();
		while(s.hasNext()) {
			String[] input = s.nextLine().split(",");
			// System.out.println(input.length);
			switch(input.length) {
				case 1:
				if(min.isEmpty()) {
					System.out.println("NO Registrations");
					break;
				}
				else {
					System.out.println(min.delMin());
				}
				break;
				case 2:
				String i = input[1];
				Person p = new Person(Integer.parseInt(input[0]),Integer.parseInt(input[1]));
				// bs.put(i,p);
				if(bst.isEmpty()) {
					bst.put(i,1);
					p.value = 1;
					bs.put(i,p);
					min.insert(p);
				}
				else {
					int fl = 0;
					Iterable<String> it = bst.keys();
					for(String cat : it) {
						if(cat.equals(i)) {
							Integer v = bst.get(i);
							bst.put(i,bst.get(i)+1);
							p.value = bst.get(i)+1;
							min.insert(p);
							fl = 1;
						}
					}
					if(fl == 0) {
						bst.put(i,1);
						p.value = 1;
						bs.put(i,p);
						min.insert(p);
					}
				}	
			}
		}
	}
}