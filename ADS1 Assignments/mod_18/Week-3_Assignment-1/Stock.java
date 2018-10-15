class Stock implements Comparable<Stock> {
	public String name;
	public Float percent;
	Stock(String name, Float f) {
		this.name = name;
		this.percent = f;
	}
	String getName() {
		return this.name;
	}
	public int compareTo(Stock s) {
		if (this.percent > s.percent) {
			return 1;
		} else if (this.percent < s.percent) {
			return -1;
		} else {
			if (this.name.compareTo(s.name) > 0) {
				return 1;
			} else {
				return -1;
			}
		}
	}
	public String toString() {
		String str = "";
		str += this.name+" "+this.percent;
		return str;
	}
}