import java.util.*;
import java.io.*;

class Solution {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		ST<String, String>[] tree = new ST[9];
		for (int i = 0; i < 9; i++) {
			Scanner s = new Scanner(new File("files/"+ i + ".txt"));
			ST<String, String> st = new ST<String, String>();
			String[] str = s.nextLine().split(" ");
			// System.out.println(Arrays.toString(str));
			for (int j = 0; j < str.length; j++) {
				// int x = 0;
				// Integer[] ind = new Integer[10];
				String stri = "";
				for (int k = 0; k < str.length; k++) {
					if (str[j].equals(str[k]) ) {
						stri += k + " ";
						// x++;
					}
					
				}
				st.put(str[j], stri);
			}
			tree[i] = st;
		}
		// System.out.println(Arrays.toString(tree));
		for (int a = 0; a < 9 ; a++) {
			int count = 0;
			if (tree[a].contains(word)) {
				String[] as = tree[a].get(word).split(" ");
				toString(a,as);
				count++;	
			}
		}
	}

	public static void toString(int b, String[] arr) {
		String s = "";
		s += b+", "+arr.length+", "+Arrays.toString(arr);
		System.out.println(s);
	}

}

