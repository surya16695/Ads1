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
        Insertion in = new Insertion();
        int asize = (scan.nextInt());
        student[] stu = new student[asize];
        int vacancies = (scan.nextInt());
        int unreserved = (scan.nextInt());
        int bc = (scan.nextInt());
        int st = (scan.nextInt());
        int sc = (scan.nextInt());
        int size = 0;
        scan.nextLine();
        for (int i = 0; i < asize; i++) {
            String[] t = scan.nextLine().split(",");
            stu[i] = new student(t[0], t[1], Integer.parseInt(t[2]),
             Integer.parseInt(t[2 + 1]),
             Integer.parseInt(t[2 + 2]), Integer.parseInt(t[2 + 2 + 1]),
              t[2 + 2 + 2]);
            size++;
        }
        System.out.println(in.leaderboard(stu, size));
        System.out.println();
        System.out.println(in.seatAllotment(stu, size, unreserved, bc, st, sc));
    }
}
