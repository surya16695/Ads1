import java.util.*;


class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Sorting s = new Sorting();
		ST<Person, Integer> st = new ST();
        int count = 0;
		while(sc.hasNextLine()) {
            String[] input = sc.nextLine().split(",");
        	if (input[0].equals("JC")) {
        		Person[] pers = new Person[30];
				s.sort();
				// int k = 0;
				Person[] per = s.jcArray();
				for (int i = 0; i < s.size(); i++) {
					if (pers[i] == null) {
						pers[i] = per[i];
					} else {
						for (Person each: pers) {
							if (each.getJid()  != per[i].getJid()) {
								pers[i] = per[i];
							}
						}
					}
				}
        		System.out.println(per[count]);
        		count++;
        	}else {
            	s.addPerson(new Person(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
        	}
		}
	}
}