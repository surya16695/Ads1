class Person implements Comparable<Person>{
	int rId;
	int jId;
	int num = 0;

	Person(int rId, int jId) {
		this.rId = rId;
		this.jId = jId;
	}

	public String toString() {
		String ret = (this.rId+","+this.jId);
		return ret;
	}

	public int compareTo(Person that) {
		if(this.num > that.num) {
			return 1;
		}
		else if(this.num < that.num) {
			return -1;
		}
		else {
			if(this.rId > that.rId) {
				return 1;
			}
			return -1;

		}
	}
}