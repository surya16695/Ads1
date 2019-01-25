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
		List list1 = new List();
		List list2 = new List();
		int count = 0;
		for (int a = 0; a < 9 ; a++) {
			if (tree[a].contains(word)) {
				String[] as = tree[a].get(word).split(" ");
				// System.out.println(as);
				finalst.put(a, as);
				list1.add(as.length);
				list2.add(a);
				// toString(a,as);
			} else {
				count++;	
			}

		}
		if (count == 9) {
			System.out.println("word is not present in any file");
			
		}
		// list1.soRt();
		// System.out.println(list1);
		// System.out.println(list.size());
		String answer = "";
		int ansnum = 0;
		for (int b = 0; b <= list1.size(); b++) {
			if (finalst.contains(list2.get(b))) {
				answer += toString(list2.get(b), finalst.get(list2.get(b)))+"\n";
				ansnum += finalst.get(list2.get(b)).length;
			}
		}
		System.out.println(word+":"+ansnum);
		System.out.println(answer);
	}

	public static String toString(int b, String[] arr) {
		String s = "";
		s += b+", "+arr.length+", "+Arrays.toString(arr);
		// System.out.println(s);
		return s;
	}

}

