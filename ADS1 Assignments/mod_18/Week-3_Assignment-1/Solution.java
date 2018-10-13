import java.util.Scanner;
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
     * main .
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        BinarysearchST<String, Integer> maxST
         = new BinarysearchST<String, Integer>();
        BinarysearchST<String, Integer> minST
         = new BinarysearchST<String, Integer>();
        while (!sc.hasNextInt()) {
            int i = 0;
            MaxPQ<Stock> max = new MaxPQ<Stock>();
            MinPQ<Stock> min = new MinPQ<Stock>();
            int range = num;
            for (i = 1; i < range + 1; i++) {
                String[] line = sc.nextLine().split(",");
                if (line[0].equals("0")) {
                    break;
                } else {
                Stock stock = new Stock(line[0], Float.parseFloat(line[1]));
                max.insert(stock);
                min.insert(stock);
                }
            }
            for (int j = 1; j <= (2 + 2 + 1); j++) {
                int c = 1;
                System.out.println(max.delMax());
                // if (maxST.contains(max.delMax().getName())) {
                //  maxST.put(max.delMax().getName(), c++);
                // }
                // maxST.put(max.delMax().getName(), c);
                // if (max.delMax() == null) {
                //  System.out.println("Surya******************");
                // }
            }
            max = null;
            System.out.println();
            for (int j = 0; j <= 2 + 2; j++) {
                System.out.println(min.delMin());
            }
            min = null;
            System.out.println();
            if (range < (2 + 2 + 2 + 1) * num) {
                i = range;
                range = range + range;
            }
        }
        int q = sc.nextInt();
        while (sc.hasNext()) {
            String[] query = sc.nextLine().split(",");
            switch (query[0]) {
                case "get":
                    switch (query[1]) {
                    case "maxST":
                    maxST.get(query[2]);
                    break;
                    case "minST":
                    minST.get(query[2]);
                    break;
                    default:
                    break;
                }
                break;
                case "intersection":
                break;
                default:
                break;
            }
        }
    }
}
