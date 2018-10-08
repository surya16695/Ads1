import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		// System.out.println(line);
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++) {
			switch (line) {
				case "String" :
				Heap<String> heap = new Heap<String>();
				String[] line4 = sc.nextLine().split(",");
				// System.out.println(Arrays.toString(line4));
				System.out.println(heap.isMaxHeap(line4));
				break;
				case "Integer" :
				Heap<Integer> heap1 = new Heap<Integer>();
				String[] line1 = sc.nextLine().split(",");
				Integer[] intea = new Integer[line1.length];
				for (int v = 0; v < line1.length; v++) {
					intea[v] = Integer.parseInt(line1[v]);
				}
				// System.out.println(intea);
				System.out.println(heap1.isMaxHeap(intea));
				break;
				case "Float" :
				Heap<Float> heap2 = new Heap<Float>();
				String[] line2 = sc.nextLine().split(",");
				if (line2[0] == null) {
					System.out.println("false");
					break;
				}
				Float[] floata = new Float[line2.length];
				for (int j = 0; j < line2.length; j++) {
					floata[j] = Float.parseFloat(line2[j]);
				}
				// System.out.println(Arrays.toString(floata));
				System.out.println(heap2.isMaxHeap(floata));
				break;
				case "Double" :
				Heap<Double> heap3 = new Heap<Double>();
				String[] line3 = sc.nextLine().split(",");
				Double[] doublea = new Double[line3.length];
				for (int k = 0; k < line3.length; k++) {
					doublea[k] = Double.parseDouble(line3[k]);
				}
				// System.out.println(Arrays.toString(doublea));
				System.out.println(heap3.isMaxHeap(doublea));
				break;

			}

		}
	}
}
class Heap<key extends Comparable<key>> {
	// key[] array1;
	Heap() {

	}
	boolean isMaxHeap(key[] array) {
		// System.out.println("**********************");
		// System.out.println(Arrays.toString(array));
		// key[] array1 = (key[])new  Comparable[array.length+1];
		// int j = 0;
		// for (int i = 0; i < array.length; i++) {
		// 	array1[j+1] = array[i];
		// }
		if (array.length == 0) {
			return false;
		}
		int count = 0; 
		for (int i = array.length-1; i >= 0; i--) {
			int k = (i/2);
			if (less(array[i], array[k])) {
				count++;
			}
		}
		if (count != array.length - 1) {
			return false;
		}else {
			return true;
		}
	}
	boolean less(key a, key b) {
		// System.out.println(a, "---------", b);
		// System.out.println(a.compareTo(b));
		return a.compareTo(b) > 0;
	}
}


