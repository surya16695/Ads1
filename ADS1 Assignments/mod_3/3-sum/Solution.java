// import java.util.Scanner;
// import java.util.Arrays;
// class Solution {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         threeSum t = new threeSum();
//         int n = s.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = s.nextInt();
//         }
//         System.out.println(t.threeSumpairs(arr));
//         // System.out.println(t.Binarysearch(arr, 6));
//         // System.out.println(Arrays.toString(arr));
//     }
// }

// class threeSum {
//     int count;
//     threeSum() {
//         count = 0;
//     }
//     public int threeSumpairs(int[] arr) {
//         Arrays.sort(arr);
//         // System.out.println("MSIT");
//         // System.out.println(Arrays.toString(arr));

// int a = 0; for (int j = 0; j < arr.length-2; j++) { for (int k = j+1; k <
// arr.length-1; k++) { if (j != k) { a = -1*(arr[j] + arr[k]); //
// System.out.println("sum = "+a+" ->j = "+arr[j]+"k ="+arr[k]); // if(a > 0){
// //     a = -a; // }else{ //     a = -1*a; // } int z = Binarysearch(arr,
// a,k+1); if (z != -1) { count++; // System.out.println("Suryaaaaaaaaa"+count);
// break; } } } // System.out.print(a+"*****"); //
// System.out.println((Binarysearch(arr, a))); } return count; } public static
// int Binarysearch(int[] arraysent, int number,int s) { int tempvar = 0; int
// value = 0; int start = s; int end = arraysent.length - 1; //
// System.out.println("a = "+number); for (int j = s; j < arraysent.length; j++)
// { // System.out.println(start + " *" + end + " "+ number); if(start <
// arraysent.length && end < arraysent.length) tempvar = (start + end)/2; //
// System.out.println(arraysent[tempvar]); if (arraysent[tempvar] == number) {
// value = arraysent[tempvar]; // System.out.println("value ="+ value); return
// value; // break; } if (arraysent[tempvar] < number) { start = tempvar+1; } if
// (arraysent[tempvar] > number) { end = tempvar-1; } } return -1; } }
import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for solution.
 */
class Solution {
    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        threeSum t = new threeSum();
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        t.findTrip(arr);
        // System.out.println(t.Binarysearch(arr, 6));
        // System.out.println(Arrays.toString(arr));
    }
}
/**
 * Class for three sum.
 */
class threeSum {
    private int count;
    threeSum() {
        count = 0;
    }
    /**
     * { function_description }.
     *
     * @param      arr   The arr
     */
    void findTrip(final int[]arr) {
        int len = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            int j = i + 1;
            int r = len - 1;
            int x = arr[i];
            while (j < r) {
                int sum = x + arr[j] + arr[r];
                if (sum == 0) {
                    count++;
                    j++;
                    r--;
                } else if (sum < 0) {
                    j++;
                } else {
                    r--;
                }
            }
        }
        System.out.println(count);
    }
}
