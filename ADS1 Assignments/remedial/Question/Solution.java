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
        	if (input[0].equals("JC")) {
        		Person[] perA = new Person[count];
        		int a = perA.length;
				s.sort();
				Person[] per = s.jcArray();
				for (Person each: per) {
					for (Person e: perA ) {
						if (each.getJid() != e.getJid()) {
							perA[++a] = each;
						}		
						
					}
				}
        		System.out.println(perA[count]);
        		count++;
        	}else {
            	s.addPerson(new Person(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
        	}
		}
	}
}