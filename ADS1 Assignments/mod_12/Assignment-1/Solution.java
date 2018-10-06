import java.util.*;
/**
 * Class for solution.
 */
class Solution {
	/**
	 * { function_description }.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		Merge m = new Merge();
		int asize = (scan.nextInt());
		Student[] stu = new Student[asize];
		int vacancies = (scan.nextInt());
		int unreserved = (scan.nextInt());
		int bc = (scan.nextInt());
		int st = (scan.nextInt());
		int sc = (scan.nextInt());
		for(int i = 0; i < asize; i++) {
			String[] t = scan.nextLine().split(",");
			stu[i] = new Student(t[0], t[1], Integer.parseInt(t[2]), Integer.parseInt(t[3]), Integer.parseInt(t[4]), Integer.parseInt(t[5]), t[6]);
		}
		System.out.println(Arrays.toString(stu));
		//m.sort(stu);
	}
}