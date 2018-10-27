import java.util.Scanner;

/**
 * Class for solution.
 */
public class Solution {
    /**
     * Main function
     *
     * @param      args  The arguments
     */
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
            }
            b--;
        }
    }
}
