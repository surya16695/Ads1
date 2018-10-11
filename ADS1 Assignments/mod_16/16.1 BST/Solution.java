import java.util.Scanner;

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
				Integer c = bt.get(old1);
				// if(c == null){
				// 	System.out.println("null");
				// }
					System.out.println(c);
				// else{
				// }
				
				break;
			}
		}
	}
}