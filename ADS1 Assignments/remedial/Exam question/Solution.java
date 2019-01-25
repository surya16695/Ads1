import java.util.*;
import java.io.*;

class Solution {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		ST<String, Integer[]>[] tree = new ST[9];
		for (int i = 0; i < 9; i++) {
			Scanner s = new Scanner(new File("files/"+ i + ".txt"));
			ST<String, Integer[]> st = new ST<String, Integer[]>();
			String[] str = s.nextLine().split(" ");
			// System.out.println(Arrays.toString(str));
			for (int j = 0; j < str.length; j++) {
				Integer[] ind = new Integer[str.length];
				int x = 0;
				for (int k = j; k < str.length; k++) {
					if (str[j].equals(str[k]) ) {
						ind[x] = j;
						x++;
					}
					
				}
				st.put(str[j], ind);
			}
			tree[i] = st;
		}
		// System.out.println(Arrays.toString(tree));
		for (int a = 0; a < 9 ; a++) {
			int count = 0;
			if (tree[a].contains(word)) {
				Integer[] as = tree[a].get(word);
				toString(a,as);
				count++;	
			}
		}
	}

	public static void toString(int b, Integer[] arr) {
		String s = "";
		s += b+", "+arr.length+", "+Arrays.toString(arr);
		System.out.println(s);
	}

}

