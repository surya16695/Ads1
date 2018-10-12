import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        MinPQ<student> pq = new MinPQ<student>();
        int asize = (scan.nextInt());
        student stu = null;
        student[] stud = new student[asize];
        int vacancies = (scan.nextInt());
        int unreserved = (scan.nextInt());
        int bc = (scan.nextInt());
        int st = (scan.nextInt());
        int sc = (scan.nextInt());
        scan.nextLine();
        for (int i = 0; i < asize; i++) {
            String[] t = scan.nextLine().split(",");
            stu = new student(t[0], t[1], Integer.parseInt(t[2]),
             Integer.parseInt(t[2 + 1]),
             Integer.parseInt(t[2 + 2]), Integer.parseInt(t[2 + 2 + 1]),
              t[2 + 2 + 2]);
            System.out.println(stu);
            System.out.println();
            pq.insert(stu);
        }
        for (int j = 0; j < asize; j++) {
            stud[j] = pq.delMin();
        }
        String str = "";
        for (int j = 0; j < asize; j++) {
            str += stud[j].toString()+"\n";
        }
        // System.out.println(Arrays.toString(stu));
    }
}
