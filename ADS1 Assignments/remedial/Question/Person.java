public class Person implements Comparable<Person>{
	private int rid;
	private int jid;
	Person(int r, int s) {
		this.rid = r;
		this.jid = s;
	}
	int getRid() {
		return this.rid;
	}
	int getJid() {
		return this.jid;
	}
	public String toString(){
		String str = "";
		str += this.rid + ", "+this.jid;
		return str;
	}
	public int compareTo(Person that) {
		if (this.rid < that.rid) {
			return 1;
		}
		if (this.rid > that.rid) {
			return -1;
		}
		if (this.jid < that.jid) {
			return 1;
		}
		if (this.jid > that.jid) {
			return -1;
		}
		return 0;
	}
}