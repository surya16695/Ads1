import java.util.*;

class Student {
	private String name;

	private Double marks;

	Student(String na, String mar) {
		this.name = na;
		this.marks = Double.parseDouble(mar);
	}

	String getName() {
		return this.name;
	}

	Double getMarks() {
		return this.marks;
	}
}

class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		SeparateChainingHashST<Integer, Student> hashtab = new SeparateChainingHashST<>();
		Student student = null;
		while(a > 0) {
			String[] line = sc.nextLine().split(",");
			student = new Student(line[1], line[2]);
			hashtab.put(Integer.parseInt(line[0]), student);
			a--;
		}
		int b = Integer.parseInt(sc.nextLine());
		while (b > 0) {
			String[] con = sc.nextLine().split(" ");
			switch(con[2]) {
				case "1":
					if (hashtab.contains(Integer.parseInt(con[1]))) {
						System.out.println(hashtab.get(Integer.parseInt(con[1])).getName());
					} else {
						System.out.println("Student Doesn't exist.");
					}
				break;
				case "2":
					if (hashtab.contains(Integer.parseInt(con[1]))) {
						System.out.println(hashtab.get(Integer.parseInt(con[1])).getMarks());
					} else {
						System.out.println("Student Doesn't exist.");
					}
				break;
				default:
				break;
			}
			b--;
		}
		
	}
}