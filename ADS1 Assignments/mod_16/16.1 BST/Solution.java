import java.util.Scanner;

/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    protected Solution() {

    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySt bt = new BinarySt();
        while (sc.hasNext()) {
            String[] line = sc.nextLine().split(",");
            switch (line[0]) {
                // Node ne = new Node(old);
                case "put":
                Book old = new Book(line[1], line[2], Float.parseFloat(line[1 + 2]));
                bt.put(old, Integer.parseInt(line[2 + 2]));
                break;
                case "get":
                Book old1 = new Book(line[1], line[2], Float.parseFloat(line[1 + 2]));
                Integer c = bt.get(old1);
                // if(c == null){
                //  System.out.println("null");
                // }
                    System.out.println(c);
                // else{
                // }
                
                break;
            }
        }
    }
}