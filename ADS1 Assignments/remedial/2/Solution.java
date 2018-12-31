import java.util.*;
class Student implements Comparable<Student>{
	String name;

	Double marks;

	Integer rollnumber;

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
		if (this.marks < that.marks) {
			return -1;
		}
		if (this.marks > that.marks) {
			return 1;
		}
		return 0;
	} 
}

class Solution {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        RedBlackBST<Student, Integer> binarysearchtree = new RedBlackBST<>();
        Student student = null;
        while (a > 0) {
            String[] line1 = sc.nextLine().split(",");
            student = new Student(line1[1], line1[2], line1[0]);
            binarysearchtree.put(student, Integer.parseInt(line1[0]));
            a--;
        }
        int b = Integer.parseInt(sc.nextLine());
        while (b > 0) {
            String[] line2 = sc.nextLine().split(" ");
            switch (line2[0]) {
            case "BE":
                double min = Double.parseDouble(line2[1]);
                double max = Double.parseDouble(line2[2]);
                for (Student each : binarysearchtree.keys()) {
                    if (each.marks >= min && each.marks <= max) {
                        System.out.println(each.name);
                    }
                }
                break;
            case "LE":
                double low = Double.parseDouble(line2[1]);
                for (Student each : binarysearchtree.keys()) {
                    if (each.marks <= low) {
                        System.out.println(each.name);
                    }
                }
                break;
            case "GE":
                // System.out.println("Surya//////");
                double high = Double.parseDouble(line2[1]);
                for (Student each : binarysearchtree.keys()) {
                    if (each.marks >= high) {
                        System.out.println(each.name);
                    }
                }
                break;
                default:
                break;
            }
            b--;
        }
    }
}