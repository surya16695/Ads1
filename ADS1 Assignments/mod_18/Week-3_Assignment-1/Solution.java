import java.util.*;
class Stock implements Comparable<Stock> {
	String name;
	Float percent;
	Stock(String name, Float f) {
		this.name = name;
		this.percent = f;
	}
	public int compareTo(Stock s) {
		if (this.percent > s.percent) {
			return 1;
		} else if (this.percent < s.percent) {
			return -1;
		} else {
			if (this.name.compareTo(s.name) > 0) {
				return 1;
			} else {
				return -1;
			}
		}
	}
	public String toString() {
		String str = "";
		str += this.name+" "+this.percent;
		return str;
	}
}




class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		while(sc.hasNext()) {
			int i = 0;
			MaxPQ max = new MaxPQ();
			MinPQ min = new MinPQ();
			int range = N;
			for (i = 0; i < range + 1; i++) {
				String[] line = sc.nextLine().split(",");
				if (line[0].equals("0")) {
					break;
				} else {
				Stock stock = new Stock(line[0], Float.parseFloat(line[1]));
				max.insert(stock);
				min.insert(stock);
				}
			}
			for (int j = 0; j <= 4; j++) {
				if (max.delMax() != null) {
					System.out.println(max.delMax());
				}
			}
			System.out.println();
			for (int j = 0; j <= 4; j++) {
				System.out.println(min.delMin());
			}
			System.out.println();
			if (range < 7 * range) {
				i = range;
				range = range + range;
				
			}

				
		}
	}
}