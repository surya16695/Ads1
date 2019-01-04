class Person implements Comparable<Person>{
	int registration;
	int section;
	int value = 0;
	
	Person(int registration, int section) {
		this.registration = registration;
		this.section = section;
	}

	public String toString() {
		String ret = (this.registration+","+this.section);
		return ret;
	}

	public int compareTo(Person that) {
		if(this.value > that.value) {
			return 1;
		}
		else if(this.value < that.value) {
			return -1;
		}
		else {
			if(this.registration > that.registration) {
				return 1;
			}
			return -1;

		}
	}
}