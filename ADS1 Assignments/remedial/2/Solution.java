import java.util.*;
class Student implements Comparable<Student>{
	private String name;

	private Double marks;

	private Integer rollnumber;

	Student(String na, String mar, String roll) {
		this.name = na;
		this.marks = Double.parseDouble(mar);
		this.rollnumber = Integer.parseInt(roll);
	}

	String getName() {
		return this.name;
	}

	Double getMarks() {
		return this.marks;
	}

    public int compareTo(Student that) {
        if (this.marks > that.marks) {
            return 1;
        }
        if (this.marks < that.marks) {
            return -1;
        }
        if (this.name.compareTo(that.name) > 0) {
            return 1;
        }
        if (this.name.compareTo(that.name) < 0) {
            return -1;
        }
        if (this.rollnumber > that.rollnumber) {
            return 1;
        }
        if (this.rollnumber < that.rollnumber) {
            return -1;
        }
        return 0;
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		Student student = null;
		RedBlackBST<Student, Integer> stuBst =  new RedBlackBST<>();
		while(a > 0) {
			String[] line = sc.nextLine().split(",");
			student = new Student(line[1], line[2], line[0]);
			stuBst.put(student, Integer.parseInt(line[0]));
			a--;
		}
		int b = Integer.parseInt(sc.nextLine());
		while (b > 0) {
			String[] con = sc.nextLine().split(" ");
			switch(con[0]) {
				case "BE":
				Double n1 = Double.parseDouble(con[1]);
				Double n2 = Double.parseDouble(con[2]);
				for (Student each : stuBst.keys()) {
					if (each.getMarks() >= n1 && each.getMarks() <= n2) {
						System.out.println(each.getName());
					}
				}
				break;
				case "GE":
				Double mark = Double.parseDouble(con[1]);
				for (Student each : stuBst.keys() ) {
					if (each.getMarks() <= mark) {
						System.out.println(each.getName());
					} 
				}
				break;
				case "LE":
				Double m = Double.parseDouble(con[1]);
				for (Student each : stuBst.keys() ) {
					if (each.getMarks() >= m) {
						System.out.println(each.getName());
					}
				}				
			}
			b--;
		}

	}
}