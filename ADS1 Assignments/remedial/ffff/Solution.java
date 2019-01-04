import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sorting s = new Sorting();
		while(sc.hasNext()) {
			String[] input = sc.nextLine().split(",");
			// System.out.println(input.length);
			switch(input.length) {
				case 1:
				if(s.minPq.isEmpty()) {
					System.out.println("NO Registrations");
					break;
				}
				else {
					System.out.println(s.min());
				}
				break;
				case 2:
					String i = input[1];
					Person p = new Person(Integer.parseInt(input[0]),Integer.parseInt(input[1]));
					s.sort(i, p);
				break;
			}
		}
	}
}