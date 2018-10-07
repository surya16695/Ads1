/**
 * Class for insertion.
 */
public class Insertion {
    /**
     * Constructs the object.
     */
    public Insertion() {

    }
    /**
     * Insertion Sort function for array.
     * Omega(N)
     * Theta(N^2)
     * O(N^2)
     * @param      array  The array
     * @param      size   The size
     */
    public void Sort(Comparable[] array, int size) {
        int n = size;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (less(array, j, j - 1)) {
                    swap(array, j, j - 1);
                }
            }
        }
    }
    /**
     * Finds which value is lower.
     *
     * @param      arr   The arr
     * @param      ind1  The ind 1
     * @param      ind2  The ind 2
     *
     * @return     { description_of_the_return_value }
     */
    public boolean less(Comparable[] arr, int ind1, int ind2) {
        return arr[ind1].compareTo(arr[ind2]) > 0;
    }
    /**
     * Swaps the values in the array.
     *
     * @param      a     Team array
     * @param      ind1  The ind 1
     * @param      ind2  The ind 2
     */
    public void swap(Comparable[] a, int ind1, int ind2) {
        Comparable temp = a[ind1];
        a[ind1] = a[ind2];
        a[ind2] = temp;
    }
    /**
     * Finds the Leaderboard and returns leaderboard string.
     *
     * @param      array  The array
     * @param      size   The size
     *
     * @return     String with team names.
     */
    public String leaderboard(Comparable[] array, int size) {
        Sort(array, size);
        String s = "";
        for (int i = 0; i < size; i++) {
            s += array[i].toString() + "\n";
        }
        return s.substring(0, s.length() - 1);
    }
    /**
     * seat allotment in students.
     *
     * @param      array  The array
     * @param      size   The size
     *
     * @return     { description_of_the_return_value }
     */
    public String seatAllotment(student[] array, int size, int unreserved, int bc, int st, int sc) {
        Sort(array, size);
        String su = "";
        for (int i = 0; i < unreserved; i++) {
            su += array[i].toString() + "\n";
            System.out.println(array[i].getreserve());
        }
        // for (int j = unreserved - 1; j <  array.length; j++) {
        //     if (array[j].getreserve().compareTo("BC")) {
        //         int v = 0;
        //         if (v < bc) {
        //             su += array[j].toString() + "\n";
        //             v++;
        //         }
        //     }
        //     if (array[j].getreserve().compareTo("SC")) {
        //         int f = 0;
        //         if (f < sc) {
        //             su += array[j].toString() + "\n";
        //             f++;
        //         }
        //     }
        //     if (array[j].getreserve().compareTo("ST")) {
        //         int z = 0;
        //         if (z < st) {
        //             su += array[j].toString() + "\n";
        //             z++;
        //         }
        //     }
        // }
        return su;
    }
}