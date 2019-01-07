import java.util.*;

class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BST<Person, Integer> bst = new BST<>();
		MinPQ <Person> minpq = new MinPQ();
		int value = 1;
		while(sc.hasNext()) {
			String[] s = sc.nextLine().split(",");
			switch(s.length) {
				case 1:
					if (minpq.isEmpty()) {
						System.out.println("NO Registrations");
					} else {
						System.out.println(minpq.delMin());
					}
				break;
				case 2:
					Person p = new Person(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
					if (bst.isEmpty()) {
						bst.put(p, value);
						minpq.insert(p);
					}else {
						int flag = 0;
						for (Person per: bst.keys()) {
							// System.out.println(per.getJid());
							// System.out.println(Integer.parseInt(s[1]));
							if (per.getJid() == Integer.parseInt(s[1])) {
								bst.put(p, value+1);
								minpq.insert(p);
								p.num++;
								flag = 1;
								// System.out.println(p.num);
							}
						} if(flag == 1) {
						bst.put(p, value);
						minpq.insert(p);
						}
					}
				break;
				default:
				break;
			}
		}
	}

}


class Person implements Comparable<Person> {
	int rId;
	int jId;
	int num;

	Person(int r, int j) {
		this.rId = r;
		this.jId = j;
		this.num = 0;
	}

	int getRid() {
		return this.rId;
	}
	int getJid() {
		return this.jId;
	}
	public int compareTo(Person that) {
		if(this.num > that.num) {
			return 1;
		}
		else if(this.num < that.num) {
			return -1;
		}
		else {
			if(this.rId > that.rId) {
				return 1;
			}
			return -1;

		}
	}
	public String toString() {
		return this.rId + ", " + this.jId;
	}
}