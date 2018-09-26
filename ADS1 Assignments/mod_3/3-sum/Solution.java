import java.util.Scanner;
import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        threeSum t = new threeSum();
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        t.threeSumpairs(arr);
        // System.out.println(Arrays.toString(arr));
    }
}

class threeSum {
    int count;
    threeSum() {
        count = 0;
    }
    public int threeSumpairs(int[] arr) {
        Arrays.sort(arr);
        int a = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr.length; k++) {
                a = arr[j] + arr[k];
                if (Binarysearch(arr, a) == a) {
                    count++;
                 } 
                
            }
            
        }
        return count;
    }
    public static int Binarysearch(int[] arraysent, int number) {
            int tempvar = 0;
            int value = 0;
            int start = 0;
            int end = arraysent.length;
            for (int j = 0; j < arraysent.length; j++) {
                tempvar = (start + end)/2;
                if (arraysent[tempvar] == number) {
                    value = arraysent[tempvar];
                    break;
                } else {
                    if (arraysent[tempvar] > number) {
                        end = tempvar;
                    } else {
                        start = tempvar;
                    }
                }
            }
            return value;
    }
}