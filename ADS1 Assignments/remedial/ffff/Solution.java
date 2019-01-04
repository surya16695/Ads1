import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySearchST<String, Integer> biSearch1= new BinarySearchST<>();
		BinarySearchST<String, Person> biSearch2 = new BinarySearchST<>();
		MinPQ<Person> min = new MinPQ<>();
		while(sc.hasNext()) {
			String[] input = sc.nextLine().split(",");
			// System.out.println(input.length);
			switch(input[0]) {
				// case 1:
				// if(min.isEmpty()) {
				// 	System.out.println("NO Registrations");
				// 	break;
				// }
				// else {
				// 	System.out.println(min.delMin());
				// }
				// break;
				case "JC":
				String i = input[1];
				Person p = new Person(Integer.parseInt(input[0]),Integer.parseInt(input[1]));
				// biSearch2.put(i,p);
				if(biSearch1.isEmpty()) {
					biSearch1.put(i,1);
					p.num = 1;
					biSearch2.put(i,p);
					min.insert(p);
				}
				else {
					int fl = 0;
					Iterable<String> str = biSearch1.keys();
					for(String cat : str) {
						if(cat.equals(i)) {
							Integer v = biSearch1.get(i);
							biSearch1.put(i,biSearch1.get(i)+1);
							p.num = biSearch1.get(i)+1;
							min.insert(p);
							fl = 1;
						}
					}
					if(fl == 0) {
						biSearch1.put(i,1);
						p.num = 1;
						biSearch2.put(i,p);
						min.insert(p);
					}
				}	
			}
		}
	}
}