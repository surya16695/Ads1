import java.util.*;


class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Sorting s = new Sorting();
        int count = 0;
		while(sc.hasNextLine()) {
            String[] input = sc.nextLine().split(",");
            s.addPerson(new Person(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
            switch (input[0]) {
            	case "JC":
					s.sort();
					Person[] per = s.jcArray();
            		System.out.println(per[count]);
            		count++;
            }
		}
	}
}