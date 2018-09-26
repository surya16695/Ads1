import java.util.*;
class Solution {
    Solution() {

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