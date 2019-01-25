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
		ST<Integer, String[]> finalst = new ST<Integer, String[]>();
		List list = new List();
		int x= 0;
		for (int a = 0; a < 9 ; a++) {
			int count = 0;
			if (tree[a].contains(word)) {
				String[] as = tree[a].get(word).split(" ");
				finalst.put(a, as);
				list.add(a);
				x++;
				// toString(a,as);
				count++;	
			}

		}
		System.out.println(word+":");
		list.soRt();
		String answer = "";
		for (int b = 0; b < list.size(); b++) {
			if (finalst.contains(list.get(b))) {
				answer += toString(list.get(b), finalst.get(list.get(b)))+"\n";
			}
		}
	}

	public static String toString(int b, String[] arr) {
		String s = "";
		s += b+", "+arr.length+", "+Arrays.toString(arr);
		// System.out.println(s);
		return s;
	}

}
