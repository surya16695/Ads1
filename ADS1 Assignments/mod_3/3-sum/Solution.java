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
        System.out.println(t.threeSumpairs(arr));
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
                if(a > 0){
                    a=-(a);
                }else{
                    a = -1*a;
                }
                System.out.print(a+"*****");
                System.out.println((Binarysearch(arr, a)));
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
            System.out.println(arraysent[tempvar] == number);
            if (arraysent[tempvar] == number) {
                value = arraysent[tempvar];
                return value;
                
            } else {
                if (arraysent[tempvar] > number) {
                    end = tempvar-1;
                } else {
                    start = tempvar+1;
                }
            }
        }
        return value;
    }
}

