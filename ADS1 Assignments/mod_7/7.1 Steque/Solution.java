import java.util.Scanner;
/**
 * Class for solution.
 */
class Solution {
    /**
     * Constructs the object.
     */
    protected Solution() {

    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        Steque st = new Steque();
        while (scan.hasNextLine()) {
            String[] input = scan.nextLine().split(" ");
            switch (input[0]) {
                case "push" :
                st.push(input[1]);
                System.out.println(st);
                break;
                case "pop" :
                try {
                    st.pop();
                    if (st.isEmpty()) {
                        System.out.println("Steque is empty.");
                    } else {
                        System.out.println(st);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
                case "enqueue" :
                st.enqueue(input[1]);
                System.out.println(st);
                break;
                default:
                System.out.println();
                st = new Steque();
                break;
            }

        }
    }
}
