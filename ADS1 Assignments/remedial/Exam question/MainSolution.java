import java.util.*;
import java.io.*;

class DataGiven {
	int docId;
	int frequency;
	String position;
	DataGiven(int id, int b, String arr) {
		this.docId = id;
		this.frequency = b;
		this.position = arr;
	}
	String getPostion() {
		return this.position;
	}

	int getWord() {
		return this.docId;
	}

	int getfreq() {
		return this.frequency;
	}
	int compareTo(int numb){
		if (this.docId>numb) {
			return 1;
		} if (this.docId<numb) {
			return -1;
		}
		return 0;
	}
	public void  pRint() {
		String[]array = this.position.split(" ");
		String sr = "";
		sr += this.docId+", "+this.frequency+", "+Arrays.toString(array);
		System.out.println(sr);
	}
}


class PositionId {
	int totalfreq;
	LinkedList<DataGiven> list;
	PositionId(int freq, LinkedList<DataGiven> l) {
		this.totalfreq = freq;
		this.list = l;
	}
	int getTotalfreq() {
		return this.totalfreq;
	}
	LinkedList<DataGiven> getList() {
		return this.list;
	}
	void setList(DataGiven d) {
		list.add(d);
	}
	void setTotal(int a ){
		totalfreq += a; 
	}
	public int compareTo( int num) {
		if(this.totalfreq > num) {
			return 1;
		} if(this.totalfreq < num) {
			return -1;
		}
		return 0;
	}
	public void  outPut() {
		for (int i = 0; i < list.size(); i++) {
		 	list.get(i).pRint();
		 } 
	}
}

class Program {
	Program() {

	}
	SeparateChainingHashST<String, PositionId> loadWords() throws Exception {
		SeparateChainingHashST<String, PositionId> st= new SeparateChainingHashST<>();

		for (int i = 0; i < 9; i++) {

			Scanner s = new Scanner(new File("files/"+ i + ".txt"));

			String[] str = s.nextLine().split(" ");


			for (int j = 0; j < str.length; j++) {

				int totalcount = 0;

				String stri = "";

				for (int k = 0; k < str.length; k++) {

					if (str[j].equals(str[k]) ) {

						stri += k + " ";
						// x++;
					}
					
				}
				int count = stri.length();
				DataGiven data = new DataGiven(i, count, stri);

				if (st.contains(str[j])) {
					st.get(str[j]).setTotal(data.getfreq());
					st.get(str[j]).list.add(data);

				} else {
					LinkedList<DataGiven> diList = new LinkedList<>();
					diList.add(data);
					PositionId pi = new PositionId(totalcount, diList);
					pi.setTotal(data.getfreq());
					st.put(str[j], pi);
				}
			}
		}
		return st;
	}
}

class MainSolution {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Program pr = new Program();
		if (pr.loadWords().contains(s)) {
			System.out.println(s+":"+pr.loadWords().get(s).getTotalfreq());
			pr.loadWords().get(s).outPut();
		}
		else {
			System.out.println("word is not present in any file");
		}
	}
}

