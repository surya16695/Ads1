import java.util.*;
class Solution{
	Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Merge m = new Merge();
		while(sc.hasNextLine()) {
			String[] a = sc.nextLine().split(",");
			int[] number = new int[a.length];
			for (int i = 0; i < a.length; i++) {
				number[i] = Integer.parseInt(a[i]);
			}
			System.out.println(m.mergeSort(number));
			System.out.println();
		}
	}
}
/**
 * Class for merge.
 */
class Merge {
	/**
	 * { var_description }
	 */
	int size;
	/**
	 * { var_description }
	 */
	Insertion ins;
	/**
	 * Constructs the object.
	 */
	Merge() {
		size = 0;
		ins = new Insertion();
	}
	/**
	 * { function_description }
	 *
	 * @param      num   The number
	 *
	 * @return     { description_of_the_return_value }
	 */
	int[] mergeSort(int[] num) {
		int low = 0;
		int max = num.length - 1;
		int mid = (low + max)/2;
		int[] temp1 = new int[num.length/2];
		int[] temp2 = new int[num.length/2];

		for (int i = 0; i < mid + 1; i++) {
			temp1[i] = num[i];
		}
		for (int i = mid; i < max; i++) {
			temp2[i] = num[i];
		}
		if (temp1.length <= 7) {
			System.out.println("Insertion sort method invoked...");
			ins.Sort(temp1, temp1.length);
		}
		if (temp2.length <= 7) {
			System.out.println("Insertion sort method invoked...");
			ins.Sort(temp2, temp2.length);
		} else if (temp1.length > 7 || temp2.length > 7) {
			mergeSort(temp1);
			mergeSort(temp2);
		} if (temp1[temp1.length - 1] < temp2[temp2.length - 1]) {
			
		}
		int[] sorted = merge(temp1, temp2, temp1.length, temp2.length);
		return sorted;
	}
	/**
	 * { function_description }
	 *
	 * @param      L     { parameter_description }
	 * @param      R     { parameter_description }
	 * @param      n1    The n 1
	 * @param      n2    The n 2
	 *
	 * @return     { description_of_the_return_value }
	 */
	int[] merge(int[] L, int[] R, int n1, int n2) {
		int[] arr = new int[n1 + n2];
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = 1; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
        return arr; 
	}

}